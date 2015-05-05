package server;


public class ServerLauncher {

	public static final int PORT = 4444;
	
	public static void main(String[] args) {
		
		Server server = new Server(PORT);
		
		// TODO: in realtà vorremo poter utilizzare una stringa generica
		server.addService("/books", new BooksService());
		
		server.launch();
		
	}
}
