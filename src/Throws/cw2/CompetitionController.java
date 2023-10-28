package Throws.cw2;

import java.util.InputMismatchException;
import java.util.Scanner;

class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.println("Podaj nazwę zawodów:");
        String competitionName = scanner.nextLine();
        System.out.println("Podaj maksymalną liczbę uczestników:");
        int maxParticipants = readPositiveNumber();
        System.out.println("Podaj ograniczenie wiekowe:");
        int ageLimit =  readPositiveNumber();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant participant = createParticipant();
            try {
                competition.addParticipant(participant);
            } catch (AgeViolationException e) {
                System.out.println("Nie dodano uczestnika, minimalny wiek: " + e.getAgeRequired());
            } catch (DuplicateException e) {
                System.out.println("Uczestnik już istnieje: " + e.getParticipant());
            } catch (MaxCompetitorsException e) {
                System.out.println("Osiągnięto maksymalną liczbę uczesntików");
            }
        }
    }

    private Participant createParticipant() {
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj id (np. pesel):");
        String id = scanner.nextLine();
        System.out.println("Podaj wiek:");
        int age = readPositiveNumber();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }

    private int readPositiveNumber() {
        int number = -1;
        while (number < 0) {

            try {
                number = scanner.nextInt();
                if (number < 0)
                    System.out.println("Podana liczba musi być dodatnia");
            } catch (InputMismatchException e) {
                System.out.println("Musisz podać liczbę, podaj ponownie");
            } finally {
                scanner.nextLine();
            }

        }

        return number;
    }
}