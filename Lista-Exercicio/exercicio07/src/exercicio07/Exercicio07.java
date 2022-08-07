package exercicio07;

import java.util.Scanner;

/**
Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;  
@author Mari
 */
public class Exercicio07 {
    public static void main(String[] args) {
        float celsius = 0.0f;
        float fahrenheit = 0.0f;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = leitorScanner.nextFloat();
        
        fahrenheit = (9*celsius+160);
        
        System.out.println("A temperatura em Fahrenheit: " + fahrenheit);
    }
    
}
