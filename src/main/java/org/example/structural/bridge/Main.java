package org.example.structural.bridge;

public class Main {

    public static void main(String[] args) {
        Shape redCircle = new Circle(10,20,5,new RedDrawing());
        Shape blueCircle = new Circle(5,5,2,new BlueDrawing());

        redCircle.draw();
        blueCircle.draw();
    }
}