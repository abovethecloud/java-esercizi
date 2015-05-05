package server;

import java.io.IOException;
import java.net.Socket;

/**
 * Generico servizio
 * 
 * TODO: Rivedere Javadoc
 * 
 * @author Claudio
 * 
 */
public interface IService {

	/**
	 * TODO: fissare il 'filename', sostituirlo con il componente
	 * 'RichiestaHttp'.
	 * 
	 * Non ha molto senso dichiarare il lancio di una FileNotFoundException,
	 * perché non è detto che ogni richiesta abbia a che fare con i file. Ha
	 * invece senso mantenere il lancio dell'eccezione IOException (che è anche
	 * classe padre della FileNotFound).
	 */
	public void sendHTTP(final Socket clientSocket, HttpRequest request)
			throws IOException;

}
