package br.unicap.ed1.TiposdeDados;

public class LSE <T extends Comparable<T>>{ //Lista genérica
    private LSENode<T> inicio;
    private LSENode<T> fim;
    private int qtd;
    
    public boolean isEmpty(){
        if(this.qtd == 0){           // ou if (this.inicio == null)
            return true;
        }
        else{
            return false;
        }
    }
    
    public void inserirNoInicio(T obj) {  // inserindo novo nó no início da lista
        LSENode<T> novo;
        novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        }
        else {
            novo.setProx (this.inicio);
            this.inicio = novo;   
        }
        this.qtd++;
    }
    
    public void inserirNoFinal (T obj) {  // inserir um novo nó no final da lista
        LSENode<T> novo;
        novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        }
        else {
            this.fim.setProx(novo);
            this.fim = novo;    
        }
        this.qtd++;
    }
    
    public void removerNoInicio () {
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.inicio.getProx() == null) { // ou if (this.qtd == 1) 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
            System.out.println("Removido da lista");
        }
        else {
            this.inicio = this.inicio.getProx();
            this.qtd--; 
            System.out.println("Removido da lista");
        }
    }
    
    public void removerNoFinal () {
        LSENode<T> aux = this.inicio;
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.qtd == 1) {
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
            System.out.println("Removido da lista");
        }
        else {
            while(aux.getProx() != null){
                if(aux.getProx().getProx() == null){
                    aux.setProx(null);
                    this.fim = aux;
                    this.qtd--;
                    System.out.println("Removido da lista");
                    break;
                }
                aux = aux.getProx();
            }
        }
    }
    
    public LSENode ProcurarValorNo(T obj) {
        LSENode<T> aux,result = null;
        aux = this.inicio;
        if (this.isEmpty() == true) {
            return result;
        }
        else {
            while(aux != null){
                if(obj == aux.getInfo()){
                    result = aux;
                }
                aux = aux.getProx();
            }
            return result;
        }
    }
    
    public void AlterarValor(T obj,T objN){
        if(this.ProcurarValorNo(obj) == null){
            System.out.println("Valor não encontrado na lista");
        }
        else{
            this.ProcurarValorNo(obj).setInfo(objN);
            System.out.println("Valor alterado");
        }
    }
 
    public void ExibirTodos () {
        LSENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + "  ");
            aux = aux.getProx();
        }
        System.out.println();
    }
}