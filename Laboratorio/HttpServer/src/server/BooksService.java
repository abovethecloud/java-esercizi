package server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;

public class BooksService {

	public void sendHTTP(final Socket clientSocket,
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

	public void copyFile(String filename,
			OutputStreamWriter out)
			throws FileNotFoundException, IOException {
		BufferedReader fileReader=new BufferedReader(
			new FileReader(filename)
		);
		String fileLine=fileReader.readLine();
		while(fileLine!=null){
			if(fileLine.trim().equals("$LIBRERIA_LIBRI$")){
				
				out.write("<div style=\"background-color:#aaa;width:400px;margin:30px;\">");
				out.write("<h2 style=\"background-color:#ddd;\">Harry Potter</h2>");
				out.write("<b>J K. Rowling</b> <br/>");
				out.write("Prezzo : 29.99 <br/>");
				out.write("Anno : 2005 <br/>");
				out.write("</div>");
				
			}else{
				out.write(fileLine+"\n");
			}
			fileLine=fileReader.readLine();
		}
	}
}
