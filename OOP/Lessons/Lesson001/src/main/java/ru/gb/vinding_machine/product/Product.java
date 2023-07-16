package ru.gb.vinding_machine.product;

public class Product {
    private String name;
    private double price;

    /**
     * Конструктор с двумя полями
     * @param name - имя
     * @param price - цена
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
        this("Незвестно", 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Название: " + name + ", price " + price + " руб.";
    }
}
