package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(50));
            list2.add(new Random().nextInt(50));
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("=".repeat(40));
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (list1.get(i) % list2.get(i) == 0) {
                temp.add(list1.get(i));
            }

        }
        list1.removeAll(temp);
        System.out.println(list1);
    }
}