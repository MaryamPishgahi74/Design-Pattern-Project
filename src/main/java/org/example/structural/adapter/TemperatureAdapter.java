package org.example.structural.adapter;

public class TemperatureAdapter implements TemperatureSensor {
    private LegacyTemperatureSensor legacySensor;

    public TemperatureAdapter(LegacyTemperatureSensor legacySensor) {
        this.legacySensor = legacySensor;
    }


    @Override
    public double getTemperatureInCelsius() {
        double temperatureInFahrenheit = legacySensor.getTemperatureInFahrenheit();
        return (temperatureInFahrenheit - 32) * 5.0 / 9.0;
    }
}
