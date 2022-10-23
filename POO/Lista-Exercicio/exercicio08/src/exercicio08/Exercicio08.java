package exercicio08;

import java.util.Scanner;

/**
Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
disponíveis com ousuário;
 @author Mari
 */
public class Exercicio08 {
    public static void main(String[] args) {
        float valorReal = 0.0f;
        float valorDolar = 0.0f;
        float cotacao = 0.0f;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite o valor em Dólar: ");
        valorDolar = leitorScanner.nextFloat();
        System.out.println("Digite a cotação: ");
        cotacao = leitorScanner.nextFloat();
        
        valorReal = (valorDolar / cotacao);
        System.out.println("valor em Real é: " + valorReal);
    }
    
}
