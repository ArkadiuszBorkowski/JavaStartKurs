package Mapy.cw2;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

class ProductManager {
    public static void main(String[] args) {
        try {
            Map<String, TreeSet<Product>> productsMap = ProductImporter.readFile("products.csv");
            String category = readCategoryFromUser();
            printCategoryStats(productsMap, category);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku z danymi produktów");
        }
    }

    private static String readCategoryFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kategorii dla wyświetlenia statystyk:");
        return scanner.nextLine();
    }

    private static void printCategoryStats(Map<String, TreeSet<Product>> productsMap, String category) {
        TreeSet<Product> products = productsMap.get(category);
        if (products == null)
            System.out.println("Brak produktów w danej kategorii");
        else  {
            printAll(products);
            printAvgPrice(products);
            printCheapestAndExpensiveProduct(products);
        }
    }

    private static void printAll(TreeSet<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void printAvgPrice(TreeSet<Product> products) {
        double sumPrice = 0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        double avgPrice = sumPrice / products.size();
        System.out.println("Średnia cena produktów: " + avgPrice);
    }

    private static void printCheapestAndExpensiveProduct(TreeSet<Product> products) {
        System.out.println("Najtańszy produkt: " + products.first());
        System.out.println("Najdroższy produkt: " + products.last());
    }
}