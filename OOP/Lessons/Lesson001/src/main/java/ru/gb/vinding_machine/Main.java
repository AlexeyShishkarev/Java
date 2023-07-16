package ru.gb.vinding_machine;

import ru.gb.vinding_machine.product.Bottle;
import ru.gb.vinding_machine.product.Product;
import ru.gb.vinding_machine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine1 = new VendingMachine();

        Product product1 = new Product("Twix", 70);
        Bottle product2 = new Bottle("Coca-cola", 100, 2);
        Product product3 = new Product("Baunty", 90);

        vendingMachine1.addProduct(product1);
        vendingMachine1.addProduct(product2);
        vendingMachine1.addProduct(product3);


        System.out.println(vendingMachine1.getProductsListInfo());
    }
}