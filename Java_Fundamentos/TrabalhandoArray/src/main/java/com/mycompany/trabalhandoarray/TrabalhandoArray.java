
package com.mycompany.trabalhandoarray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

    public static void main(String[] args) {
        //declarando o array
        String [] paises = new String[4];
        int[] numeros = new int[10];
        /*
        for(int i = 0; i < 4; i++){
            paises[i] = JOptionPane.showInputDialog("Informe um País: ");
        }
        
        //listsando array de paises
        for (String listaPaises : paises) {
            System.out.println(listaPaises);
        }
        */
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número: "));
        }
        
        //listando array de numeros antes do cálculo
        for (Integer listaNumeros : numeros) {
            System.out.println(listaNumeros);
        }
        
        int novoValor = 11;
        numeros[8] = novoValor + 4;
        
        //listando array de numeros depois do cálculo
        for (Integer listaNumeros : numeros) {
            System.out.println(listaNumeros);
        }
    }
}
