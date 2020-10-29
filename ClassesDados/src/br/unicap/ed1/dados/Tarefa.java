package br.unicap.ed1.dados;

import java.util.Objects;

public class Tarefa implements Comparable <Tarefa>{
    private String descricao;
    private int prioridade;
    
    public Tarefa(String D){
        this.descricao = D;
    }
    
    public void setPrioridade(int p){
        this.prioridade = p;
    }
    public int getPrioridade(){
        return this.prioridade;
    }
    public void setDescricao(String d){
        this.descricao = d;
    }
    public String getDescricao(){
        return this.descricao;
    }
    @Override
    public String toString () {
        return "O " + this.descricao + " tem prioridade " + this.prioridade;
    }
    @Override
    public int compareTo(Tarefa t) {
        Integer P1 = this.prioridade;
        Integer P2 = t.prioridade;
        return P1.compareTo(P2);
    }
    @Override
    public boolean equals(Object obj) {
        final Tarefa other = (Tarefa) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
}