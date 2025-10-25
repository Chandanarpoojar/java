package com.xworkz.shape.external;

import com.xworkz.shape.internal.Polygon;
import com.xworkz.shape.internal.Triangal;

public class ShapeRunner {
    public static void main(String[] args) {
        Triangal triangal=new Triangal();
        triangal.displayTriangale();
        triangal.displayShape();
        Polygon polygon =new Polygon();
        polygon.displayPolygon();
        polygon.displayShape();
    }
}
