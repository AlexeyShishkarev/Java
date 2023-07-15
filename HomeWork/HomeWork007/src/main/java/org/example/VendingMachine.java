package org.example;

public interface VendingMachine {
    /**
     * Внесение продуктов в торговый автомат
     */
    void initProduct();


    /**
     * Получение продуктов из торгового автомата
     * @return
     */
    String getProduct();
}
