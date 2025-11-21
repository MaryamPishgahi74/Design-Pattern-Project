package org.example.structural.bridge;

public class RedDrawing implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing RED circle at (" + x + ", " + y + ") with radius " + radius);
    }
}
