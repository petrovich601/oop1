/**
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс
 * ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume,
 * int temperature) выдающий продукт соответствующий имени, объему и температуре
 * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
 * и воспроизвести логику заложенную в программе
 * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Drink> drinks = new ArrayList<>(Arrays.asList(new HotDrink("espresso", 42, 70),
                new HotDrink("chocolate", 67, 75),
                new HotDrink("cappuccino", 70, 55)));
        vendingMachine.intProduct(drinks);
        System.out.println(vendingMachine.getProduct("espresso").toString());


    }
}

