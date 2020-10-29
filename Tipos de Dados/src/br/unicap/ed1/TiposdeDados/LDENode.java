package br.unicap.ed1.TiposdeDados;

public class LDENode <T extends Comparable<T>>{
    private LDENode<T> ant;
    private T info;
    private LDENode<T> prox;
    
    LDENode (T obj) {  // construtor
        this.info = obj;
    }    
    void setInfo (T i){
        this.info = i;
    }    
    T getInfo () {
        return this.info;
    }
    void setProx (LDENode<T> p){
        this.prox = p;
    }    
    LDENode<T> getProx () {
        return this.prox;
    }    
    void setAnt (LDENode<T> a){
        this.ant = a;
    }    
    LDENode<T> getAnt () {
        return this.ant;
    }    
}