package com.model;

public class Convertidor {

    private Fahrenheit gradosf= new Fahrenheit();
    private Celsius gradosc= new Celsius();
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

    public Fahrenheit getGradosf() {
        return gradosf;
    }

    public Celsius getGradosc() {
        return gradosc;
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
