//Задание
//    Реализуйте структуру телефонной книги с помощью HashMap.
//    Программа также должна учитывать, что во входной структуре
//    будут повторяющиеся имена с разными телефонами, их необходимо считать,
//    как одного человека с разными телефонами. Вывод должен быть отсортирован
//    по убыванию числа телефонов.

package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static String inputConsole(String message) {
        System.out.println(message);
        String value = scanner.nextLine();
        return value;
    }
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        String tempKey;
        String tempValue;
        String stop;
        ArrayList<String> forSortValue = new ArrayList<>();

        while (true){
            tempKey = inputConsole("Введите Фамилию и имя: ");
            tempValue = inputConsole("Введите номер телефона: ");
            if (phonebook.containsKey(tempKey)){
                phonebook.put(tempKey, phonebook.get(tempKey) + "| " + tempValue);
            } else {
                phonebook.put(tempKey, tempValue);
            }
            stop = inputConsole("Продолжить? (Да/Нет)");
            if (stop.toLowerCase().equals("нет")) {
                break;
            }
        }

        phonebook.forEach((k, v) -> forSortValue.add(v));

        Collections.sort(forSortValue, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });


        System.out.println("=".repeat(100));

        for (int i = 0; i < phonebook.size(); i++) {
            for(Map.Entry<String, String> entry : phonebook.entrySet()){
                if (entry.getValue().equals(forSortValue.get(i))){
                    System.out.println(entry);
                }
            }
        }



    }
}