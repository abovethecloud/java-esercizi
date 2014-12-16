package files.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {

	private String filename;
	private ILineLoader lineLoader;
	
	
	public FileLoader(ILineLoader lineLoader ,String filename) {
		super();
		this.filename = filename;
		this.lineLoader = lineLoader;
	}

	public void loadFile() {
		try {
			BufferedReader reader=new BufferedReader(
					new FileReader(new File(filename)));
			
			String line=reader.readLine();
			while(line!=null){
				lineLoader.loadLine(line);
				
				line=reader.readLine();
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}