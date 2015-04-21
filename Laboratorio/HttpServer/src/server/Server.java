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

	public static final int PORT = 4444;
	
	public static void main(String[] args) {
		
		try {
			ServerSocket socket=new ServerSocket(PORT);

			while(true){

				final Socket clientSocket = socket.accept();
			
				Runnable runnable=new Runnable() {
					@Override
					public void run() {

						try {
							String uri = loadHTTPRequest(clientSocket);
							
							String filename = checkURI(uri);
							
							System.err.println(filename);
							if(filename.equals("web/books02.html")){
								(new BooksService()).sendHTTP(clientSocket, filename);
							}else {
								sendHTTP(clientSocket, filename);
							}
							
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
						OutputStreamWriter out = new 
							OutputStreamWriter(
									clientSocket.getOutputStream(),
									Charset.forName("UTF-8").newEncoder()
							);
						out.write("HTTP/1.1 200 OK\n");
						out.write("Date: Tue, 17 Mar 2014 14:47:00\n");
						out.write("Content-Type: text/html; charset=utf-8\n");
						out.write("\n");
							copyFile(filename, out);
						out.write("\n");
						
						out.close();
					}

					private void copyFile(String filename,
							OutputStreamWriter out)
							throws FileNotFoundException, IOException {
						BufferedReader fileReader=new BufferedReader(
							new FileReader(filename)
						);
						String fileLine=fileReader.readLine();
						while(fileLine!=null){
							out.write(fileLine+"\n");
							fileLine=fileReader.readLine();
						}
					}

					private String checkURI(String uri) {
						String filename="web"+uri;
//							File webFolder=new File("web");
//							File[] files=webFolder.listFiles();
//							boolean found=false;
//							for (int i = 0; i < files.length; i++) {
//								if(files[i].getName().endsWith(filename)){
//									found=true;
//								}
//							}
//							if(!found){
//								filename="web/error.html";
//							}
						File file=new File(filename);
						if(!file.exists()){
							filename="web/error.html";
						}
						return filename;
					}

					private String loadHTTPRequest(final Socket clientSocket)
							throws IOException {
						BufferedReader in = new BufferedReader(
							new InputStreamReader(
									clientSocket.getInputStream()
							)	
						);
						String line = in.readLine();
						String[] lineElements=line.split(" ");
						String uri=lineElements[1];
						LinkedList<String> lines=new LinkedList<String>();
						while(line!=null){
							//System.out.println(line);
							lines.add(line);
							line = in.readLine();
							if(line.length()==0){
								line=null;
							}
						}
						return uri;
					}
				};
				Thread thread=new Thread(runnable);
				thread.start();

			}
			
			//socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
