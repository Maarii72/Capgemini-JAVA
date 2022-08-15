package exercicio21;

import java.util.Scanner;

/**
Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
public class Exercicio21 {
    public static void main(String[] args) {
        String nome;
        int idade, total = 0;
        char sexo, saude; 
        char desejaRepetir = 's';
    
        Scanner leitor = new Scanner(System.in);
        while (desejaRepetir == 's' || desejaRepetir == 'S'){
            System.out.println("Digite o Nome: ");
            nome = leitor.nextLine();
            
            System.out.println("Digite o caractere correspondente ao sexo: \n F - Feminino \n M - Masculino \n O - outros");
            sexo = leitor.next().charAt(0);
            
            System.out.println("Digite a Idade");
            idade = leitor.nextInt();
            
            System.out.println("Digite correspondente ao estado de saúde: \n b - Boa saúde \n r - saúde ruim");
            saude = leitor.next().charAt(0);
            
            if(sexo == 'M' ||sexo == 'm' && idade >= 18 && saude == 'b'){
                total++;
                System.out.println("Nome: " + nome + "\n Sexo: " + sexo + "\n Idade: " + idade + "\n Saúde: " + saude);
                System.out.println("Você está apt para cumprir o serviço militar obrigatório | No total de pessoas aptas: " + total);
                
            }else{
                System.out.println("Nome: " + nome + "\n Sexo: " + sexo + "\n Idade: " + idade + "\n Saúde: " + saude);
                System.out.println("Você NÃO está apt para cumprir o serviço militar obrigatório");
            }
            
            System.out.println("Deseja fazer nova consulta? S -Sim | N - Não");
            desejaRepetir = leitor.next().charAt(0);
        }   
    }
    
}
