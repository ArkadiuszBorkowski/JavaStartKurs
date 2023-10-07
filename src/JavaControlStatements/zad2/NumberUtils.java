package JavaControlStatements.zad2;

public class NumberUtils {

    public void compareNumberAndPrint(int number, int compareToNumber) {
        if (number == compareToNumber) {
            System.out.println("Liczba " + number + " jest taka sama jak liczba " + compareToNumber);
        } else if (number > compareToNumber) {
            System.out.println("Liczba " + number + " jest wieksza od " + compareToNumber);
        } else if (number < compareToNumber) {
            System.out.println("Liczba " + number + " jest mniejsza od " + compareToNumber);
        }
    }

    public void printOddOrEven (int number) {
        if (number % 2 == 0 ) {
            System.out.println(number + "jest liczbą parzystą");
        } else {
            System.out.println(number + "jest liczbą nieparzystą");
        }
    }

    int getFourDigitNumber(int number) {
        if (number == 0) {
            return 0;
        } else if (number / 1000 != 0 ) {
            return number;
        } else if (number / 100 != 0 ) {
            return number * 10;
        } else if (number / 10 != 0)
            return number * 100;
        else
            return number * 1000;
        }

}
