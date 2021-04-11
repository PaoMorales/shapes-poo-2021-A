package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleScalene extends Triangle {
    private int side;
    private int sideb;
    private int sidec;
    private int semi;

    public TriangleScalene(int side, int sideb, int sidec) {
        this.sideb = sideb;
        this.sidec = sidec;
        this.side = side;
        semi = (side + sideb + sidec)/2;
    }

    public String getName() {
        return "Triangle Scalene";
    }

    public double getPerimeter() {
        return side + sideb + sidec;
    }

    public double getArea() {
        return Math.sqrt(semi *((semi-side)* (semi-sideb)* (semi-sidec)));
    }
}
