package exercicio24;
import java.util.Scanner;
public class Exercicio24 {
//24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;

    public static void main(String[] args) {
       char desejaContinuar= 's';
       Scanner leitorScanner = new Scanner(System.in);
       
       while(desejaContinuar == 'S' || desejaContinuar == 's'){
           System.out.println("Digite um número: ");
           int numero = leitorScanner.nextInt();
           if(numero < 0){
              System.out.println("negativo");
           }
           if(numero > 0){
               System.out.println("positivo");
           }else if(numero == 0){
               System.out.println("0");
           }
           
           System.out.println("Digite S se deseja continuar: ");
           desejaContinuar = leitorScanner.next().charAt(0);
       }
    }
    
}
