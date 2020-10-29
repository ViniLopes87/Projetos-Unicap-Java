package br.unicap.ed1.TiposdeDados;

public class LDECircular <T extends Comparable<T>>{
    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;
    
    public boolean isEmpty () {
        if (this.inicio == null) { // ou if (this.qtd == 0)
            return true;
        }
        else {
            return false;
        }
    }
    
    public void inserirNoInicio (T obj) {
        LDENode<T> novo = new LDENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);            
        }
        else {
            novo.setProx (this.inicio);
            this.inicio.setAnt(novo);
            this.inicio = novo;
            this.qtd++;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);              
        }        
    }
    
    public void inserirNoFinal (T obj) {
        LDENode<T> novo = new LDENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);            
        }
        else {
            this.fim.setProx(novo);
            novo.setAnt(this.fim);
            this.fim = novo;
            this.qtd++;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);              
        }        
    }
    
    public void Remover (T obj) { // versão 1
        LDENode<T> anterior, atual;
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
                this.inicio.setAnt(this.fim);   // torna a lista circular
                this.fim.setProx(this.inicio);  // torna a lista circular
            }
            this.qtd--;            
            System.out.println("Remoção efetuada!");
        }
        else if (this.fim.getInfo().compareTo(obj) == 0) { // Caso 2.2: remoção do último
            this.fim = this.fim.getAnt();
            this.inicio.setAnt(this.fim);   // torna a lista circular
            this.fim.setProx (this.inicio); // torna a lista circular
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
    
    public void exibirTodos () {
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        }
        else {
            aux = this.inicio;
            do {
                System.out.println(aux.getInfo() + " ");
                aux = aux.getProx();
            } while (aux != this.inicio);
        }
    }
    
    public void Concatenar(LDECircular<T> Lista2){
        LDENode<T> auxB = Lista2.inicio;
          
        if(this.isEmpty() == true){
            while (auxB != null) {
                this.inserirNoFinal(auxB.getInfo());
                Lista2.Remover(auxB.getInfo());
                auxB = Lista2.inicio;
            }
        }
        else if(Lista2.isEmpty() == true){
            System.out.println("Lista 2 está vazia!");
        }
        else if(this.isEmpty() == true && Lista2.isEmpty() == true){
            System.out.println("As duas listas estão vazias");
        }
        else{
            while (auxB != null) {
                this.inserirNoFinal(auxB.getInfo());
                Lista2.Remover(auxB.getInfo());
                auxB = Lista2.inicio;
            }
            System.out.println("Listas concatenadas");
        }
    }
    
    public LDECircular Dividir (){
        LDECircular<T> ListaC = new LDECircular();
        LDENode<T> aux;
        
        int meio = this.qtd/2,i;
        
        if(this.isEmpty() == true){
            System.out.println("Lista vazia, não pode divir!");
        }
        else if(this.qtd == 1){
            System.out.println("Lista só tem 1 nó, então não pode dividir!");
        }
        else{
            aux = this.fim;
            for(i = this.qtd; i > meio; i--){
                ListaC.inserirNoFinal(aux.getInfo());
                this.Remover(aux.getInfo());
                aux = aux.getAnt();
            }
            return ListaC;
        }
        return null;
    }
}