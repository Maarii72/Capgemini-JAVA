package Construtores;

import Construtores.Aluno.STATUS;
import Construtores.Aluno.Matricula;

public class Construtores {

    public static void main(String[] args) {
        //passando os dados através do construtor com sobrecarga
        Aluno alu = new Aluno(8, 8, 8);
        
        //calculando a media
        double mediaAlunoFinal = alu.calcularMediaAluno();
        
        //situação do aluno
        if(mediaAlunoFinal < 6){
            alu.situacaoAluno = STATUS.REPROVADO;
        }else{
            alu.situacaoAluno = STATUS.APROVADO;
        }
        
        //imprimindo situação do aluno
        System.out.println("A média do aluno é: " + alu.calcularMediaAluno() + " e o aluno está " + alu.situacaoAluno);
    
        //USA ENUM MATRICULA
        alu.situacaoMatricula = Matricula.MATRICULADO;
        System.out.println("O Aluno está: " + alu.situacaoMatricula);
    }
}
