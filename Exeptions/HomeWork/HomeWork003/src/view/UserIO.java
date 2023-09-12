package view;

import presenter.Presenter;

import javax.swing.text.html.HTMLDocument;
import java.util.Scanner;

public class UserIO {
    private Scanner scanner;
    private Presenter presenter;
    public UserIO(){
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);

    }


    public void consoleInput(){
        System.out.println("Введите через пробел: " +
                "Фамилия Имя Отчество дата рождения номер телефона пол в формате:\n" +
                "фамилия, имя, отчество, дата рождения - формата dd.mm.yyyy,\n" +
                "номер телефона - целое беззнаковое число без форматирования,\n" +
                "пол - символ латиницей f или m.");
        String data = scanner.nextLine();
        presenter.dataInput(data);
    }
    public void consoleOutput(String message){
        System.out.println(message);
    }
}
