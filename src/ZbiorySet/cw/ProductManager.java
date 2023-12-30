package ZbiorySet.cw;

import ZbiorySet.cw2.Product;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class ProductManager {
    private static final int ADD_PRODUCT = 0;
    private static final int EXIT = 1;

    private static final int DISCARD_PRODUCT = 0;
    private static final int REPLACE_PRODUCT = 1;

    Set<ZbiorySet.cw2.Product> products = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    private void printOptions() {
        System.out.println("Dostępne opcje:");
        System.out.println("Dodanie nowego produktu: " + ADD_PRODUCT);
        System.out.println("Koniec programu: " + EXIT);
    }

    void mainLoop() {
        int option;
        do {
            printOptions();
            option = readOption();
            evaluateOption(option);
        } while (option != EXIT);
    }

    private void evaluateOption(int option) {
        if (option == ADD_PRODUCT )
            addNextProduct();
        else if (option ==  EXIT)
            printProducts();
        else
            System.out.println("Nieznana opcja");
    }

    private void printProducts() {
        for (ZbiorySet.cw2.Product product : products) {
            System.out.println(product);
        }
    }

    private void addNextProduct() {
        ZbiorySet.cw2.Product product = createProduct();

        if (products.contains(product)) {
            askAndReplaceProduct(product);
        } else {
            addProducts(product);
        }
    }

    private void askAndReplaceProduct(ZbiorySet.cw2.Product product) {
        System.out.println("Znaleziono produkt o takiej nazwie, wybierz co chcesz zrobić");
        System.out.println(" > Zignoruj produkt - " + DISCARD_PRODUCT);
        System.out.println(" > Nadpisz produkt - " + REPLACE_PRODUCT);
        int option = readOption();
        scanner.nextLine();
        if (option == REPLACE_PRODUCT) {
            products.remove(product);
            addProducts(product);
        } else {
            System.out.println(" W bazie pozostawiono poprzedni produkt");
        }
    }

    private void addProducts(ZbiorySet.cw2.Product product) {
        products.add(product);
    }


    private ZbiorySet.cw2.Product createProduct() {

        try {
            System.out.println("Podaj nazwę produktu");
            String name = scanner.nextLine();

            System.out.println("Podaj cenę produktu");
            double price = scanner.nextDouble();
            ZbiorySet.cw2.Product product = new Product(name, price);
            return product;
        } catch (InputMismatchException e) {
            System.err.println("Nieprawidłowy format ceny");
        }
        return null;
    }

    private int readOption() {
        try {
            int option = scanner.nextInt();
            scanner.nextLine();
            return option;
        } catch (InputMismatchException e) {
            System.err.println("Nieprawidłowy format");
        }
        return 0;
    }
}
