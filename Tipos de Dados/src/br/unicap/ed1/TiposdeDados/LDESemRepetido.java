package br.unicap.ed1.TiposdeDados;

// Lista duplamente encadeada não ordenada e que não permite valores repetidos

public class LDESemRepetido <T extends Comparable <T>>{
    
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
    
    private LDENode<T> BuscaSimples(T obj) {   // busca sequencia simples
        LDENode<T> aux;
        aux = this.inicio;
        if (this.isEmpty() == true) {
            return null;
        }
        else {
            while(aux != null){
                if(obj.compareTo(aux.getInfo()) == 0){
                    return aux;
                }
                aux = aux.getProx();
            }
            return null;
        }
    }
    
    public void Cadastrar (T obj) {  // inserir um novo nó no final da lista
        LDENode<T> novo, aux;
        novo = new LDENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
            System.out.println("Cadastrado efetuado!");
        }
        else {
            aux = this.BuscaSimples(obj);
            if(aux == null){
                this.fim.setProx(novo);
                novo.setAnt(this.fim);
                this.fim = novo; 
                this.qtd++;
                System.out.println("Cadastrado efetuado!");
            }
            else{
                System.out.println("Pessoa já cadastrada!");
            }  
        }
    }
    
    public void Cancelar(){
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
        System.out.println("Remoção efetuada!");
    }
        
    public void ExibirTodos () {
        LDENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }
    
    public void Verificar(T obj){
        LDENode<T> aux;
        aux = this.BuscaSimples(obj);
        
        if(aux == null){
            System.out.println("Pessoa não encontrada no prédio");
        }
        else{
            System.out.println("Pessoa está no prédio");
        }
    }
    
    public void Quantidade(){
        System.out.println("É constatada a presença de " + this.qtd + " pessoas no prédio");
    }
    
    public void Remover (T obj) { // versão 1
        LDENode<T> aux, anterior, atual;
        if (this.isEmpty() == true) { // Caso 1: Lista vazia?
            System.out.println("Lista está vazia");
        }
        else if (this.inicio.getInfo().compareTo(obj) == 0) { // Caso 2.1: remoção do primeiro
            if (this.qtd == 1) { // a lista só tem um elemento
                this.inicio = null;
                this.fim = null;
            }
            else { // a lista tem mais de um elemento
                this.inicio = this.inicio.getProx();
            }
            this.qtd--;            
            System.out.println("Remoção efetuada!");
        }
        else if (this.fim.getInfo().compareTo(obj) == 0) { // Caso 2.2: remoção do último
            aux = this.fim.getAnt();
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
        else { // remoção de um valor no meio da lista
            atual = this.inicio.getProx();
            while (atual != null) {
                if (atual.getInfo().compareTo(obj) == 0) {
                    anterior = atual.getAnt();
                    anterior.setProx (atual.getProx());
                    atual.getProx().setAnt(anterior);
                    this.qtd--;
                    System.out.println("Remoção efetuada!");
                    return;
                }
                atual = atual.getProx();             
            }
            System.out.println("Elemento não encontrado!");            
        }
    }
}