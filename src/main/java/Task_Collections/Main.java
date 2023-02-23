package Task_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product Milk = new Product("BalMoloko", 60);
        Product Buckwheat = new Product("Hutorok", -97);
        Product Coffee = new Product("Jacobs", 110);
        Product Fruit = new Product("Apple", 5);
        Product Chicken = new Product("Hip", 35);

        List<Product> list = new ArrayList<>();

        list.add(Milk);
        list.add(Buckwheat);
        list.add(Coffee);
        list.add(Fruit);
        list.add(Chicken);

        ProductMarket.unsortedList(list).forEach(System.out::println);
        System.out.println();
        ProductMarket.sortByAlpha(list).forEach(System.out::println);
        System.out.println();
        ProductMarket.sortMoreThan(list).forEach(System.out::println);
        System.out.println();
        ProductMarket.sortLessThan(list).forEach(System.out::println);
        System.out.println();
        System.out.println(ProductMarket.priceToString(list));


    }
}
