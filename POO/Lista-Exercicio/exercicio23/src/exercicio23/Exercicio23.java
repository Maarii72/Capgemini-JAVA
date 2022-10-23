package exercicio23;

import java.util.Scanner;

/**
Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, 
menor que 25 ou igual a 40;
 */
public class Exercicio23 {
    public static void main(String[] args) {
        int numero;
       
        Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o Número: ");
            numero = leitor.nextInt();
            
            if(numero > 80){
                System.out.println("Maior que 80");
            }
            else if(numero < 25){
                System.out.println("Menor que 25");
            }
            else if(numero == 40){
                System.out.println("Igual a 40");
            }
    }
    
}
