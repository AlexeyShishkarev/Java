package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        MySet<Integer> temp = new MySet<>();
        temp.addValue(456);
        temp.addValue(654);
        temp.addValue(655);
        temp.addValue(656);
        temp.addValue(656);
        temp.addValue(656);
        temp.addValue(6566);
        temp.addValue(6);
        temp.addValue(656);
        temp.addValue(654);


        temp.printSet();

        System.out.println("=".repeat(200));
        System.out.println(temp.removeValue(654));
        System.out.println(temp.removeValue(654444));

        System.out.println(temp.toString());

        Iterator<Integer> iterator = temp.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=".repeat(200));
        System.out.println(temp.findToId(4));



    }
}

 class MySet<T> {
    private HashMap<T, Integer> map = new HashMap<>();
//    private static final Object myo = new Object();


    public boolean addValue (T value){
        if(map.containsKey(value)){
            return false;
        }
       return map.put(value, map.size()) == null;

    }
    public boolean removeValue(T value){
        return map.remove(value) != map.get(value);
    }
    public String toString(){
        return map.keySet().toString();
    }

    public void printSet(){
        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }
    public Iterator<T> iterator(){
        return map.keySet().iterator();
    }

    public T findToId (Integer value){
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            if (value == entry.getValue()){
                return entry.getKey();
            }
        }
        return null;
    }


}

