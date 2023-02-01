package Task_Bakery.menu;

import Task_Bakery.abstractions.Products;

public class Cupcakes extends Products {

    private String nomination;
    private int quantityInPack;
    private boolean service;

    public Cupcakes(String productsName, String category, int price, String dueDate, String nomination, int quantityInPack, boolean service) {
        super(productsName, category, price, dueDate);
        this.nomination = nomination;
        this.quantityInPack = quantityInPack;
        this.service = service;
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    public int getQuantityInPack() {
        return quantityInPack;
    }

    public void setQuantityInPack(int quantityInPack) {
        this.quantityInPack = quantityInPack;
    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    @Override
    public void order() {
        System.out.println(getNomination() + "size " + getQuantityInPack() + "is added to order");
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    public Cupcakes(String productsName, String category, int price, String dueDate) {
//        super(productsName, category, price, dueDate);
//    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
