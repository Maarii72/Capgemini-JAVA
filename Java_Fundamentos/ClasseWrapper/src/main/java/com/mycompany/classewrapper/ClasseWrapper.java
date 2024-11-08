package com.mycompany.classewrapper;
public class ClasseWrapper {

    public static void main(String[] args) {
        //um tipo primitivo não tem como transformar em objeto 
        //as classes wrapper
        //Autoboxing exemplos
        
        Boolean bolWrapped = true;
        System.out.println(bolWrapped.getClass());
        
        Character chWrapped = 'a';
        System.out.println(chWrapped.getClass());
        
        Byte byteWrapped = 1;
        System.out.println(byteWrapped.getClass());
        
        int numero = Integer.parseInt("1");
        numero = numero + 1;
        System.out.println(numero);
    }
}
