package Task_Collections;

import java.util.*;
import java.util.stream.Collectors;

public class ProductMarket {

    public static List<Product> unsortedList(List<Product> products) {
        System.out.println("Unsorted list: ");
        return products;
    }

    public static List<Product> sortByAlpha(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        Collections.sort(sorted, Comparator.comparing(Product::getName));
        System.out.println("Sorted list by alphabet: ");
        return sorted;
    }

    public static List<Product> sortMoreThan(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        System.out.println("Price more then 10: ");
        sorted.stream()
                .filter(product -> product.getPrice() >= 10)
                .forEach(System.out::println);
        return sorted;
    }

    public static List<Product> sortLessThan(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        System.out.println("Price less than 0: ");
        sorted.stream()
                .filter(product -> product.getPrice() < 0)
                .forEach(System.out::println);
        return sorted;
    }


    public static List<String> priceToString(List<Product> products) {
        System.out.println("List of prices in String: ");
        return products.stream()
                .map(Product::getPrice)
                .map(price -> Integer.toString(price))
                .collect(Collectors.toList());
    }

}