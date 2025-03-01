package toDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class simpleToDoList {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>(); // Lista global para armazenar as tarefas
        Scanner keyboard = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Exibir menu
            System.out.println("************ WEEK ACTIVITY LIST ***************");
            System.out.println("Please, select an option:");
            System.out.println("1. Add a task");
            System.out.println("2. Delete a task");
            System.out.println("3. Show the list of tasks");
            System.out.println("4. Delete all tasks");
            System.out.println("5. Exit program");

            int opcaoEscolhida = keyboard.nextInt();
            keyboard.nextLine(); // Consumir quebra de linha

            switch (opcaoEscolhida) {
                case 1:
                    // Adicionar tarefa
                    System.out.println("Type the task that you want to add to the list:");
                    String item = keyboard.nextLine();
                    mylist.add(item);
                    System.out.println("The task '" + item + "' has been added to the list.");

                    System.out.println("Would you like to add another item? (yes/no)");
                    String addMore = keyboard.nextLine();
                    if (addMore.equalsIgnoreCase("yes")) {
                        continue;
                    } else {
                        System.out.println("Returning to the menu...");
                    }
                    break;

                case 2:
                    // Remover uma tarefa específica
                    System.out.println("Enter the task you want to delete:");
                    String taskToRemove = keyboard.nextLine();
                    if (mylist.remove(taskToRemove)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    // Exibir tarefas
                    if (mylist.isEmpty()) {
                        System.out.println("Your task list is empty.");
                    } else {
                        System.out.println("THIS IS ALL THE TASKS YOU HAVE ON THE LIST:");
                        for (String task : mylist) {
                            System.out.println("- " + task);
                        }
                    }
                    break;

                case 4:
                    // Deletar todas as tarefas
                    mylist.clear();
                    System.out.println("All tasks have been deleted.");
                    break;

                case 5:
                    // Sair do programa
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        keyboard.close();

    }}