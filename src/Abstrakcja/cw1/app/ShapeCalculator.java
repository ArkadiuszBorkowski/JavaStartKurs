package Abstrakcja.cw1.app;

import Abstrakcja.cw1.io.ConsolePrinter;
import Abstrakcja.cw1.model.Circle;
import Abstrakcja.cw1.model.Rectangle;
import Abstrakcja.cw1.model.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeCalculator {

    private ConsolePrinter consolePrinter = new ConsolePrinter();
    private Scanner scanner = new Scanner(System.in);

    private Option option;

    public void run() {
        System.out.println("Kalkulator wyliczający pole i obwód figur. Wybierz akcję:");
        Option.printOptions();
        readOptionsFromUsers();
        controlLoop(option);
    }

    private void controlLoop(Option option) {
        switch (option) {
            case EXIT -> consolePrinter.printLine("Do zobaczenia");
            case CIRCLE -> consolePrinter.printLine(createCircle().toString());
            case TRIANGLE ->  consolePrinter.printLine(createTriangle().toString());
            case RECTANGLE ->  consolePrinter.printLine(createRectangle().toString());
        }
    }

    private Rectangle createRectangle() {
        consolePrinter.printLine("Podaj długość boku A:");
        double a = readPositiveDoubleNumbers();
        consolePrinter.printLine("Podaj długość boku B:");
        double b = readPositiveDoubleNumbers();
        return new Rectangle(a, b);
    }

    private Circle createCircle() {
        consolePrinter.printLine("Podaj promień koła");
        return new Circle(readPositiveDoubleNumbers());
    }

    private Triangle createTriangle() {
        consolePrinter.printLine("Podaj długość boku A:");
        double a = readPositiveDoubleNumbers();
        consolePrinter.printLine("Podaj długość boku B:");
        double b = readPositiveDoubleNumbers();
        consolePrinter.printLine("Podaj długość boku C:");
        double c = readPositiveDoubleNumbers();
        return new Triangle(a, b, c);
    }

    private void readOptionsFromUsers() {

        boolean readComplete = false;

        while (!readComplete) {
            System.out.println("Wybierz opcję: ");
            try {
                option = Option.getOptionFromInt(scanner.nextInt());
                consolePrinter.printLine("Wybrano opcję: " + option.ordinal() + " - " + option.getDescription());
                readComplete = true;
            } catch (InputMismatchException e) {
                consolePrinter.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie: ");
            } catch (ArrayIndexOutOfBoundsException e) {
                consolePrinter.printLine("Wybrano opcję z poza zakresu");
            } finally {
                scanner.nextLine();
            }

        }
    }


    private double readPositiveDoubleNumbers(){
        double number = -1;
        while (number <= 0) {
            try {
                number = scanner.nextDouble();
            } catch (InputMismatchException e ) {
                consolePrinter.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie: ");
            } catch (ArrayIndexOutOfBoundsException e) {
                consolePrinter.printLine("Wybrano opcję z poza zakresu");
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }




}

