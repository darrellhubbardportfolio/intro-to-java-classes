package com.shape;

public class Circle extends Shape {

    private double pi = 3.14159;
    private double diameter;
    private double radius = (diameter / 2);
    // constructor
    public Circle (String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }
    // create a circumference
    public void Circumference() {
        double circumference = 2 * pi * radius; // 2 * pi * radius;
        System.out.printf("circumference is: %s",circumference);
    }
}
