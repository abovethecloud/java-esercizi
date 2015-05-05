package server;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * Le chiamate a 'openHttpAnswer' devono sempre essere seguite da chiamate a
 * closeHttpAnswer
 * 
 * @author cl410940
 * 
 */
public class HttpMessage {

	// This enum contains all the possible content types of the response
	public enum ContentType {
		HTML("text/html"),
		XML("text/xml");
		
		private String text;

		private ContentType(String text) {
			this.text = text;
		}
	}

	private ContentType contentType = ContentType.HTML;
	private OutputStreamWriter out;

	public void openHttpAnswer(Socket clientSocket) throws IOException {

		this.out = new OutputStreamWriter(clientSocket.getOutputStream(),
				Charset.forName("UTF-8").newEncoder());
		out.write("HTTP/1.1 200 OK\n");
		out.write("Date: Tue, 17 Mar 2014 14:47:00\n");
		out.write("Content-Type: "+contentType.text+"; charset=utf-8\n");
		out.write("\n");
		
	}
	
	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}

	public void closeHttpRequest() throws IOException {
		out.write("\n");
		out.close();
	}

	public OutputStreamWriter getOut() {
		return out;
	}

}
