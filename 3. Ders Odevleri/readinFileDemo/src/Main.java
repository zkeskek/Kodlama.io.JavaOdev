
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new FileReader("C:\\Users\\trsiv_\\Desktop\\JavaOdev\\3. Ders Odevleri\\readinFileDemo\\src"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}

	}

}
