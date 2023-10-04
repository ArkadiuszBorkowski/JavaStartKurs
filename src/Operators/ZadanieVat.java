package Operators;

import java.util.Scanner;

public class ZadanieVat {

    public static void main(String[] args) {
        double netto;
        double brutto;
        final double vat = 0.23;



        Scanner input = new Scanner(System.in);

        System.out.println("Podaj cenę netto:");
        netto = input.nextDouble();
        brutto = netto + (netto * vat);

        System.out.println("Przy stawce Vat równej " + vat + " kwota brutto towaru wynosi " + brutto);
    }


}
