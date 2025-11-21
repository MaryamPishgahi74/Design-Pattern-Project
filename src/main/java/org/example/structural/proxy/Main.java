package org.example.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("test-image.jpg");

        // تصویر فقط وقتی display صدا زده بشه لود می‌شه
        image.display();
        System.out.println("----");
        image.display();

    }
}
