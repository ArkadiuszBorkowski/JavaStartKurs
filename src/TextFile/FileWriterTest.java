package TextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args)  {

        String fileName = "testFile.txt";   //definiuje nazwe pliku


        try (
            FileWriter fileWriter = new FileWriter(fileName, true   );
            BufferedWriter writer = new BufferedWriter(fileWriter);
             )
        {

            writer.write("Mercedes");
            writer.newLine();
            writer.write("Ferrari");
            writer.newLine();
            writer.write("Fiat");
            writer.newLine();

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
