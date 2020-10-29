package br.unicap.ed1.dados;

public class Contato implements Comparable <Contato>{
    private String nome;
    private int numero;
    private String email;
    
    public Contato(String N){
        this.nome = N;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNumero(int t){
        this.numero = t;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setEmail(String e){
        this.email = e;
    }
    public String getEmail(){
        return this.email;
    }
    @Override
    public String toString () {
        return "O " + this.nome + " possui o número de telefone " + this.numero + " e o email " + this.email;
    }
    @Override
    public int compareTo(Contato c) {
        return this.nome.compareTo(c.getNome());
    }
}