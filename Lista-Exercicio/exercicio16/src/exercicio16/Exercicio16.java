package exercicio16;

import java.util.Scanner;

/**
Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
Recuperação (media entre 5.1 a 6.9);
 */
public class Exercicio16 {
    public static void main(String[] args) {
        String nome;
        float n1, n2, n3;
        float media = 0.0f;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = leitorScanner.nextLine();
        System.out.println("Digite a nota 1: ");
        n1 = leitorScanner.nextInt();
        System.out.println("Digite a nota 2: ");
        n2 = leitorScanner.nextInt();
        System.out.println("Digite a nota 3: ");
        n3 = leitorScanner.nextInt();
        
        media = (n1 + n2 + n3) / 3;
        
        if(media >= 7){
            System.out.println("O aluno(a) " + nome + " foi aprovado(a)");
        } else if (media <= 5){
            System.out.println("O aluno(a) " + nome + " foi reprovado(a)");
        }else{
            System.out.println("O aluno(a) " + nome + " está em recuperação");
        }
    }
    
}
