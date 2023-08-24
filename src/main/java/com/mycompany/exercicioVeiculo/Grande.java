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
public class Grande extends Veiculo {
    protected int numeroPassageiro;
    
    public Grande(){}
    
    public Grande(int numeroPassageiro, Double preco, String placa, String marca, int potencia, int rpm, String tipoCombustivel){
        super(preco, placa, marca, potencia, rpm, tipoCombustivel);
        this.numeroPassageiro = numeroPassageiro;
    }
    
    public Grande(int numeroPassageiro){
        this.numeroPassageiro = numeroPassageiro;
    }
    
    public int getNumeroPassageiro(){
        return numeroPassageiro;
    }
    
    protected void setNumeroPassageiro(int numeroPassageiro){
        this.numeroPassageiro = numeroPassageiro;
    }
    
    public void cadastrar(double preco, String marca, String placa, int potencia, int rpm, String tipoCombustivel, int numeroPassageiro){
        super.cadastrar(preco, marca, placa, potencia, rpm, tipoCombustivel);
        setNumeroPassageiro(numeroPassageiro);
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de passageiros: " + getNumeroPassageiro());
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite o numero de passageiros: " );
        setNumeroPassageiro(Integer.parseInt(sc.nextLine()));
    }
    
}
