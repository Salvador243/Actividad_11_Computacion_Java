package com.company;
public class Triangle implements Shape {

    private final double base;
    private final double altura;

    public Triangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

   @Override
    public double getArea() {
        return (base * altura)/2;
    }

    @Override
    public double getPerimeter() {
        return (base + base + base);
    }
}