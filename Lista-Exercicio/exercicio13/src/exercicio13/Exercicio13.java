package exercicio13;

import java.util.Scanner;


//Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10

public class Exercicio13 {
    public static void main(String[] args) {
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = leitorScanner.nextInt();
        if(numero > 10)
            System.out.println("O número é maior que 10");
    }
    
}
