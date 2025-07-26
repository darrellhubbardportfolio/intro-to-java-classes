package com.shape;

public class Circle extends Shape {

    double pi = 3.14159;
    double diameter;
    double radius;
    // constructor
    public Circle (String name, double diameter) {
        super(name);
        this.diameter = diameter;
        this.radius = (diameter / 2);
    }
    // create a circumference
    public void Circumference() {
        double circumference = (2 * this.pi * this.radius); // 2 * pi * radius;
        System.out.printf("circumference is: %s%n",circumference);
    }
}
