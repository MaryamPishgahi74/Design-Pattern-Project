package org.example.structural.bridge;

public class BlueDrawing implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing BLUE circle at (" + x + ", " + y + ") with radius " + radius);
    }
}
