package exercicio09;

import java.util.Scanner;

/**
Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um 
mês.Considere fixo o juro da poupança em 0,07% a. m;
 */
public class Exercicio09 {
    public static void main(String[] args) {
        float valorDepositado = 0.0f;
        float correcao = 0.0f;
        
       Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite o valor que foi depositado: ");
        valorDepositado = leitorScanner.nextFloat();
        
        correcao = valorDepositado * 0.07f;
        
        System.out.println("O rendimento do depósito após um mês é de: " + (correcao + valorDepositado));
    }
    
}
