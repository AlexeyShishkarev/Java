package ru.gb.vinding_machine.vending;

import ru.gb.vinding_machine.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private long id;
    private List<Product> productList;

    /**
     * Конструктор нового аппарата с продуктами (productList)
     * @param productList
     */
    public VendingMachine(List<Product> productList){
        this.productList = productList;
    }

    /**
     * Конструктор пустого автомата
     */
    public VendingMachine(){
        this(new ArrayList<>());
    }

    /**
     * Добавление новых продуктов
     * @param product
     */
    public void addProduct(Product product){
        productList.add(product);
    }

    /**
     * Поиск продукта по имени
     * @param name
     * @return возвращает продукт
     */
    public Product findProduct(String name){
        for (Product product: productList) {
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }


    /**
     * Список всех продуктов
     * @return
     */
    public String getProductsListInfo (){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов: \n");
        for (Product product: productList) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
