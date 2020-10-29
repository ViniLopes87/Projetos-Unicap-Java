package br.unicap.ed1.dados;

public class Aluno implements Comparable <Aluno> {
    private String matricula, nome;
    private double nota;
    private int faltas;
    
    public Aluno (String m) { // construtor
        this.matricula = m;
    }
    
    public String getMatricula (){
        return this.matricula;
    } 
    public void setNome (String n){
        this.nome = n;
    }   
    public String getNome () {
        return this.nome;
    }
    public void setNota (double n) {
        this.nota = n;
    }   
    public double getNota () {
        return this.nota;
    }
    public void setFalta(int f){
        this.faltas = f;
    }
    public int getFalta(){
        return this.faltas;
    }
    public String toString () {
        return "O aluno " + this.nome + " que possui a matrícula " + this.matricula + " e possui " + this.faltas + " faltas e tem média final igual a " + this.nota;
    }
    @Override
    public int compareTo(Aluno a) {
        return this.matricula.compareTo(a.getMatricula());
    }
}