package server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import server.HttpMessage.ContentType;

public class FileService implements IService {

	/**
	 * This method checks if the URI is valid and then answers the HTTP request,
	 * accordingly to the type of content.
	 */
	public void sendHTTP(final Socket clientSocket, HttpRequest request)
			throws IOException, FileNotFoundException {

		String filename = checkURI(request.getUri());
		HttpMessage message = new HttpMessage();

		// TODO: This clearly isn't a versatile way to handle the various
		// formats. Must generalize for many (interface..?)
		if (filename.endsWith("xml")) {
			message.setContentType(ContentType.XML);
		}

		// Answers the HTTP request sending the requested file
		message.openHttpAnswer(clientSocket);
		copyFile(filename, message.getOut());
		message.closeHttpRequest();
	}

	/**
	 * Copies the requested file on the output stream.
	 * 
	 * @param filename
	 *            The name of the requested file
	 * @param out
	 *            The OutputStreamWriter
	 * @throws FileNotFoundException
	 *             When the FileReader cannot find a file corresponding to
	 *             filename
	 * @throws IOException
	 *             When something goes wrong while reading from file or writing
	 *             to the OutputStream
	 */
	private void copyFile(String filename, OutputStreamWriter out)
			throws FileNotFoundException, IOException {

		BufferedReader fileReader = new BufferedReader(new FileReader(filename));
		String fileLine = fileReader.readLine();
		while (fileLine != null) {
			out.write(fileLine + "\n");
			fileLine = fileReader.readLine();
		}

	}

	/**
	 * Controlla se il file è presente nella cartella del file, altrimenti
	 * restituisce error.html
	 * 
	 * @param uri
	 * @return
	 */
	private String checkURI(String uri) {
		String filename = "web" + uri;
		// File webFolder=new File("web");
		// File[] files=webFolder.listFiles();
		// boolean found=false;
		// for (int i = 0; i < files.length; i++) {
		// if(files[i].getName().endsWith(filename)){
		// found=true;
		// }
		// }
		// if(!found){
		// filename="web/error.html";
		// }
		File file = new File(filename);
		if (!file.exists()) {
			filename = "web/error.html";
		}
		return filename;
	}
}
