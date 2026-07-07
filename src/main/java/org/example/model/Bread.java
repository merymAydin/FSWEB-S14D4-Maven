package org.example.model;

public class Bread extends ProductForSale{
    public String size;
    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Details: Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }
}
