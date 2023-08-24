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
public class Motor {
    int potencia, rpm; 
    String tipoCombustivel;
    
    public Motor(){}
    
    public Motor(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public Motor(int potencia, int rpm){
        this.potencia = potencia;
        this.rpm = rpm;
    }
    
    public Motor(int potencia){
        this.potencia = potencia;
    }
    
    public Motor(int potencia, int rpm, String tipoCombustivel){
        this.potencia = potencia;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    
    public int getPotencia(){
        return potencia; 
    }
    
    public int getRpm(){
        return rpm; 
    }
    
    public String getTipoCombustivel(){
        return tipoCombustivel; 
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
    public void setRpm(int rpm){
        this.rpm = rpm;
    }
    
    public void setTipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void cadastrar(int potencia, int rpm, String tipoCombustivel){
        setPotencia(potencia);
        setRpm(rpm);
        setTipoCombustivel(tipoCombustivel);
    }
    
    public void imprimir(){
        System.out.println("Potencia: " + getPotencia());
        System.out.println("Rpm: " + getRpm());
        System.out.println("Tipo do combustivel: " + getTipoCombustivel());

    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a potencia:");
        setPotencia(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o rpm:");
        setRpm(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o tipo de combustivel:");
        setTipoCombustivel(sc.nextLine());
    }
        
}
