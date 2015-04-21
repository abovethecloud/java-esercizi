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

public class ServerLauncher {

	public static final int PORT = 4444;
	
	public static void main(String[] args) {
		
		Server server = new Server(PORT);
		
		// TODO: in realtà vorremo poter utilizzare una stringa generica
		server.addService("/books", new BooksService());
		
		server.launch();
		
	}
}
