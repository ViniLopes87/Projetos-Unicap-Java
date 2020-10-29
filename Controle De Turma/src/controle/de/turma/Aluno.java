package controle.de.turma;

public class Aluno {
    private String matricula, nome;
    private double media;
    private int faltas;
    
    public Aluno(String M){
        matricula = M;
    }
    public void setM(String m){
        matricula = m;
    }
    public String getM(){
        return matricula;
    }
    public void setN(String n){
        nome = n;
    }
    public String getN(){
        return nome;
    }
    public void setME(double me){
        media = me;
    }
    public double getME(){
        return media;
    }
    public void setF(int f){
        faltas = f;
    }
    public int getF(){
        return faltas;
    }
    public String toString(){
        return "O aluno " + nome + " de matrícula " + matricula + " possui média igual a " + media + " e possui " + faltas + " faltas";
    } 
}