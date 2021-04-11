package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleIsosceles extends Triangle {
    private int side;
    private int side2;
    private double semi;


    public TriangleIsosceles(int side, int side2) {
        this.side = side;
        this.side2 = side2;
        semi = (side+side2+side2)/2;
    }

    public String getName() {
        return "Triangle Isosceles";
    }

    public double getPerimeter() {
        return side2 * 2 + side;
    }

    public double getArea() {
        return Math.sqrt(semi * ((semi-side) * (semi-side2) * (semi-side2)));
    }
}
