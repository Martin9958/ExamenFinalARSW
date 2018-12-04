package com.model;

public class Convertidor {


    private double numeroinicial;
    private double resultado;
    private String unidadinicial;
    private String unidadfinal;

    public Convertidor(String unidadinicial,double numero, String unidadfinal){
        this.numeroinicial = numero;
        this.unidadinicial = unidadinicial;
        this.unidadfinal = unidadfinal;
        convertirGrado();
    }

    public double convertirGrado(){
        Fahrenheit gradosf= new Fahrenheit();
        Celsius gradosc= new Celsius();
        resultado = 0;
        if(unidadinicial.equals("Fahrenheit") && unidadfinal.equals("Celsius")){
            resultado = Math.ceil(gradosc.convertirgrados(numeroinicial));
        }else if(unidadinicial.equals("Celsius") && unidadfinal.equals("Fahrenheit")){
            resultado = gradosf.convertirgrados(numeroinicial);
        }else{
            resultado = numeroinicial;
        }
        System.out.println(numeroinicial);
        System.out.println(resultado);
        return resultado;

    }

    public double getNumeroinicial() {
        return numeroinicial;
    }

    public double getResultado() {
        return resultado;
    }

    public String getUnidadinicial() {
        return unidadinicial;
    }

    public String getUnidadfinal() {
        return unidadfinal;
    }
}
