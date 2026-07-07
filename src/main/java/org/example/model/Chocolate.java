package org.example.model;

public class Chocolate extends ProductForSale{
    public String flavor;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("Chocolate Details: Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }
}
