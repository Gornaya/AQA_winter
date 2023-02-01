package Task_Bakery.menu;

import Task_Bakery.ProductWeight;
import Task_Bakery.abstractions.Products;

public class DessertsByWeight extends Products implements ProductWeight {

    private String nomination;
    private double weight;
    private boolean service;
    private double priceForGr;

    public DessertsByWeight(String productsName, String category, int price, String dueDate, String nomination, double weight, boolean service) {
        super(productsName, category, price, dueDate);
        this.nomination = nomination;
        this.weight = weight;
        this.service = service;
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    @Override
    public void order() {
        System.out.println(getNomination() + "weight: " + getWeight() + "is added to order");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setPriceAfterWeight(int gr) {
        setPrice((int) (priceForGr * gr));
    }
}
