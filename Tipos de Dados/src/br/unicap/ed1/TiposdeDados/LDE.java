package br.unicap.ed1.TiposdeDados;

// Lista duplamente encadeada não ordenada e que permite valores repetidos

public class LDE <T extends Comparable <T>>{ // lista genérica

    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;

    public boolean isEmpty() {  // está vazia??
        if (this.qtd == 0) {  // ou if (this.inicio == null)
            return true;
        } else {
            return false;
        }
    }
    
    public void exibirTodos () {
        LDENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }
    
    public void inserirNoInicio (T obj) {
        LDENode<T> novo = new LDENode (obj);
        if (this.isEmpty() == true) { // Caso 1: lista VAZIA
            this.inicio = novo;
	    this.fim = novo;
        }
        else {
            novo.setProx(this.inicio);
	    this.inicio.setAnt(novo);
	    this.inicio = novo;
        }
        this.qtd++;
    }
    
    public void removerNoFinal () {
        LDENode<T> aux;
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.inicio.getProx() == null) { // ou if (this.qtd == 1) 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        }
        else { // lista tem mais de um nó
            aux = this.fim.getAnt(); // referencia o penúltimo nó
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
        }       
    }
}