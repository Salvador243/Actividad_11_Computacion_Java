package com.company;

class Circle implements Shape {
    private double PI = 3.1415;
    private double r;

    public Circle(double radio){
        this.r = radio;
    }

    public double getArea() {
        return (PI * (r*r));
    }

    public double getPerimeter() {
        return (2 * PI * r);
    }
}