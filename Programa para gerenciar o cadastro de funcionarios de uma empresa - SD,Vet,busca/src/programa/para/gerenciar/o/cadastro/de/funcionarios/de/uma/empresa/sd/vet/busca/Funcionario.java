package programa.para.gerenciar.o.cadastro.de.funcionarios.de.uma.empresa.sd.vet.busca;

public class Funcionario implements Comparable <Funcionario> {
    private String matricula,nome;
    private double salario;
    private int ano;
    
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
        return "O Funcionário " + nome + " de matrícula " + matricula + " possui salário de " + salario + " reais e foi contratado no ano de " + ano;
    }
    public int compareTo (Funcionario f) {
        return this.matricula.compareTo(f.matricula);
    }
}