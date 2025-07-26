package com.phone;

public class Phone {
    double price;
    String brand;
    String model;
    String color;
    public void setPrice (double price) {
        this.price = price;
    }
    public void getPrice() {
        System.out.printf("price is $%s", this.price);
    }
}

class SmartPhone extends Phone {

    // implement code ...
}

class FlipPhone extends Phone {

    // implement code ...
}
