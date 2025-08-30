package com.nicolas.projeto;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties;

public class Carro {
    //atributos
    String  marca;
    String  cor ;
    Integer ano;

    // contrutor
    public Carro ( String  marca,String cor,Integer ano ){
        this.marca=marca;
        this.cor = cor;
        this.ano= ano;

    }
    //metodos
    void buzinar(){
        System.out.println("biiiiiiiiiiiiiii  biiiiiiiiiiiiiiiiiii");

    }
     void mostrarInfo(){
        System.out.println("marca"+marca+ "cor "+ cor +"Ano"+ ano);
     }
}
