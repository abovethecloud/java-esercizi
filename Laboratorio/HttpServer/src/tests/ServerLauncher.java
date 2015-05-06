package tests;

import server.Server;
import server.services.BooksService;

/**
 * This class is a test for the server model. The tested services are
 * FileService (default), that sends an HTML or XML file, and BooksService, that
 * lists the books in books02.html
 * 
 * @author claudio
 *
 */
public class ServerLauncher {

	public static final int PORT = 4444;

	public static void main(String[] args) {

		Server server = new Server(PORT);

		// TODO: in realtà vorremo poter utilizzare una stringa generica
		server.addService("/books", new BooksService());

		server.launch();

	}
}
