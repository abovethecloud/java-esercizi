package loading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class can load informations from a file. The informations are
 * constructed and loaded in an abstract way, by calling a specific
 * {@link Interpreter}
 * 
 * @author simone
 *
 */
public class FileLoader {

	private Interpreter interpreter;
	private File file;

	/**
	 * Create a new istance of this class
	 * 
	 * @param interpreter
	 *            : the concrete interpreter to use for information loading
	 * @param pathName
	 *            : the pathname of the file to extract information from
	 */
	public FileLoader(Interpreter interpreter, String pathName) {
		super();
		this.interpreter = interpreter;
		this.file = new File(pathName);
	}

	/**
	 * Load the file
	 * 
	 * @throws IOException
	 */
	public void loadFile() throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader(file));

		String line;
		while ((line = reader.readLine()) != null) {
			this.interpreter.interpret(line);
		}

		reader.close();
	}

	/**
	 * Returns the file this loader is extracting informations from
	 * 
	 * @return
	 */
	public File getFile() {
		return file;
	}

}
