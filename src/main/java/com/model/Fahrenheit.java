package com.model;
import java.lang.Math;

public class Fahrenheit implements Grados{

    public double gradoEnFahrenheit;

    @Override
    public double convertirgrados(double numero) {
        gradoEnFahrenheit = (numero*(1.8)) + 32;
        return gradoEnFahrenheit;
    }

    public double getGradoEnFahrenheit() {
        return gradoEnFahrenheit;
    }

    @Override
    public String toString() {
        return "Fahrenheit{" +
                "gradoEnFahrenheit=" + gradoEnFahrenheit +
                '}';
    }
}
