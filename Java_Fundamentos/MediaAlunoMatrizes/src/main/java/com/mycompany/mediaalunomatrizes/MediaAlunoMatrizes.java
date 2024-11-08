package com.mycompany.mediaalunomatrizes;

import javax.swing.JOptionPane;

/**
*Algoritmo que solicite ao usuário a entrada de 4 notas
* para cada aluno, calcular a média dos alunos e exibir na tela
* Ao final mostrar a media da turma ao lado da média do aluno deve seguir a seguinte regra de negocio
* media >= 7,5 aprovado
* media >= 5,5 e < 7,5 em recuperação
* media < 5,5 reprovado
 */
public class MediaAlunoMatrizes {

    public static void main(String[] args) {
        //vetor dos alunos
        String [] alunos = {"João", "José","Maria"};
        //matriz das notas
        float [][] notas = new float[3][4];
        float somaNotas, mediaAluno;
        String statusAluno;
        
        //laço externo para associar aluno á nota
        for (int i = 0; i < 3; i++) {
            System.out.println("aluno: " + alunos[i]);
            //laço interno para informar as notas de cada aluno
            somaNotas = 0;
            mediaAluno = 0;
            for (int j = 0; j < 4; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do aluno(a): " + alunos[i]));
                somaNotas = somaNotas + notas[i][j];
            }
            mediaAluno= somaNotas / 4;
            if (mediaAluno < 5.5){
                statusAluno = "Reprovado";
            } else if (mediaAluno >= 5.5 && mediaAluno <= 7.5){
                statusAluno = "Em recuperação";
            } else{
                statusAluno = "Aprovado";
            }
            
            //boletim
            System.out.println("**********Boletim***********");
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Notas");
            for (int l = 0; l < 4; l++) {
                System.out.println((l+1) + " - " + notas[i][l]);
                
            }
            System.out.println("Média: " + mediaAluno + " - " + statusAluno);
        }   
                
        
    }
}
