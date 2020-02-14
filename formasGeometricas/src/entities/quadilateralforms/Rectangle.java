package entities.quadilateralforms;

public class Rectangle extends Quadrilateral {

    public Rectangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public double perimeter() {
        return 2 * base + 2 * height;
    }
}
