package task004;

import java.util.Scanner;

public class Exception {
    public String userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scanner.nextLine();
        if (line.isEmpty()){
            throw new RuntimeException("Пустую строку вводить нельзя!");
        }
        return line;
    }
}
