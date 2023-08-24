/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicioVeiculo;

/**
 *
 * @author Karen
 */
public class ExercicioVeiculo {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        Onibus onibus = new Onibus(); 
        
        System.out.println("Preencha os dados do carro: ");
        carro.entradaDados();
        System.out.println("\nPreencha os dados da moto: ");
        moto.entradaDados();
        System.out.println("\nPreencha os dados do ônibus: ");
        onibus.entradaDados();
        
        System.out.println("\nCarro:\n");
        carro.imprimir();
        System.out.println("\nMoto:\n");
        moto.imprimir();
        System.out.println("\nMoto:\n");
        onibus.imprimir();
        
        onibus.acelerar();
        onibus.acelerar();
        onibus.virarDireita();
        carro.acelerar();
        carro.virarEsquerda();
        moto.frear();
        
        System.out.println("\nCarro:\n");
        carro.imprimir();
        System.out.println("\nMoto:\n");
        moto.imprimir();
        System.out.println("\nÔnibus:\n");
        onibus.imprimir();

        
        
        
    }
}
