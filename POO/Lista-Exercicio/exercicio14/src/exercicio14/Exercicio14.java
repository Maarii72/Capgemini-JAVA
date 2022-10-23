package exercicio14;

import java.util.Scanner;

/**
Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior
 */
public class Exercicio14 {
 public static void main(String[] args) {
        int v1, v2;

        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        v1 = leitorScanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        v2 = leitorScanner.nextInt();
        
        if(v1 > v2){
           System.out.println("O número " + v1 + " é maior"); 
        }else if(v2 > v1){
           System.out.println("O número " + v2 + " é maior"); 
        }else{
        System.out.println("Os números são iguais");
        }
    }
    
}
