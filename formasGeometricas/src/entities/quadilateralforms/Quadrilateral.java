package entities.quadilateralforms;

import entities.interfaces.Forms;

public abstract class Quadrilateral implements Forms {
    protected double base;
    protected double height;

    public Quadrilateral(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
