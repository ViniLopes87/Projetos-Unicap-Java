package programa.para.cadastrar.funcionários.vetor.e.poo;

public class Funcionario {
    private int ano;
    private String matricula, nome, cargo;
    private double salario;
    
    public Funcionario(String M){
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
    public void setC(String c){
        cargo = c;
    }
    public String getC(){
        return cargo;
    }
    public void setS(double s){
        salario = s;
    }
    public double getS(){
        return salario;
    }
    public void setA(int a){
        ano = a;
    }
    public int getA(){
        return ano;
    }
    public String toString(){
        return "O funcioário " + nome + " de matrícula " + matricula + " que ocupa o cargo de " + cargo + " e possui um sálario de R$" + salario + " e foi contratado em " + ano;
    }
}