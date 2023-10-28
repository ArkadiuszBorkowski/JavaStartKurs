package Abstrakcja.cw1;

import java.util.Optional;
import java.util.Scanner;

public class ShapeCalculator {

    Scanner scanner = new Scanner(System.in);

    Options options = readOptionsFromUsers();


    public Options readOptionsFromUsers() {

        boolean readComplete = false;
        options.printOptions();

        while (!readComplete) {

        }


        return options;
    }

}
