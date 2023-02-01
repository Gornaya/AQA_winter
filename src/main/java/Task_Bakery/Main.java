package Task_Bakery;

import Task_Bakery.menu.Cupcakes;
import Task_Bakery.menu.DessertsByWeight;
import Task_Bakery.menu.Drinks;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Cupcakes chocolateCupcake = new Cupcakes("Cupcake", "Cupcakes", 20, "20-20-2020", "Chocolate", 5, true );
        Drinks lemonLemonade = new Drinks("lemonade", "sweet drinks", 5, "31-01-2023", "Sparkled", "lemon","big", true);
        DessertsByWeight blueberryCheesecake = new DessertsByWeight ("Cheesecake", "DessertsByWeight", 0, "18-18-2022", "Blueberry cheesecake", 250, true, 0.25);

        System.out.println("You have ordered: ");
        System.out.println();

        chocolateCupcake.order();
        System.out.print("Price is USD " + chocolateCupcake.getPrice());

        System.out.println();
        System.out.println();

        blueberryCheesecake.order();
        System.out.print("Price is USD ");
        blueberryCheesecake.setPriceAfterWeight(120);
        System.out.print(blueberryCheesecake.getPrice());

        System.out.println();
        System.out.println();

        lemonLemonade.order();
        System.out.print("Price is USD " + lemonLemonade.getPrice());

        System.out.println();
        System.out.println();

        System.out.println("Total price is " + (chocolateCupcake.getPrice() + lemonLemonade.getPrice() + blueberryCheesecake.getPrice()));
    }
}
