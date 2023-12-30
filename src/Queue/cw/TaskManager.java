package Queue.cw;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import static ForForEach.cw2.HospitalApp.printOptions;

public class TaskManager {
    private Queue<Task> tasks = new PriorityQueue<>();
    private Scanner sc = new Scanner(System.in);

    public void mainLoop() {

        Option option;
        do {
            printOptions();
            System.out.println("Wybierz opcję:");
            option = Option.getOptionFromInt(sc.nextInt());
            sc.nextLine();
            switch (option) {
                case ADD -> addTask();
                case DO -> doTask();
                case SHOW -> printTask();
                case EXIT -> System.out.println("Do zobaczenia");
            }
        } while (option != Option.EXIT);


    }

    private void printTask() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    private void printOptions() {
        System.out.println("Wybierz opcję:");
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }

    private void doTask() {
        if (tasks.isEmpty()) {
            System.out.println("Brak zadań do wykonania");
        } else {
            Task nextTask = tasks.poll();
            System.out.println("Zadanie do wykonania: ");
            System.out.println(nextTask);
        }
    }

    private Task readAndCreateTask() {
   //     sc.nextLine();
        System.out.println("Podaj nazwę zadania");
        String name = sc.nextLine();

        System.out.println("Podaj opis zadania");
        String description = sc.nextLine();

        System.out.println("Podaj priorytet zadania");
        Task.Priority[] priorities = Task.Priority.values();
        for (Task.Priority priority : priorities) {
            System.out.print(priority + " - ");
        }
        System.out.println();
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine());

        return new Task(name, description, priority);
    }

    private void addTask() {
        Task task = readAndCreateTask();
        tasks.offer(task);
        System.out.println("Dodano task");
    }

    private enum Option {
        ADD ("Dodaj nowe zadanie"),
        DO ("Wykonaj zadanie"),
        SHOW ("Pokaż listę zadań"),
        EXIT ("Wyjdź z programu");

        private String description;

        Option(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        static Option getOptionFromInt(int option){
            return Option.values()[option];
        }


        @Override
        public String toString() {
            return  ordinal() + " - " + description;
        }
    }
}
