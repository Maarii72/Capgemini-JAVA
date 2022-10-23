package exercicio11;

import java.util.Scanner;

/**
Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        float precoCusto = 0.0f;
        float acrescimo = 0.0f;
        float valorVenda = 0.0f;
        
        System.out.println("Digite o preço de custo do produto: ");
        precoCusto = leitorScanner.nextFloat();
        System.out.println("Digite o percentual para venda: ");
        acrescimo = leitorScanner.nextFloat();
        
        acrescimo = (acrescimo/100) * precoCusto;
        valorVenda = precoCusto + acrescimo;
        System.out.println("O valor de venda é: " + valorVenda);
    }
    
}
