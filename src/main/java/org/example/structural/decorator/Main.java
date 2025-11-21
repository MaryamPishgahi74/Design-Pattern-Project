package org.example.structural.decorator;

public class Main {

    public static void main(String[] args) {
        SimpleCoffee simpleCoffee = new SimpleCoffee();

        CoffeeDecorator orderCoffee1 = new MilkDecorator(simpleCoffee);
        System.out.println(orderCoffee1.getDescription());
        System.out.println(orderCoffee1.getCost());

        System.out.println("--------");

        CoffeeDecorator orderCoffee2 = new NoSugarCoffee(simpleCoffee);
        System.out.println(orderCoffee2.getDescription());
        System.out.println(orderCoffee2.getCost());
    }
}
