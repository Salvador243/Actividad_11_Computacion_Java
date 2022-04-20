package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int salir = 0;
        Scanner in = new Scanner(System.in);
        try {
            do {
                System.out.println("Seleccionar propiedad a calcular \n" + "area [1]  \n" + "perímetro[2]");
                int calculo = Integer.parseInt(in.nextLine());

                System.out.println("Selecciona la figura \n" + "Cuadrado [1]  \n" + "Triangulo [2] \n" + "Circulo [3]");
                int figura = Integer.parseInt(in.nextLine());

                switch (calculo) {
                    case 1:
                        if (figura == 1) {
                            System.out.println("Ingrese el lado");
                            double lado = Double.parseDouble(in.nextLine());
                            Square cuadrado = new Square(lado);
                            System.out.println(cuadrado.getArea());
                        } else if (figura == 2) {
                            System.out.println("Ingrese la base");
                            double b = Double.parseDouble(in.nextLine());
                            System.out.println("Ingrese la altura");
                            double h = Double.parseDouble(in.nextLine());
                            Triangle t = new Triangle(b, h);
                            System.out.println(t.getArea());
                        } else {
                            System.out.println("Ingrese el radio");
                            double r = Double.parseDouble(in.nextLine());
                            Circle c = new Circle(r);
                            System.out.println(c.getArea());
                        }
                        break;
                    case 2:
                        if (figura == 1) {
                            System.out.println("Ingrese el lado");
                            double lado = Double.parseDouble(in.nextLine());
                            Square cuadrado = new Square(lado);
                            System.out.println(cuadrado.getPerimeter());
                        } else if (figura == 2) {
                            System.out.println("Ingrese la base");
                            double b = Double.parseDouble(in.nextLine());
                            System.out.println("Ingrese la altura");
                            double h = Double.parseDouble(in.nextLine());
                            Triangle t = new Triangle(b, h);
                            System.out.println(t.getPerimeter());
                        } else {
                            System.out.println("Ingrese el radio");
                            double r = Double.parseDouble(in.nextLine());
                            Circle c = new Circle(r);
                            System.out.println(c.getPerimeter());
                        }
                        break;
                }
                System.out.println("Realizar otro calculo? \n" +
                        "Si [1] \n" +
                        "No [2]");
                int x = Integer.parseInt(in.nextLine());
                if(x == 2)
                    salir = 1;
            } while (salir != 1);
        } catch (Exception e) {
            System.out.println("Hubo un error " + e);
        }
    }
}
