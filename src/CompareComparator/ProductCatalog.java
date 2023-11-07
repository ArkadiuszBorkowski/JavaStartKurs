package CompareComparator;

import java.util.Arrays;
import java.util.Comparator;

class ProductCatalog {
    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Amino", "Zupa pomidorowa", 3.90);
        products[1] = new Product("Amino", "Zupa ogórkowa", 3.90);
        products[2] = new Product("WINIARY", "Zupa pomidorowa", 4.20);
        products[3] = new Product("WINIARY", "Zupa pieczarkowa", 4.10);
        products[4] = new Product("WINIARY", "Rosół", 3.60);
        products[5] = new Product("Knorr", "Placki ziemniaczane", 6.40);
        products[6] = new Product("Knorr", "Racuchy", 7.20);

        System.out.println("Nieposortowana: ");
        for (Product p : products) {
            System.out.println(p);
        }

        ProductNameComparator productNameComparator = new ProductNameComparator();
        Product.ProductNameReverseComparator productNameReverseComparator = new Product.ProductNameReverseComparator();
        //Arrays.sort(products,  productNameComparator);    // gdy mamy osobny Comparator

        //można też w locie wykorzystując klasę anonimową
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });    // gdy mamy osobny Comparator


        //Arrays.sort(products);  - gdy mamy tylko Compare w klasie Produkt
        System.out.println("Posortowana: ");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}