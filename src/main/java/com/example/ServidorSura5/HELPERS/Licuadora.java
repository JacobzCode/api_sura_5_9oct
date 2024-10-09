package com.example.ServidorSura5.HELPERS;

public class Licuadora {


    //Diseñar un proceso para sumar dos numeros
    public void licuadora() {

        int numeroTres = 10;
        int numeroCuatro = 8;

        int resultadoDos = numeroTres + numeroCuatro;
        System.out.println("La suma es: " + resultadoDos);

        int numeroCinco = 1000000;
        int numeroSeis = 15000000;

        int resultadoTres = numeroCinco + numeroSeis;
        System.out.println("La suma es: " + resultadoTres);

    }

    public Integer sumar(int numero1,int numero2){
        int suma=numero1+numero2;
        return suma;
    }
}