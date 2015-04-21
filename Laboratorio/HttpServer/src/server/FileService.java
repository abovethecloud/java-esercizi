package server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;

public class FileService implements IService {

	public void sendHTTP(final Socket clientSocket, HttpRequest request)
			throws IOException, FileNotFoundException {
		
		String filename = checkURI(request.getUri());
		
		HttpMessage message = new HttpMessage();
		message.openHttpAnswer(clientSocket);
		copyFile(filename, message.getOut());
		message.closeHttpRequest();
	}

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
	 * Controlla se il file è presente nella cartella del file,
	 * altrimenti restituisce error.html
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
