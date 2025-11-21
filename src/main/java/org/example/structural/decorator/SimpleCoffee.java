package org.example.structural.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee Whit : ";
    }

    @Override
    public double getCost() {
        return 47.500;
    }
}
