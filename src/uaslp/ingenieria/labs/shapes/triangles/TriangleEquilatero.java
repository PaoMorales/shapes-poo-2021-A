package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private int side;

    public TriangleEquilatero(int side) {
        this.side = side;
    }

    public String getName() {
        return "Triangle Equilatero";
    }

    public double getPerimeter() {
        return side * 3;
    }

    public double getArea() {
        return side * side;
    }
}
