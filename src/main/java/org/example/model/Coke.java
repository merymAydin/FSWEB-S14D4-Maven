package org.example.model;

public class Coke extends ProductForSale{
    public String volume;
    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("Coke Details: Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }
}
