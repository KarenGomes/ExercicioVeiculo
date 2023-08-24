/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.exercicioVeiculo;

/**
 *
 * @author Karen
 */
public interface Motorista {
    public static final int IDADEMINIMAMOTORISTA = 18;
    public void acelerar();
    public void desacelerar();
    public void frear();
    public void virarEsquerda();
    public void virarDireita();
    public double desconto();
}
