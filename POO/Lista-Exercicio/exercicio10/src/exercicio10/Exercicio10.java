package exercicio10;

import java.util.Scanner;

/**
A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */
public class Exercicio10 {
    public static void main(String[] args) {
        float valorCompra = 0.0f;
        float prestacoes = 0.0f;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        valorCompra = leitorScanner.nextFloat();
        
        prestacoes = valorCompra / 5;
        
        System.out.println("O cliente deverá pagar 5 prestações de R$" + prestacoes + " cada");
    }
    
}
