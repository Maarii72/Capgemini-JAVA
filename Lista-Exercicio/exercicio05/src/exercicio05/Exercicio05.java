/*
Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média (aritmética);
 */
package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
         String nome;
        float nota1 = 0.0f;
        float nota2 = 0.0f;
        float nota3 = 0.0f;
        float media = 0.0f;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = leitorScanner.nextLine();
        System.out.println("Digite a nota 1: ");
        nota1 = leitorScanner.nextFloat();
        System.out.println("Digite a nota 2: ");
        nota2 = leitorScanner.nextFloat();
        System.out.println("Digite a nota 3: ");
        nota3 = leitorScanner.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Média: " + media);
    }
    
}
