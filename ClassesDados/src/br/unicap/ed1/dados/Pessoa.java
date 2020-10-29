package br.unicap.ed1.dados;

public class Pessoa implements Comparable <Pessoa> {
    private final String RG;
    private String nome;
    
    public Pessoa (String I) { // construtor
        this.RG = I;
    }
    
    public String getRG () {
        return this.RG;
    }  
    public void setNome (String n){
        this.nome = n;
    }   
    public String getNome() {
        return this.nome;
    }
    @Override
    public String toString () {
        return "O " + this.nome + " possui o RG " + this.RG;
    }
    @Override
    public int compareTo(Pessoa p) {
        return this.RG.compareTo(p.getRG());
    }
}