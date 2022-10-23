package exercicio17;

import javax.swing.JOptionPane;

/**
Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 
(inclusive)
 */
public class Exercicio17 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 0; i < 80; i++) {
            String EntraNumero = JOptionPane.showInputDialog("Digite o número");
            int numero = Integer.parseInt(EntraNumero);

            if (numero >= 10 && numero <= 150){
                contador++;
            }
            
        }
       JOptionPane.showMessageDialog(null, "estão no intervalo entre 10 e 150:  " + contador, "números",JOptionPane.INFORMATION_MESSAGE);
    }
}
    
    

