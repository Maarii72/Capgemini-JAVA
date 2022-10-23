package exercicio01;
import java.util.Scanner;
public class Exercicio01 {
//Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
    public static void main(String[] args) {
        int primeiroNumero, segundoNumero, total;
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        primeiroNumero = leitorScanner.nextInt();
        System.out.println("Digite o segundo número: ");
        segundoNumero = leitorScanner.nextInt();
        total = primeiroNumero + segundoNumero;
        System.out.println("Total: " + total);
    }
    
}
