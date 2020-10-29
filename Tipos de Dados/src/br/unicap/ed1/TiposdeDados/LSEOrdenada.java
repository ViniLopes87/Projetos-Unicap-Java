package br.unicap.ed1.TiposdeDados;

public class LSEOrdenada <T extends Comparable<T>>{
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
    
    public void inserirOrdenada (T obj) {
        LSENode<T> novo = new LSENode (obj);
        LSENode<T> anterior = null, atual;
        if (this.isEmpty() == true) {   // caso 1: lista vazia
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
            System.out.println("Cadastrado");
        }
        else{  // caso 2: lista não vazia
            if(obj.compareTo(this.inicio.getInfo()) < 0){  // caso 2.1: inserção no início da lista
                novo.setProx(this.inicio);
                this.inicio = novo;
                this.qtd++;
            }
            else if(obj.compareTo(this.fim.getInfo()) > 0){  // caso 2.2: inserção no final da lista
                this.fim.setProx(novo);
                this.fim = novo;
                this.qtd++;
            }
            else{  // caso 2.3: inserção no meio da lista
                atual = this.inicio;   //iniciar com o primeiro nó
                while(true){
                    if(atual.getInfo().compareTo(obj) == 0){
                        System.out.println("Valor repetido! Inserção não efetuada");
                        return;  // sair do método de inserção
                    }
                    else if(atual.getInfo().compareTo(obj) > 0){
                        anterior.setProx(novo);
                        novo.setProx(atual);
                        System.out.println("Inserção efetuada");
                        return;
                    }
                    else{
                        anterior = atual;
                        atual = atual.getProx();
                    }
                }
            }
        }
    }
    
    public void remover (T obj) { // versão 1
        LSENode<T> aux, anterior, atual;
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
            aux = this.inicio;
            while (aux.getProx() != this.fim) { // chegar no penúltimo
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
        else { // remoção de um valor no meio da lista
            anterior = this.inicio;
            atual = anterior.getProx();
            while (atual != null) {
                if (atual.getInfo().compareTo(obj) == 0) {
                    anterior.setProx (atual.getProx());
                    this.qtd--;
                    System.out.println("Remoção efetuada!");
                    return;
                }
                anterior = anterior.getProx();
                atual = atual.getProx();             
            }
            System.out.println("Elemento não encontrado!");            
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
    
    private LSENode<T> BuscaMelhorada(T obj) {   // busca sequencia melhorada
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
                else if(aux.getInfo().compareTo(obj) > 0){
                    return aux;
                }
                aux = aux.getProx();
            }
            return null;
        }
    }
    
    public void ExibirUm(T obj){
        LSENode<T> aux;
        
        aux = this.BuscaMelhorada(obj);
        if(aux == null){
            System.out.println("Produto não encontrado");
        }
        else{
            System.out.println(aux.getInfo());
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
                else if(aux.getInfo().compareTo(obj) > 0){
                    return aux.getInfo();
                }
                aux = aux.getProx();
            }
            return null;
        }
    }
}