/*
22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado 
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor 
de venda de cada produto, a média de preço de custo e do preço de venda
*/

package exercicio22;
import java.util.Scanner;
public class Exercicio22 {

    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto, precoVenda;
        float totalCusto = 0.0f, totalVenda = 0.0f;
        int countProduto = 0;
        Scanner leitorScanner = new Scanner(System.in);
        
        int i = 0;
        for(; i < 2; i++){
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitorScanner.next();
            
            System.out.println("Digite o Preço de Custo: ");
            precoCusto = leitorScanner.nextFloat();
            
            System.out.println("Digite o Preço de Venda: ");
            precoVenda = leitorScanner.nextFloat();
            
            countProduto++;
            totalCusto = totalCusto + precoCusto;
            
            totalVenda = totalVenda + precoVenda;
            
            if(precoCusto == precoVenda){
                System.out.println("Empate");
            }else{
                if(precoCusto > precoVenda){
                    System.out.println("Prejuízo");
                }else{
                    System.out.println("Lucro");
                }
            }
            
            System.out.println("___________________________________________");
            System.out.println("O Valor de Custo: " + precoCusto);
            System.out.println("O Valor de Venda: " + precoVenda);
           
        }
        
         System.out.println("___________________________________________");  
         System.out.println("A média do Preço de Custo: " + totalCusto / i);
         System.out.println("A média do Preço de Venda: " + totalVenda / i);
    }
    
}
