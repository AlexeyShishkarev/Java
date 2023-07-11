// Создать мапу, обобщение целое число и строка
// заполнить 10 значениями, ключ случайное число от 0 до 1000, а значение название буквы этого числа

// вывести в порядке сортировки значения


package org.example;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        HashMap<Integer, String> newMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int number = new Random().nextInt(1001);
            newMap.put(number, Character.getName(number));
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
    }
}