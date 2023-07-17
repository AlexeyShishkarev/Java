package org.example;
import java.util.Scanner;

public class ConsoleInput {
    private static Scanner scanner = new Scanner(System.in);

    /**
     *
     * @param message приглашение к вводу
     * @return возврат того что написали в String
     */
    public static String readString(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
