package org.example;

public class HotDrinks extends Drinks{
    private int temperature;

    /**
     * Конструктор для горячих напитков
     * @param name Имя
     * @param price Цена
     * @param volume Объем
     * @param temperature Температура
     */
    public HotDrinks(String name, double price, double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    /**
     * Задание температуры напитка
     * @param temperature
     */
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
    @Override
    public String toString() {
        return super.toString() + "; Температура: " + temperature + " градусов";
    }
}
