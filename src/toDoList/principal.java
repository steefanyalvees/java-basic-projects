package toDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        System.out.println(" ************ OLA, ESSA E SUA LISTA DE TAREFAS DA SEMANA ***************");
        System.out.println(" por favor, selecione uma opcao");
        System.out.println(" 1. Add an item");
        System.out.println(" 2. Delete an item");
        System.out.println(" 3. Show the list");
        System.out.println(" 4. Delete all task");
        System.out.println(" 5. exit program");

        Scanner keyboard = new Scanner(System.in);
        int opcaoEscolhida = keyboard.nextInt();

     if(opcaoEscolhida == 1)   {
         System.out.println(" por favor digite o primeiro item ");
         int item = keyboard.nextInt();
       //  System.out.println(" seu item e " + item);
         //ArrayList<String> minhaLista = new ArrayList<>();
        // minhaLista.add(" seu item e " + minhaLista);
        // System.out.println(minhaLista);

     }



    }
}
