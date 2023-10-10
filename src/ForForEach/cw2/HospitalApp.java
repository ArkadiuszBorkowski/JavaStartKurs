package ForForEach.cw2;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;

        Scanner scanner = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();
        Patient patient = new Patient();

        while (option != exit) {
            printOptions();
            option = scanner.nextInt();

            switch (option) {
                case exit:
                    System.out.println("Do zobaczenia");
                    break;
                case addPatient:
                    Patient newPatient = patient.createPatient();
                    hospital.addPatient(newPatient);
                    break;
                case printPatients:
                    hospital.printPatients();
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja");
                    break;
            }
        }

    scanner.close();
    }



    public static void printOptions() {
        System.out.println("Dostępne opcje: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie pacjenta");
        System.out.println("2 - wyświetlenie listy pacjentów");
    }

}




