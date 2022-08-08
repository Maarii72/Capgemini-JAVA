package exercicio12;

import java.util.Scanner;

/**
O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do 
mesmo;
 */
public class Exercicio12 {
public static void main(String[] args) {
        float custoFabrica = 0.0f;
        float custoFinal = 0.0f;

        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Informe o custo de fábrica do veículo: ");
        custoFabrica = leitorScanner.nextFloat();
        
        custoFinal = custoFabrica + (0.28f * custoFabrica) + (0.45f * custoFabrica);
        custoFinal = custoFinal + (0.45f * custoFinal);
        System.out.println("O custo para o consumidor final é de: " + custoFinal);

    }
    
}
