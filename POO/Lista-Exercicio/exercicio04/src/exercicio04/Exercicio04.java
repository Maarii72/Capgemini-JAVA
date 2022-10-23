/*
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        String nome;
        float salarioFixo = 0.0f;
        float totalVendas = 0.0f;
        float salarioMensal = 0.0f;
        float comissao = 0.0f;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor: ");
        nome = leitorScanner.nextLine();
        System.out.println("Digite o Salário Fixo: ");
        salarioFixo = leitorScanner.nextFloat();
        System.out.println("Digite o total de vendas efetuadas: ");
        totalVendas = leitorScanner.nextFloat();
        
        comissao = totalVendas*0.15f;
        salarioMensal = salarioFixo + comissao;
        
        System.out.println("Nome: " + nome);
        System.out.println("salário fixo: " + salarioFixo);
        System.out.println("salário Mensal: " + salarioMensal);
    }
    
}
