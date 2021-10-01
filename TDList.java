import java.util.*;
import java.io.*;

public class TDList {
    public static void main(String[] args) {
        System.out.println("List Start : Write \"END\" to end list." );
        ArrayList<String> list = new ArrayList<String>();
        String todo = "";
        while (!todo.equals("END")) {
            todo = System.console().readLine();
            list.add(todo);
        }
        displayList(list);
        try {
            printList(list);
        } catch(Exception e) {
            System.out.println("caught");
        }
    }

    public static void displayList(ArrayList list) {
        System.out.println("");
        System.out.println("**To Do List**");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println("*" + list.get(i));
        }
    }

    public static void printList(ArrayList<String> list) throws IOException {
        PrintWriter writer = new PrintWriter("toDoList.txt");
        writer.println("Here's your saved list:");
        for (int i = 0; i < list.size() - 1; i++) {
            writer.println(list.get(i));
        }
        writer.close();
        System.out.println("List has been printed");
    }
}