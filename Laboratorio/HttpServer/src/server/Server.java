package server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.LinkedList;

public class Server {

	/*
	 * Definiamo questo numero di porta perch√© non possiamo utilizzare la porta
	 * 80 sia come server che come client sulla stessa macchina
	 */
	public static final int PORT = 4444;

	public static void main(String[] args) {

		try {
			/* Questo comando inizializza un server socket */
			ServerSocket socket = new ServerSocket(PORT);

			while (true) {

				/* Il primo client che si connette al socket sblocca quest'istruzione, e permette la continuazione dell'esecuzione */
				final Socket clientSocket = socket.accept();

				Runnable runnable = new Runnable() {
					@Override
					public void run() {

						try {
							// Verifica richiesta HTTP
							String uri = loadHTTPRequest(clientSocket);
							
							// Estrapola il nome del file richiesto (percorso locale)
							String filename = checkURI(uri);

							// Manda al client lo stream HTTP richiesto, contenente il file richiesto
							sendHTTP(clientSocket, filename);
							
							clientSocket.close();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					private void sendHTTP(final Socket clientSocket,
							String filename) throws IOException,
							FileNotFoundException {
						OutputStreamWriter out = new OutputStreamWriter(
								clientSocket.getOutputStream(), Charset
										.forName("UTF-8").newEncoder());

						out.write("HTTP/1.1 200 OK\n");
						out.write("Date: Tue, 17 Mar 2014 14:47:00\n");
						out.write("Content-Type: text/html; charset=utf-8\n");
						out.write("\n");
						
							copyFileOnOutStream(filename, out);
						
						out.write("\n");

						out.close();
					}

					private void copyFileOnOutStream(String filename, OutputStreamWriter out) throws FileNotFoundException, IOException {
						
						// RISPONDO ALLA RICHIESTA
						
						/* Creo lo stream di byte da inviare in risposta al client attraverso il Socket clientSocket. Specifichiamo anche la nuova codifica in UTF-8 */
						/* Mando il contenuto della pagina (il file .html) tra gli "a capo", come previsto dal protocollo HTTP */
						BufferedReader fileReader = new BufferedReader(
								new FileReader(filename));
						String fileLine = fileReader.readLine();
						while (fileLine != null) {
							out.write(fileLine + "\n");
							fileLine = fileReader.readLine();
						}
					}

					private String checkURI(String uri) {
						// Costruisco il percorso del file all'interno del mio progetto Server
						String filename = "web"+uri;
						
						// Brutta soluzione
//							File webFolder = new File("web");
//							File[] files = webFolder.listFiles();
//							
//							boolean found = false;
//							for (int i = 0; i < files.length; i++) {
//								if (files[i].getName().endsWith(filename)) {
//									found = true;
//								}
//							}
//							if (!found) {
//								filename = "web/error.html";
//							}
						
						// Soluzione pi√π semplice
						File file = new File(filename);
						if(!file.exists()) {
							filename = "web/error.html";
						}
						return filename;
					}

					private String loadHTTPRequest(final Socket clientSocket) throws IOException {
						
						/* clientSocket.getInputStream() : recupera lo stream di byte in arrivo via TCP sul Socket clientSocket
						 * InputStreamReader(...) : Noi stiamo reinterpretando la richiesta come input testuale (invece che come dati puri)
						 * BufferReader(...) : cerca i caratteri di "a capo" e crea una stringa per ogni stringa di testo che trova nel file
						 * 
						 * In pratica recuperiamo l'elenco delle stringhe inviate dal client */
						BufferedReader in = new BufferedReader(
								new InputStreamReader(
										clientSocket.getInputStream()));

						/* Assegnamo ad una stringa la prima stringa restituita da in */
						String line = in.readLine();
						
						String[] lineElements = line.split(" ");
						String uri = lineElements[1];

						LinkedList<String> lines = new LinkedList<String>();
						while (line != null) {
							System.out.println(line);
							lines.add(line);
							line = in.readLine();
							
							/* La readLine() ha un difetto: non si rende conto che il file √® finito, e continuerebbe a restituire stringhe vuote. In realt√† blocca Risolvo con un if */

							if (line.length() == 0) {
								line = null;
							}
						}
						return uri;
					}
				};
				
				/* Il thread genera un processo parallelo per lo stesso programma che consente l'esecuzione parallela
				 * Thread Ë un oggetto generico che a seconda delle circostaze Ë in grado di evocare una diverso processo.
				 * Per far funzionare uiil thread abbiamo bisogno dunque di un'interfaccia: Runnable. Ë un'applicazione del
				 * Design Pattern Command (simile al Bridge), per astrarre sull'operazione concreta da eseguire.*/
				Thread thread = new Thread(runnable);
				thread.start();

			}

			// socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
