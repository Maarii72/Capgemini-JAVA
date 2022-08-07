package exercicio06;

import java.util.Scanner;

/**
 Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
possuir ovalor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores
trocados; 
@author Mari
 */
public class Exercicio06 {
     public static void main(String[] args) {
        int A, B,aux;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = leitorScanner.nextInt();
        System.out.println("Digite o valor de B: ");
        B = leitorScanner.nextInt();
        
        aux = A;
        A = B;
        B = aux;
        
        System.out.println("o valor de A: " + A);
        System.out.println("o valor de B: " + B);
    }
    
}
