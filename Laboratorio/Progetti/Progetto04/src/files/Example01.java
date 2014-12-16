package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter(new File("numbers.txt"));

			for (int i = 0; i < 10; i++) {

				writer.write(i + "\n"); // Attenzione, che io voglio stampare
										// una
										// stringa, quindi NON DEVO PASSARE
										// L'INTERO. Devo usare questo metodo.

			}

			writer.close(); // La close() è indispensabile per un file, perché è
							// ciò che mi permette di salvare le modifiche al
							// file. Se non la uso, le modifiche restano in RAm
							// e ciao ciao

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("numbers.txt")));

			String line = reader.readLine();
			while (line != null) {

				System.out.println(line);
				line = reader.readLine();

			}

			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
