/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioVeiculo;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Moto extends Veiculo implements Motorista {
    protected int volumeBagageiro;
    
    public void setVolumeBagageiro(int volumeBagageiro){
        this.volumeBagageiro = volumeBagageiro;
    }
    
    public int getVolumeBagageiro(){
        return volumeBagageiro;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Volume do bagageiro: " + getVolumeBagageiro());
    }
    
    public void cadastrar(int volumeBagageiro, double preco, String marca, String placa, int potencia, int rpm, String tipoCombustivel){
        super.cadastrar(preco, marca, placa, potencia, rpm, tipoCombustivel);
        setVolumeBagageiro(volumeBagageiro);
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("digite o volume do bagageiro:");
        setVolumeBagageiro(Integer.parseInt(sc.nextLine()));
    }
    
    public void acelerar(){
       if (motor.rpm < motor.potencia){
           motor.rpm +=200;
       }
    }
    
    public void desacelerar(){
       if (motor.rpm > 0){
           motor.rpm -=200;
       }
    }
    
    public void frear(){
        System.out.println("Moto freando");
    }
    
    public void virarDireita(){
        System.out.println("Moto virarando direita");
    }
    
    public void virarEsquerda(){
        System.out.println("Moto virarando esquerda");
    }
   
    public double desconto(){
       double desconto = 8.00;
       return getPreco() * (desconto /100);
   }
}
