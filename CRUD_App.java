import java.util.ArrayList;
import java.util.Scanner;

public class CRUD_App {
    public static void main (String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner (System.in);

        int choice;

        do {
            System.out.println("\n=== TASK MANAGER ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.println("Choose: ");

            choice = input.nextInt();
            input.nextLine(); //important for clearing buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = input.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks found.");
                    } else {
                        System.out.println("\nYour Tasks: ");
                        for (int i=0; i < tasks.size(); i++) {
                            System.out.println((i+1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to delete: ");
                    int index = input.nextInt();

                    if (index > 0 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("Task deleted!");
                    } else {
                        System.out.println("Invalid number!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        input.close();
    }
}