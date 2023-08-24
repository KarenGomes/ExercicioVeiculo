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
public class Onibus extends Grande implements Motorista {
    boolean banheiro;
    
    public void setBanheiro(boolean banheiro){
        this.banheiro = banheiro;
    }
    
    public boolean getBanheiro(){
        return banheiro;
    }
    
    public void imprimir(){
        super.imprimir();
        if (getBanheiro() == true){
            System.out.println("Banheiro: sim");
        }
        else{
            System.out.println("Banheiro: não");
        }
    }
    
    public void cadastrar(double preco, String marca, String placa, int potencia, int rpm, String tipoCombustivel, int numeroPassageiro, boolean banheiro){
        super.cadastrar(preco, marca, placa, potencia, rpm, tipoCombustivel);
        setBanheiro(banheiro);
    }
    
    public void entradaDados(){
        String resposta;
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Possui banheiro? [S] ou [N]");
        resposta = sc.nextLine();
        if ("S".equals(resposta.toUpperCase())){
            setBanheiro(true);
        }
        else{
            setBanheiro(false);
        }
    }
   
    public void acelerar(){
       if (motor.rpm < motor.potencia){
           motor.rpm +=50;
       }
    }
    
    public void desacelerar(){
       if (motor.rpm > 0){
           motor.rpm -=50;
       }
    }
    
    public void frear(){
        System.out.println("onibus freando");
    }
    
    public void virarDireita(){
        System.out.println("onibus virarando direita");
    }
    
    public void virarEsquerda(){
        System.out.println("onibus virarando esquerda");
    }
   
    
    public double desconto(){
       double desconto = 15.00;
       return getPreco() * (desconto /100);
   }
}
