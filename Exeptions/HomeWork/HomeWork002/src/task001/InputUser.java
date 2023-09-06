package task001;

import java.util.Scanner;

public class InputUser{
    public float inputConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        float number;
        boolean answer = true;
        while (answer){
            try {
                number = Float.parseFloat(scanner.nextLine());
                return number;
            } catch (NumberFormatException e){
                System.out.println("Ввод неверен! попробуй еще раз: ");
            }
        }
        return 0f;
    }

    public void outputUser(){
        float number = inputConsole();
        System.out.println(number);
    }

}
