package Enum.TypEnum;

import java.util.Scanner;

class ShirtShop {
    public static void main(String[] args) {



        System.out.println("Dostępne rozmiary:");
        System.out.println(Size.SMALL.getDescription() + " " + Size.SMALL.name() + " " + Size.SMALL.ordinal());
        System.out.println(Size.MEDIUM.getDescription() + " " + Size.MEDIUM.name() + " " + Size.MEDIUM.ordinal());
        System.out.println(Size.LARGE.getDescription() + " " + Size.LARGE.name() + " " + Size.LARGE.ordinal());
        System.out.println();

        System.out.println("String size = SMALL");
        System.out.println("Size shirtSize = Size.valueOf(size)");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar:");

        String size = scanner.nextLine();
        Size shirtSize = Size.valueOf(size);
        System.out.println(shirtSize.name());

        System.out.println();

        Tshirt tshirt = new Tshirt();
        tshirt.setSize(Size.MEDIUM);
        tshirt.setSize(shirtSize);
        System.out.println(tshirt.getSize());
        System.out.println("Rozmiar Tshirta: " + tshirt.getSize().getDescription());

        System.out.println();

        System.out.println("Tabica:");

        Size[] values = Size.values();
//        for (Size value : values) {
//            System.out.println(value.toString());
//        }

        for (Size value : values) {
            System.out.println(value.toString());
        }

    }
}
