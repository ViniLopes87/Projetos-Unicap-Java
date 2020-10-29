package programa.para.calcular.o.peso.ideal.de.pkg20.pessoas.poo.com.vetor;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private double peso,altura,pesoideal;
    
    public Pessoa(String N){
        nome = N;
    }
    public void setN(String n){
        nome = n;
    }
    public String getN(){
        return nome;
    }
    public void setI(int i){
        idade = i;
    }
    public int getI(){
        return idade;
    }
    public void setS(char s){
        sexo = s;
    }
    public char getS(){
        return sexo;
    }
    public void setP(double p){
        peso = p;
    }
    public double getP(){
        return peso;
    }
    public void setA(double a){
        altura = a;
    }
    public double getA(){
        return altura;
    }
    public void setPI(double pi){
        pesoideal = pi;
    }
    public double getPI(){
        return pesoideal;
    }
    public String toString(){
        return "O cliente " + nome + " do sexo " + sexo + " e de " + idade + " anos e com altura de " + altura + " metros e peso de " + peso + " Kg tem como peso ideal igual a " + pesoideal + " Kg";
    }
}