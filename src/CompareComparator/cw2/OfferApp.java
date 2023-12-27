package CompareComparator.cw2;

import java.util.Arrays;

public class OfferApp {
    public static void main(String[] args) {

        OfferReader offerReader = new OfferReader();
        try {
            Offer[] offers = offerReader.readOffers("offesrs.csv");
            Arrays.sort(offers);
            printOffers(offers);
        } catch (NullPointerException e) {
        }
    }

    static void printOffers (Offer[] offers) {
        for (Offer offer : offers) {
            System.out.println(offer);
        }
    }
}
