package org.example;

public class TemperatureConverter {

    private double temperature;

    public TemperatureConverter() {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double FahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5/9;
    }

}

