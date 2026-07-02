package com.Carro.entity;

public class Carro {

    private String modelo;
    private float valor;
    public static int valorTotal;

    public Carro(String modelo, float valor){

        this.modelo = modelo;
        this.valor = valor;
    }
    public void valorTotal(){


    }
    public void exibeCarro(){

        System.out.println("Modelo: " + modelo);
        System.out.println("Valor " + valor);
    }
}
