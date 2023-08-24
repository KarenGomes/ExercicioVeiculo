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
public class Carro extends Grande implements Motorista{
    protected int volumeMala;
    
    public Carro(){}
    
    public Carro(int numeroPassageiro,int volumeMala){
        super(numeroPassageiro);
        this.volumeMala = volumeMala;
    }
    
    public Carro(int volumeMala){
        this.volumeMala = volumeMala;
    }
    
    public void setVolumeMala(int volumeMala){
        this.volumeMala = volumeMala; 
    }
    
    public int getVolumeMala(){
        return volumeMala;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Volume da mala: " + getVolumeMala());
    }
    
    public void cadastrar(int volumeMala, double preco, String marca, String placa, int potencia, int rpm, String tipoCombustivel, int numeroPassageiro){        
        super.cadastrar(preco, marca, placa, potencia, rpm, tipoCombustivel, numeroPassageiro);
        setVolumeMala(volumeMala);
    }
    
    public void entradaDados(){
       Scanner sc = new Scanner(System.in);
       super.entradaDados();
       System.out.println("Digite o volume da mala:");
       setVolumeMala(Integer.parseInt(sc.nextLine()));
    }
    
    public double desconto(){
       double desconto = 10.00;
       return getPreco() * (desconto /100);
   }
    
    public void acelerar(){
       if (motor.rpm < motor.potencia){
           motor.rpm +=100;
       }
    }
      
    public void desacelerar(){
       if (motor.rpm > 0){
           motor.rpm -=100;
       }
    }
    
    public void frear(){
        System.out.println("Carro freando");
    }
    
    public void virarDireita(){
        System.out.println("carro virarando direita");
    }
    
    public void virarEsquerda(){
        System.out.println("carro virarando esquerda");
    }
    
}
