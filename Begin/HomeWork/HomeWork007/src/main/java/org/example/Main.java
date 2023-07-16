//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//        перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт
//        соответствующий имени, объёму и температуре
//        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//        воспроизвести логику, заложенную в программе
//        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

package org.example;

public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine machine1 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine machine2 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine machine3 = new HotDrinksVendingMachine();

        HotDrinks coffeS = new HotDrinks("Кофе", 150, 100, 90);
        HotDrinks coffeM = new HotDrinks("Кофе", 200, 200, 90);
        HotDrinks coffeL = new HotDrinks("Кофе", 250, 300, 90);

        HotDrinks teaS = new HotDrinks("Чай", 100, 100, 90);
        HotDrinks teaM = new HotDrinks("Чай", 150, 200, 90);
        HotDrinks teaL = new HotDrinks("Чай", 200, 300, 90);

        HotDrinks hotChocolateS = new HotDrinks("Горячий шоколад", 150, 100, 80);
        HotDrinks hotChocolateM = new HotDrinks("Горячий шоколад", 200, 200, 80);
        HotDrinks hotChocolateL = new HotDrinks("Горячий шоколад", 250, 300, 80);

        machine1.initProduct(coffeS);
        machine1.initProduct(coffeM);
        machine1.initProduct(coffeL);

        machine2.initProduct(teaS);
        machine2.initProduct(teaM);
        machine2.initProduct(teaL);

        machine3.initProduct(hotChocolateS);
        machine3.initProduct(hotChocolateM);
        machine3.initProduct(hotChocolateL);

        System.out.println(machine3.getProduct("шоколад", 200, 80));




    }
}