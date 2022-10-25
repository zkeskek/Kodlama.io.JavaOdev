import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		readFile();
		writeFile();
		readFile();
		

	}

	public static void createFile() {
		File file = new File(
				"C:\\Users\\trsiv_\\Desktop\\JavaOdev\\3. Ders Odevleri\\workingWithFiles\\files\\students.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("Dosya oluşturuldu");
			} else {
				System.out.println("Dosya zaten mevcut");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getFileInfo() {
		File file = new File(
				"C:\\Users\\trsiv_\\Desktop\\JavaOdev\\3. Ders Odevleri\\workingWithFiles\\files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya adı : " + file.getName());
			System.out.println("Dosya adı : " + file.getAbsolutePath());
			System.out.println("Dosya yazılabilirmi : " + file.canWrite());
			System.out.println("Dosya okunabilirmi : " + file.canRead());
			System.out.println("Dosya boyutu (byte) : " + file.length());

		}
	}

	public static void readFile() {
		File file = new File(
				"C:\\Users\\trsiv_\\Desktop\\JavaOdev\\3. Ders Odevleri\\workingWithFiles\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void writeFile() {
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\trsiv_\\Desktop\\JavaOdev\\3. Ders Odevleri\\workingWithFiles\\files\\students.txt",true));
			writer.newLine();
			writer.write("Ahmet");
			System.out.println("Dosyaya yazıldı");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
