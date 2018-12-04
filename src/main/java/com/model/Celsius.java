package com.model;
import java.lang.Math;

public class Celsius implements Grados{

    public double gradoEnCelsius;


    @Override
    public double convertirgrados(double numero) {
        gradoEnCelsius = (numero-32)/(1.8);
        return gradoEnCelsius;
    }

    public double getGradoEnCelsius() {
        return gradoEnCelsius;
    }

    @Override
    public String toString() {
        return "Celsius{" +
                "gradoEnCelsius=" + gradoEnCelsius +
                '}';
    }
}
