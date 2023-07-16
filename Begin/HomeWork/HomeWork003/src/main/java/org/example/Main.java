//Урок 3. Коллекции JAVA: Введение
//        Формат сдачи: ссылка на подписанный git-проект.
//
//        Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение


package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    private static double averageValue(ArrayList<Integer> arr){
        double averageValue = 0;
        double summ = 0;
        for (int i = 0; i < arr.size(); i++) {
            summ += arr.get(i);
        }
        averageValue = summ / arr.size();
        return averageValue;
    }
    private static ArrayList<Integer> removingEvenNumbers(ArrayList<Integer> arr){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0){
                temp.add(arr.get(i));
            }
        }
        arr.removeAll(temp);
        return arr;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(1, 51));
        }



        System.out.println("Исходный список: " + list1);
        System.out.println("Список без четных чисел: " + removingEvenNumbers(list1));
//        Дальнейшие действия выполняются со списком из которого удалили все четные значения
        System.out.println("Среднее арифметическое значение всех элементов списка: " + averageValue(list1));
        System.out.println("Максимальное значение списка: " + Collections.max(list1));
        System.out.println("Минимальное значение списка: " + Collections.min(list1));

    }
}