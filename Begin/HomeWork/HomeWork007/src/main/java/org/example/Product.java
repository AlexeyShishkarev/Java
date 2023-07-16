package org.example;

/**
 * Класс для всех продуктов
 */
public class Product {
    private String name;
    private double price;

    /**
     * Конструктор с 2-мя параметрами
     * @param nameProduct имя продукта
     * @param priceProduct цена продукта
     */
    public Product(String nameProduct, double priceProduct){
        this.name = nameProduct;
        this.price = priceProduct;
    }

    /**
     * Конструктор без параметров
     */
    public Product(){
    }

    /**
     * Получение наименования продукта
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * Получение цены продукта
     * @return
     */
    public double getPrice(){
        return price;
    }

    /**
     * Внесение имени продукта
     * @param newName само имя продукта
     */
    public void setName (String newName){
        this.name = newName;
    }

    /**
     * Внесение цены продукта
     * @param newPrice сама цена продукта
     */
    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    /**
     * Переопределение стандартного метода для вывода всего содержимого объекта
     * @return
     */
    @Override
    public String toString() {
        return name + "; цена: " + price + "руб";
    }
}




