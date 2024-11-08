package com.mycompany.arraylistcarros;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListCarros {

    public static void main(String[] args) {
        //construindo um arrayList para carros
        ArrayList<String> carros = new ArrayList<>();
        
        //adicionando carros ao arraylist
        carros.add("Kombi");
        carros.add("Jaguar");
        carros.add("BMW");
        carros.add("Mercedes");
        carros.add("Fusca");
        carros.add("Vectra");
        
        //mostrar aray
        System.out.println(carros);
        
        //substituir fusca por Mitsibishi
        carros.set(4, "Mitsibishi");
        
        //mostrar aray
        System.out.println(carros);
        
        //adicionando carros ao arraylist com joptionpane
        carros.add(JOptionPane.showInputDialog("informe a marca do carro"));
        //mostrar array
        System.out.println(carros);
        
        //esvaziando o array
        //carros.clear();
        
        //verificar se está vazio
        if (carros.isEmpty()) {
            System.out.println("O vetor está vazio");
        }
        
        //array carrros contem bmw
        if (carros.contains("BMW")) {
            for (int i = 0; i < carros.size(); i++) {
                if("BMW".equals(carros.get(i))){
                carros.set(i,"Bugatti");
                break;
                }
            } 
  
        } else{
                System.out.println("Busca não encontrada");                
            }
         System.out.println(carros);
    }             
       
    }

