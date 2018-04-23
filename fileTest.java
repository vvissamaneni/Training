package zzzTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileTest {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\test.txt");
		FileReader fr = new FileReader(f);

		BufferedReader bufferedReader = new BufferedReader(fr);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}

		// Always close files.
		bufferedReader.close();
	}
}
