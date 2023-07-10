package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner;

    private static String inputConsole(String message) {
        System.out.println(message);
        String value = scanner.nextLine();
        return value;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        ArrayList<String> phone = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<Integer> idGenderM = new ArrayList<>();
        ArrayList<Integer> idGenderF = new ArrayList<>();
        String stop = "";
        while (true) {
            lastName.add(inputConsole("Введите имя: "));
            firstName.add(inputConsole("Введите Фамилию: "));
            patronymic.add(inputConsole("Введите отчество: "));
            System.out.println("Введите возраст: ");
            age.add(Integer.valueOf(scanner.nextLine()));
            phone.add(inputConsole("Введите номер телефона: "));
            System.out.println("Введите пол: ");
            gender.add(scanner.nextLine().toLowerCase().contains("ж"));
            id.add(gender.size() - 1);
            stop = inputConsole("Продолжить? (Да/Нет)");
            if (stop.toLowerCase().equals("нет")) {
                break;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < firstName.size(); i++) {
            System.out.printf("ФИО: %s %s.%s. \nВозраст: %s \nТелефон: %s\nПол: %s\n\n", lastName.get(i),
                    firstName.get(i).toUpperCase().charAt(0),
                    patronymic.get(i).toUpperCase().charAt(0), age.get(i),
                    phone.get(i), (gender.get(i) == true) ? "Ж" : "М");
        }
        System.out.println("=".repeat(40));
        System.out.println("Сортировать по возрасту (Да/Нет): ");
        String tmp = scanner.nextLine();
        if (tmp.toLowerCase().contains("да")) {
            id.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return age.get(o1) - age.get(o2);
                }
            });
            for (int i = 0; i < firstName.size(); i++) {
                System.out.printf("ФИО: %s %s.%s. \nВозраст: %s \nТелефон: %s\nПол: %s\n\n", lastName.get(id.get(i)),
                        firstName.get(id.get(i)).toUpperCase().charAt(0),
                        patronymic.get(id.get(i)).toUpperCase().charAt(0), age.get(id.get(i)),
                        phone.get(id.get(i)), (gender.get(id.get(i)) == true) ? "Ж" : "М");
            }
        }
        System.out.println("=".repeat(40));
        System.out.println("Сортировать по полу? (Да/Нет): ");
        tmp = scanner.nextLine();
        if (tmp.toLowerCase().contains("да")) {
            for (int i = 0; i < gender.size(); i++) {
                if (gender.get(id.get(i))) {
                    idGenderF.add(id.get(i));
                } else {
                    idGenderM.add(id.get(i));
                }
            }
        }
        for (int i = 0; i < idGenderM.size(); i++) {
            System.out.printf("ФИО: %s %s.%s. \nВозраст: %s \nТелефон: %s\nПол: %s\n\n", lastName.get(idGenderM.get(i)),
                    firstName.get(idGenderM.get(i)).toUpperCase().charAt(0),
                    patronymic.get(idGenderM.get(i)).toUpperCase().charAt(0), age.get(idGenderM.get(i)),
                    phone.get(idGenderM.get(i)), (gender.get(idGenderM.get(i)) == true) ? "Ж" : "М");

        }
        for (int i = 0; i < idGenderF.size(); i++) {
            System.out.printf("ФИО: %s %s.%s. \nВозраст: %s \nТелефон: %s\nПол: %s\n\n", lastName.get(idGenderF.get(i)),
                    firstName.get(idGenderF.get(i)).toUpperCase().charAt(0),
                    patronymic.get(idGenderF.get(i)).toUpperCase().charAt(0), age.get(idGenderF.get(i)),
                    phone.get(idGenderF.get(i)), (gender.get(idGenderF.get(i)) == true) ? "Ж" : "М");

        }

    }
}
