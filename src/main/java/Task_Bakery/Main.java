package Task_Bakery;

import Task_Bakery.menu.Cupcakes;
import Task_Bakery.menu.DessertsByWeight;
import Task_Bakery.menu.Drinks;

public class Main {

    public static void main(String[] args) {
        Cupcakes cupcake = new Cupcakes("Cupcake", "Cupcakes", 20, "20-20-2020", "Chocolate", 5, true );
        Drinks drink = new Drinks("lemonade", "sweet drinks", 5, "31-01-2023", "sparkled", "lemon","big", true);
        DessertsByWeight dessertsByWeight = new DessertsByWeight ("Cheesecake", "DessertsByWeight", 12, "18-18-2022", "Blueberry cheesecake", 250, true  );

        dessertsByWeight.setPriceAfterWeight(185);
        System.out.println();


    }
}
