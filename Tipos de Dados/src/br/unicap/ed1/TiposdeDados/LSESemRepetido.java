package br.unicap.ed1.TiposdeDados;

public class LSESemRepetido <T extends Comparable<T>>{
    private LSENode<T> inicio;
    private LSENode<T> fim;
    private int qtd;
    
    public boolean isEmpty(){
        if(this.qtd == 0){            // ou if (this.inicio == null)
            return true;
        }
        else{
            return false;
        }
    }
    
    public void inserirNoInicio(T obj) {  // inserindo novo nó no início da lista
        LSENode<T> novo, aux;
        novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
            System.out.println("Cadastrado");
        }
        else {
            aux = this.BuscaSimples(obj);
            if(aux == null){
                novo.setProx (this.inicio);
                this.inicio = novo;
                this.qtd++;
                System.out.println("Cadastrado");
            }
            else{
                System.out.println("Valor repetido!");
            }
        } 
    }
    
    public void inserirNoFinal (T obj) {  // inserir um novo nó no final da lista
        LSENode<T> novo, aux;
        novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
            System.out.println("Cadastrado");
        }
        else {
            aux = this.BuscaSimples(obj);
            if(aux == null){
                this.fim.setProx(novo);
                this.fim = novo; 
                this.qtd++;
                System.out.println("Cadastrado");
            }
            else{
                System.out.println("Valor repetido!");
            }  
        }
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
    
    public void Remover (T obj) {
        LSENode<T> aux,auxAnt;
        aux = this.inicio;
        auxAnt = null;
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
            while(aux != null){
                if(aux.getInfo().compareTo(obj) == 0){
                    auxAnt.setProx(aux.getProx());
                    this.qtd--;
                    System.out.println("Removido");
                    break;
                }
                auxAnt = aux;
                aux = aux.getProx();  
            }
        }
    }
    
    private LSENode<T> BuscaSimples(T obj) {   // busca sequencia simples
        LSENode<T> aux;
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
    
    public T AlterarValor(T obj){    // busca sequencia simples que procura o objeto para alterar
        LSENode<T> aux;
        aux = this.inicio;
        if (this.isEmpty() == true) {
            return null;
        }
        else {
            while(aux != null){
                if(obj.compareTo(aux.getInfo()) == 0){
                    return aux.getInfo();
                }
                aux = aux.getProx();
            }
            return null;
        }
    }
    
    public void ExibirUm(T obj){
        LSENode<T> aux;
        
        aux = this.BuscaSimples(obj);
        if(aux == null){
            System.out.println("Produto não encontrado");
        }
        else{
            System.out.println(aux.getInfo());
        }
    }
    
    public void ExibirTodos () {
        LSENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }
}