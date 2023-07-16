package org.example;

public class Drinks extends Product {
    private double volume;

    /**
     * Новый конструктор для напитков
     * @param name имя
     * @param price цена
     * @param volume объем
     */
    public Drinks (String name, double price, double volume){
        super(name, price);
        this.volume = volume;
    }


    /**
     * Задание объема напитка
     * @param volume объем напитка
     */
    public void setVolume(double volume){
        this.volume = volume;
    }

    /**
     *   Получение объема напитка
     * @return
     */
    public double getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + "; Объем: " + volume + "мл.";
    }
}
