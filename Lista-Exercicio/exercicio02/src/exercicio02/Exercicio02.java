package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos;
    public static void main(String[] args) {
        
        int primeiroNumero, segundoNumero, soma, subtracao, multiplicacao, divisao;
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        primeiroNumero = leitorScanner.nextInt();
        System.out.println("Digite o segundo número: ");
        segundoNumero = leitorScanner.nextInt();
        soma = primeiroNumero + segundoNumero;
        System.out.println("Soma: " + soma);
        subtracao = primeiroNumero - segundoNumero;
        System.out.println("Subtração: " + subtracao);
        multiplicacao = primeiroNumero * segundoNumero;
        System.out.println("Multiplicação: " + multiplicacao);
        divisao = primeiroNumero / segundoNumero;
        System.out.println("Divisão: " + divisao);    
    }
    
}
