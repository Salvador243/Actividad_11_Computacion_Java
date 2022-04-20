package com.company;


class Square implements Shape {
    private double lado;

    public Square(double lado){
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return (lado * lado);
    }

    @Override
    public double getPerimeter() {
        return (lado + lado + lado + lado);
    }
}