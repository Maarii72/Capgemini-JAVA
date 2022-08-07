package exercicio35;
import java.util.Scanner;
public class Exercicio35 {

    public static void main(String[] args) {
        double consumoKw;
        int tipoCliente;
        double valorConta = 0.0f;
        
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("-----Digite o número correspondente----"
            + "\n 1 - Residêncial \n 2 - Comércio \n 3 - Indústria\n-----------------------------------------");
            tipoCliente = leitorScanner.nextInt();
        
        System.out.println("Digite o consumo em KW/h: ");
            consumoKw = leitorScanner.nextFloat();
        
            switch(tipoCliente){
                case 1:
                    System.out.println("O valor da Conta de Luz é: R$" + (valorConta = consumoKw * 0.60) + " reais");
                    break;
                case 2:
                    System.out.println("O valor da Conta de Luz é: R$" + (valorConta = consumoKw * 0.48) + " reais");
                    break;
                case 3:
                    System.out.println("O valor da Conta de Luz é: R$" + (valorConta = consumoKw * 1.29) + " reais");
                    break;
                default:
                    System.out.println("Digitou um tipo de Cliente inválido: ");
            }
    }
    
}
