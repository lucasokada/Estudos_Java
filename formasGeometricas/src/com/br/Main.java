package com.br;

import entities.circleforms.Circle;
import entities.quadilateralforms.Quadrilateral;
import entities.quadilateralforms.Rectangle;
import entities.quadilateralforms.Square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer option = 1;

        while(option < 4 || option < 1){

            Double area = null;
            Double perimeter = null;
            menu();

            option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("side:");
                    double side = input.nextDouble(); //square side
                    Square square = new Square(side, side); //creat object
                    area = square.area();
                    perimeter = square.perimeter();
                    break;
                case 2:
                    System.out.println("base:");
                    double base = input.nextDouble();
                    System.out.println("height:");
                    double height = input.nextDouble();
                    Quadrilateral quadrilateral = new Rectangle(base, height);
                    area = quadrilateral.area();
                    perimeter = quadrilateral.perimeter();
                    break;
                case 3:
                    System.out.println("radius:");
                    double radius = input.nextDouble();
                    Circle circle = new Circle(radius);
                    area = circle.area();
                    perimeter = circle.perimeter();
                    break;
                default:
                    break;
            }

            if(area != null && perimeter != null) {
                System.out.println("area = " + area + "\n" + "perimeter = " + perimeter);
            }
        }

    }

    public static void menu()
    {
        System.out.println("---------------menu---------------");
        System.out.println("1 - square");
        System.out.println("2 - rectangle");
        System.out.println("3 - circle");
    }
}
