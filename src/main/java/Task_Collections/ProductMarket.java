package Task_Collections;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class ProductMarket {

    public static List<String> unsortedList(List<Product> products) {
        List<String> unsorted = new ArrayList<>();
        System.out.println("List of products: ");
        for (Product product : products) {
            unsorted.add(product.getName());
        }
        return unsorted;
    }

    public static List<String> sortByAlpha(List<Product> products) {
        List<String> list = new ArrayList<>();
        System.out.println("Sorted list by alphabet: ");
        for (Product product : products) {
            list.add(product.getName());
        }
        Collections.sort(list);
        return list;
    }

    public static List<Integer> sortMoreThan(List<Product> products) {
        List<Integer> price = new ArrayList<>();
        System.out.println("Price more then 10: ");
        for (Product product : products) {
            if (product.getPrice() > 10) {
                price.add(product.getPrice());
            }
        }
        return price;
    }

    public static List<Integer> sortLessThan(List<Product> products) {
        List<Integer> price = new ArrayList<>();
        System.out.println("Price less than 0: ");
        for (Product product : products) {
            if (product.getPrice() < 0) {
                price.add(product.getPrice());
            }
        }
        return price;
    }


    public static List<String> priceToString(List<Product> products) {
        System.out.println("List of prices in String: ");
        return products.stream()
                .map(Product::getPrice)
                .map(price -> Integer.toString(price))
                .collect(Collectors.toList());
    }

}