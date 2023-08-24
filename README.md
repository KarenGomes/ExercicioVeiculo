# ExercicioVeiculo
Exercício para praticar JAVA.

## Classes

- No projeto há uma superclasse Veiculo não instanciada que atende as necessidades das subclasses Carro, Moto, Onibus;
- A classe Motor serve como uma classe de agregação;
- A classe Grande tem como função unir características similares entre as classes Carro e Onibus;

## Interface

A interface motorista garante que a idade mínima para dirigir seja 18 anos, assim como apresenta 5 movimentos para cada veiculo e o desconto através dos métodos:

public void acelerar();
public void frear();
public void virarEsquerda();
public void virarDireita();
public void desconto();

## Aplicação

Na aplicação são criados 3 objetos (carro, moto, onibus) e são utilizados determinados métodos para praticar a entrada e saída de dados.

