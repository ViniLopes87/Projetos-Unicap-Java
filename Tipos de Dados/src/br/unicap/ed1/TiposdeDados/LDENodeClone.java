package br.unicap.ed1.TiposdeDados;

public class LDENodeClone <T extends Objeto<T>>{
    private LDENodeClone<T> ant;
    private T info;
    private LDENodeClone<T> prox;
    
    LDENodeClone (T obj) {  // construtor
        this.info = obj;
    }    
    void setInfo (T i){
        this.info = i;
    }    
    T getInfo () {
        return this.info;
    }
    void setProx (LDENodeClone<T> p){
        this.prox = p;
    }    
    LDENodeClone<T> getProx () {
        return this.prox;
    }    
    void setAnt (LDENodeClone<T> a){
        this.ant = a;
    }    
    LDENodeClone<T> getAnt () {
        return this.ant;
    }    
}