package CompareComparator.cw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OfferReader {

    Offer[] readOffers (String fileName) {
        Offer[] offers = new Offer[10];
        int counter = 0;

        try (
                Scanner scanner = new Scanner(new File(fileName))
        ) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                offers[counter] = createOfferFromString(scanner.nextLine());
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("nie znaleziono pliku");
        }
        return offers;
    }

    private static Offer createOfferFromString (String line) {
        String[] data = line.split(";");
        String city = data[0];
        double price  = Double.parseDouble(data[1]);
        double area = Double.parseDouble(data[2]);
        return new Offer(city, price, area);
    }


}
