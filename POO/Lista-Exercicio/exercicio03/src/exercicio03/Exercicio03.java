//Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;
package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
       int distancia, combustivel, mediaConsumo;
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite a distância total percorrida pelo automóvel(km): ");
        distancia = leitorScanner.nextInt();
        System.out.println("Digite o total de combustível gasto(L): ");
        combustivel = leitorScanner.nextInt();
        mediaConsumo = distancia / combustivel;
        System.out.println("O consumo médio é: " + mediaConsumo + " km/l");
    }
}
