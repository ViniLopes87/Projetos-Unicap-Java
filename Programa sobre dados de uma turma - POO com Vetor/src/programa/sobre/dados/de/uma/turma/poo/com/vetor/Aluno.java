package programa.sobre.dados.de.uma.turma.poo.com.vetor;

public class Aluno {
     private String nome;
     private double media;
     private int faltas;
     
     public Aluno(String N){
         nome = N;
     }
     public void setN(String n){
         nome = n;
     }
     public String getN(){
         return nome;
     }
     public void setM(double m){
         media = m;
     }
     public double getM(){
         return media;
     }
     public void setF(int f){
         faltas = f;
     }
     public int getF(){
         return faltas;
     }
     public String toString(){
         return "O aluno " + nome + " tem média " + media + " e possui " + faltas + " faltas";
     }    
}