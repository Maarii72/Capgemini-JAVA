
package Construtores;
public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    STATUS situacaoAluno;
    Matricula situacaoMatricula;
    
    public Aluno(double nota1,double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public enum Matricula {
        MATRICULADO,
        PENDENTE,
        RECUSADO
    }
    
    //definindo um enumerador
    public enum STATUS{
        APROVADO,
        REPROVADO
    }
    
    //metodo para calcularMediaAluno
    public double calcularMediaAluno(){
        double mediaAluno = 0;
        //calculo da média
        mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
        return mediaAluno;
    }
}
