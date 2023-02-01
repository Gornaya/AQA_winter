package Task_Bakery.abstractions;

public abstract class Products {
    private String productsName;
    private String category;
    private int price;
    private String dueDate;

    public Products(String productsName, String category, int price, String dueDate) {
        this.productsName = productsName;
        this.category = category;
        this.price = price;
        this.dueDate = dueDate;
    }


    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    protected abstract void order();
}
