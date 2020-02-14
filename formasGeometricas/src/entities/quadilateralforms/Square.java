package entities.quadilateralforms;

public class Square extends Quadrilateral {

    public Square(double base, double height) {
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
