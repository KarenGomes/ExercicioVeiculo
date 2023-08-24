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
public class Veiculo {
    protected double preco;
    Motor motor= new Motor();
    protected String marca;
    protected String placa; 
    
    public double getPreco(){
        return preco;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    protected void setPreco(double preco){
        this.preco = preco; 
    }
    
    protected void setMarca(String marca){
        this.marca = marca;
    }
    
    protected void setPlaca(String placa){
        this.placa = placa; 
    }
    
    public Veiculo(){}
    
    public Veiculo(Double preco, String placa, String marca, int potencia, int rpm, String tipoCombustivel){
        this.preco = preco;
        this.marca = marca;
        this.placa = placa;
        motor = new Motor(potencia, rpm, tipoCombustivel);
    }
    
    public Veiculo(Double preco){
        this.preco = preco;
    }
   
    public Veiculo(String placa, String marca){
        this.marca = marca;
        this.placa = placa;
    }    
    
    public Veiculo(String marca){
        this.marca = marca;
    }    
    
    public Veiculo( String placa, Double preco, String marca){
        this.preco = preco;
        this.marca = marca;
        this.placa = placa;
    }
    
    public void cadastrar(double preco, String marca, String placa, int potencia, int rpm, String tipoCombustivel){
        setPreco(preco);
        setMarca(marca);
        setPlaca(placa);
        motor.cadastrar(potencia, rpm, tipoCombustivel);
    }
    
    public void imprimir(){
        System.out.println("Preço: " + getPreco());
        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        motor.imprimir();
    }
    
   
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço:");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());
        System.out.println("Digite a placa ");
        setPlaca(sc.nextLine());
        motor.entradaDados();
        
    }
 
   
   

    
}
