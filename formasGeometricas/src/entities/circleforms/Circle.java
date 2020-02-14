package entities.circleforms;

import entities.interfaces.Forms;

public class Circle implements Forms {
    private double radius;
    private final double PI = 3.141592;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
