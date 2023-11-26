package TextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class FileCreator {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "testFile2.txt";   //definiuje nazwe pliku
        File file = new File(fileName);     // sprawdzenie czy taki plik istnieje --> potrzeba utworzyć obiekt file


        boolean fileExists = file.exists();// sprawdzamy czy plik istnije
        System.out.println(fileExists);
        System.out.println(!fileExists);
        if (fileExists = false) {              // jeśli nie istnieje - tworzymy plik
            try {
                boolean newFile = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(fileExists) {
            System.out.println("Plik " + fileName + " istnieje lub został utworzony");
        }

    }
}
