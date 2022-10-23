package exercicio19;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres;
 */
public class Exercicio19 {
    public static void main(String[] args) {
        int mulher = 0;
        int homem = 0;
        int transgenero = 0;
        int naoBinario = 0;

        for (int i = 0; i < 5; i++) {
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            
            String EntraNumero = JOptionPane.showInputDialog("Digite o número referênte ao seu gênero \n 1 - Mulher \n 2 - Homem \n 3 - Transgênero \n 4 - Não Binário");
            int numero = Integer.parseInt(EntraNumero);
            
            switch (numero) {
                case 1:
                    mulher++;
                    break;

                case 2:
                    homem++;
                    break;
                case 3:
                    transgenero++;
                    break;
                case 4:
                    naoBinario++;
                    break;
                default:
                    break;
            }
            
        }
       JOptionPane.showMessageDialog(null, "Total Mulheres:  " + mulher +
                                            "\n Total Homens:  " + homem +
                                            "\n Total Transgênero:  " + transgenero +
                                            "\n Total Não Binário:  " + naoBinario, "números",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
