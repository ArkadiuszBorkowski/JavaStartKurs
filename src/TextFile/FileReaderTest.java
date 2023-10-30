package TextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderTest {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "testFile.txt";   //definiuje nazwe pliku
        File file = new File(fileName);     // sprawdzenie czy taki plik istnieje --> potrzeba utworzyć obiekt file

        Scanner scanner = new Scanner(file);
        int lines = 0;
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            lines++;
        }

        System.out.println("liczba wierszy w pliku: " + lines);
        scanner.close();

    }
}
