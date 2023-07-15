package org.example;

import java.util.ArrayList;

public class HotDrinksVendingMachine implements VendingMachine {
    ArrayList<HotDrinks> hotDrinksList = new ArrayList<>();
    ArrayList<HotDrinks> findProduct = new ArrayList<>();


    public void initProduct(HotDrinks hotDrink) {
        hotDrinksList.add(hotDrink);
    }

    @Override
    public void initProduct() {
    }

    public String getProduct() {
        return null;
    }

    /**
     * Перегруженный метод getProduct который ищет напиток по имени, объему и температуре
     * @param name - Имя
     * @param volume - Объем
     * @param temp - Температура
     * @return
     */
    public String getProduct(String name, int volume, int temp) {
        findProduct.clear();
        for (HotDrinks element : hotDrinksList) {
            if (element.getName().toLowerCase().contains(name.toLowerCase()) &&
                    element.getVolume() == volume &&
                    element.getTemperature() == temp) {
                findProduct.add(element);
            }
        }
        if (findProduct.size() == 0){
           return "Напиток не найден!";
        } else {
            return findProduct.toString();
        }
    }
}