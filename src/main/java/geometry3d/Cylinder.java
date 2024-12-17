package geometry3d;

import exceptions.*;
import geometry2d.Figure;

public class Cylinder {
    private final double height;
    private final Figure base;
    public Cylinder(Figure base, double height) throws InvalidHeightException {
        if (height < 0) {
            throw new InvalidHeightException("Height must be greater than 0");
        }

        this.base = base;
        this.height = height;
    }
    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with height = " + height + " and figure = " + base;
    }
}
