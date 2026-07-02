package com.Carro.entity;

public class Carro {

    private String modelo;
    private float valor;
    public static float valorTotal;

    public Carro(String modelo, float valor){

        this.modelo = modelo;
        this.valor = valor;

        valorTotal += valor;
    }

    public void exibeCarro(){

        System.out.println("Modelo: " + modelo);
        System.out.println("Valor " + valor + "\n");
    }
}
