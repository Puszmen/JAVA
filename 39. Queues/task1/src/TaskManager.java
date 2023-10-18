import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

    private Queue<Task> taskQueue = new PriorityQueue<>();
    private Scanner sc = new Scanner(System.in);

    void mainLoop() {
        Option option;
        do {
            printOptions();
            System.out.println("Wybierz opcję");
            option = Option.createFromInt(sc.nextInt());
            sc.nextLine();
            switch (option) {
                case EXIT:
                    System.out.println("Bajoooo");
                    break;
                case ADD:
                    taskQueue.offer(readAndCreateTask());
                    System.out.println("Dodano zadanie do listy");
                    break;
                case TAKE:
                    takeTask();
                    break;
            }
        } while (option != Option.EXIT);
    }

    private void takeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("Brak zadan do wykonania");
        } else {
            Task nextTask = taskQueue.poll();
            System.out.println("Zadanie do wykonania");
            System.out.println(nextTask);
        }
    }

    private Task readAndCreateTask() {
        System.out.println("Podaj nazwę zadania");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania");
        String description = sc.nextLine();
        System.out.print("Podaj priorytet zadania, ");
        for (Task.Priority priority : Task.Priority.values()) {
            System.out.print(priority + " ");
        }
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine().toUpperCase());
        return new Task(name, description, priority);
    }

    private void printOptions() {
        Option[] options = Option.values();
        for (Option option : options) {
            System.out.println(option);
        }
    }

    public enum Option {
        EXIT(0, "Wyjście z programu"),
        ADD(1, "Dodanie zadania"),
        TAKE(2, "Wykonanie zadania");

        int number;
        String description;

        Option(int number, String description) {
            this.number = number;
            this.description = description;
        }

        static Option createFromInt(int option) {
            return values()[option];
        }

        @Override
        public String toString() {
            return number + " - " + description;
        }
    }
}
