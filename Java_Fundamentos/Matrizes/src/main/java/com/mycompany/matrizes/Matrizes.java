package com.mycompany.matrizes;

import javax.swing.JOptionPane;

public class Matrizes {

    public static void main(String[] args) {
        // vetor dos alunos
        String [] alunos = {"JOÃO","JOSÉ","MARIA"};
        
        //Matriz das notas
        float [][] notas = new float[3][4];
        
        //para controlar o somatório das notas de cada aluno
        //para calcular a media do aluno
        float somaNotas, mediaAluno;
        
        //para armazenar o status do aluno e exibir o bolean
        String statusAluno;
        
        //informar as notas dos alunos
        //laço externo para associar aluno á nota
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno: " + alunos[i]);
            //laço interno para informar as notas de cada aluno
            somaNotas = 0;
            mediaAluno = 0;
            
            for (int j = 0; j < 4; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + (j+1) + "º nota do aluno " + alunos[i] + ": "));
                somaNotas = somaNotas + notas[i][j];
            }
            mediaAluno = somaNotas / 4;
            if (mediaAluno < 5.5){
                statusAluno = "REPROVADO";
            }else if (mediaAluno >= 5.5 && mediaAluno <= 7.5){
                statusAluno = "EM RECUPERAÇÃO";
            }else{
                statusAluno = "APROVADO";
            }
            
            //impressão do boletim
            System.out.println("\n************BOLETIM**********");
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Notas: ");
            for (int jl = 0; jl < 4; jl++) {
                System.out.println((jl+1) + " - " + notas[i][jl]);
            }
            System.out.println("Média: " + mediaAluno + " - " + statusAluno);
        }
    }
}
