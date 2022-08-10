package exercicio18;

import javax.swing.JOptionPane;

/**
. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
public class Exercicio18 {
    public static void main(String[] args) {
         int ContaMaiorQue18=0;

        for (int i = 0; i < 75; i++) {
            String EntraIdade = JOptionPane.showInputDialog("Digite a Idade");
            int IdadeDigitada = Integer.parseInt(EntraIdade);

            if (IdadeDigitada >= 18){
                ContaMaiorQue18++;
            }
            
        }
       JOptionPane.showMessageDialog(null, "Maiores que 18:   " + ContaMaiorQue18, "Maiores de idade",JOptionPane.INFORMATION_MESSAGE);
    }
}
