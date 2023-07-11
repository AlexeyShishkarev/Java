// Создать мапу, обобщение целое число и строка
// заполнить 10 значениями, ключ случайное число от 0 до 1000, а значение название буквы этого числа

// вывести в порядке сортировки значения

// Создать вторую такую же мапу. Из первой удалить поля с соответвующими ключами второй.


package org.example;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        HashMap<Integer, String> newMap = new HashMap<>();
        HashMap<Integer, String> secondMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            int number = new Random().nextInt(10);
            newMap.put(number, Character.getName(number));
        }
        for (int i = 0; i < 10; i++) {
            int number = new Random().nextInt(10);
            secondMap.put(number, Character.getName(number));
        }

        ArrayList<String> mapValue = new ArrayList<>();
        newMap.forEach((k, v) -> mapValue.add(v));
        Collections.sort(mapValue);

        for (int i = 0; i < newMap.size(); i++) {

            for (Map.Entry<Integer, String> entry : newMap.entrySet()) {
                if (entry.getValue().equals(mapValue.get(i))){
                    System.out.println(entry);
                }
            }
        }
        secondMap.forEach((k, v) -> newMap.remove(k));
        System.out.println("=".repeat(40));
        newMap.forEach((k, v) -> System.out.printf("%s = %s\n", k, v));
        }
    }
