package Read.Write.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteFile{
	
public static void main(String[] args) throws IOException {
	
	ReadWriteFile obj1 = new ReadWriteFile();
	obj1.ReadFromFile();
	
	
}




public void ReadFromFile() throws IOException {

	

		/*
		 * FileReader is meant for reading streams of characters. For reading streams of
		 * raw bytes, consider using a FileInputStream.
		 */
		FileReader fileReader = new FileReader("D:\\bunny.txt");

		/*
		 * BufferedReader reads text from a character-input stream, buffering characters
		 * so as to provide for the efficient reading of characters, arrays, and lines.
		 */
		BufferedReader bufferReader = new BufferedReader(fileReader);

		String textfromfile = null;
		{
			// Using while loop to read the file until there are no more lines
			while ((textfromfile = bufferReader.readLine()) != null) {
				System.out.println(textfromfile);
			}
			fileReader.close();
			// Close the BufferedReader object to prevent memory leak
			bufferReader.close();
		}
	}
}
