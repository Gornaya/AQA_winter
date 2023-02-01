package Task_Bakery.menu;

import Task_Bakery.abstractions.Products;

public class Drinks extends Products {

    private String nomination;
    private String flavor;
    private String size;
    private boolean service;

    public Drinks(String productsName, String category, int price, String dueDate, String nomination, String flavor, String size, boolean service) {
        super(productsName, category, price, dueDate);
        this.nomination = nomination;
        this.flavor = flavor;
        this.size = size;
        this.service = service;
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    @Override
    public void order() {
        System.out.println(getNomination() + getFlavor() + "size " + getSize() + "is added to order");
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
}
