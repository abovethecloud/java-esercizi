package server;

import java.io.BufferedReader;
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
	 * Definiamo questo numero di porta perché non possiamo utilizzare la porta
	 * 80 sia come server che come client sulla stessa macchina
	 */
	public static final int PORT = 4444;

	public static void main(String[] args) {

		
		try {
			/* Questo comando inizializza un server socket */
			ServerSocket socket = new ServerSocket(PORT);
			
			/* Il primo client che si connette al socket sblocca quest'istruzione, e permette la continuazione dell'esecuzione */
			Socket clientSocket = socket.accept();
			
			
			// ACCETTO LA RICHIESTA
			
			/* clientSocket.getInputStream() : recupera lo stream di byte in arrivo via TCP sul Socket clientSocket
			 * InputStreamReader(...) : Noi stiamo reinterpretando la richiesta come input testuale (invece che come dati puri)
			 * BufferReader(...) : cerca i caratteri di "a capo" e crea una stringa per ogni stringa di testo che trova nel file
			 * 
			 * In pratica recuperiamo l'elenco delle stringhe inviate dal client */
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			/* Assegnamo ad una stringa la prima stringa restituita da in */
			String line = in.readLine();
			
			/* Creo una lista che mi salvi le stringhe successive della richiesta */
			LinkedList<String> lines = new LinkedList<String>();
			
			while(line != null) {
				System.err.println(line);
				lines.add(line);
				line = in.readLine();
				
				/* La readLine() ha un difetto: non si rende conto che il file è finito, e continuerebbe a restituire stringhe vuote. In realtà blocca Risolvo con un if */
				if(line.length()==0)
					line = null;
			}
			
			
			// RISPONDO ALLA RICHIESTA
			
			/* Creo lo stream di byte da inviare in risposta al client attraverso il Socket clientSocket. Specifichiamo anche la nuova codifica in UTF-8 */
			OutputStreamWriter out = new OutputStreamWriter(clientSocket.getOutputStream(), Charset.forName("UTF-8").newEncoder());
			
			out.write("HTTP/1.1 200 OK\n");
			out.write("Date: Tue, 17 Mar 2015 14:48:00\n");
			out.write("Content-Type: text/html; charset=utf-8\n");
			out.write("\n");

				// Lo standard HTTP impone di mettere il contenuto della pagina tra i due "a capo":
				BufferedReader fileReader = new BufferedReader(new FileReader("web/index01.html"));
				String fileLine = fileReader.readLine();
				while ( fileLine != null ) {
					out.write(fileLine+"\n");
					fileLine=fileReader.readLine();
				}
				
			out.write("\n");
			
			
			
			// CHIUSURE
			
			/* NON DEVO chiudere lo stream imput aperto */
		//	in.close();
			/* Chiudo lo stream output aperto */
			out.close();
			/* */
			clientSocket.close();
			/* Chiudo il socket ancora aperto */
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
