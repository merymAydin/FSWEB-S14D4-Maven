package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Dark Chocolate", 5, "Rich and smooth dark chocolate");
        products[1] = new Coke("Coca-Cola", 2, "Refreshing soft drink");
        products[2] = new Bread("Whole Wheat Bread", 3, "Healthy whole wheat bread");

        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}

