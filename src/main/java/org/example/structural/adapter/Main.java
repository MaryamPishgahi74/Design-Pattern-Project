package org.example.structural.adapter;

public class Main {
    public static void main(String[] args) {
        LegacyTemperatureSensor legacyTemperatureSensor = new LegacyTemperatureSensor();
        TemperatureAdapter adapter = new TemperatureAdapter(legacyTemperatureSensor);
        // سیستم جدید فقط با سانتی‌گراد کار می‌کنه
        System.out.println("Temperature in Celsius: " + adapter.getTemperatureInCelsius());
    }
}
