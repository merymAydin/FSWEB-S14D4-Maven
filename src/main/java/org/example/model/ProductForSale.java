package org.example.model;

public abstract class ProductForSale {
    private String type;
    private int price;
    private String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    double getSalesPrice(int quantity) {
        return quantity * price;
    }
    abstract void showDetails();
}

class Chocolate extends ProductForSale{
    public String flavor;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("Chocolate Details: Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }
}

class Bread extends ProductForSale{
    public String size;
    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("Bread Details: Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }
}

class Coke extends ProductForSale{
    public String volume;
    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("Coke Details: Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }
}
