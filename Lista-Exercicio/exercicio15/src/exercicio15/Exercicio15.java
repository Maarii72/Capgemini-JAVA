package Exercicio15;
import java.util.Scanner;
public class Exercicio15 {
//15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
   
    public static void main(String[] args) {
        int numero;
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = leitorScanner.nextInt();
        if (numero >= 100 && numero <= 200){
            System.out.println("o número está no intervalo");
        }else{
            System.out.println("o número não está no intervalo");
        }
    }

    
}
