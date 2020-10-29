package br.unicap.ed1.TiposdeDados;

public class LDEDecrescenteComRepetidos <T extends Comparable <T>> {
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
    
    public void inserir (T obj) {
        LDENode<T> novo = new LDENode (obj); 
        LDENode<T> aux,proximo, proc;
        if (this.isEmpty() == true) { // Caso 1: lista vazia
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
            System.out.println("Tarefa cadastrada!");
        }
        else{  // Caso 2: lista não 
            proc = this.BuscaSimples(obj);
            if(proc != null){
                System.out.println("Tarefa repetida!");
            }
            else{
                if (obj.compareTo(this.inicio.getInfo()) > 0) { // Caso 2.1: inserção no início
                    novo.setProx(this.inicio);
                    this.inicio.setAnt(novo);
                    this.inicio = novo;
                    this.qtd++;
                    System.out.println("Tarefa cadastrada!");
                }
                else if (obj.compareTo(this.fim.getInfo()) <= 0) { // Caso 2.2: inserção no final
                    this.fim.setProx (novo);
                    novo.setAnt(this.fim);
                    this.fim = novo;
                    this.qtd++;
                    System.out.println("Tarefa cadastrada!");
                }
                else {  // Caso 2.3: inserção no meio
                    aux = this.fim;
                    while (aux.getInfo().compareTo(obj) < 0) {
                        aux = aux.getAnt();
                    }
                    proximo = aux.getProx();
                    aux.setProx(novo);
                    novo.setAnt(aux);
                    novo.setProx(proximo);
                    proximo.setAnt(novo);
                    this.qtd++;
                    System.out.println("Tarefa cadastrada!");
                }
            }
        }
    }
    
    public LDENode<T> BuscaSimples(T obj){ // busca sequencial simples para buscar pela descrição
        LDENode<T> aux = this.inicio;
        while(aux != null){
            if(aux.getInfo().equals(obj)){
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }
    
    public void QuantidadeTarefa(T obj){    // busca sequencia melhorada que procura o objeto
        LDENode<T> aux;
        aux = this.inicio;
        int cont = 0;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else {
            while(aux != null){
                if(aux.getInfo().equals(obj) == true){
                    System.out.println("Tem " + cont + " tarefas antes");
                    return;
                }
                aux = aux.getProx();
                cont++;
            }
            System.out.println("Descrição não encontrada!");
        }
    }
    
    public void removerInicio(){ // Remover no começo
        if(this.isEmpty() == true){
            System.out.println("Lista vazia!");
        }
        else if(this.qtd == 1){
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
            System.out.println("Remoção efetuada!");
        }
        else{
            this.inicio = this.inicio.getProx();
            this.inicio.setAnt(null);
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
    }
    
    public void remover (T obj) { // remover de acordo com a descrição, ou seja, não terá repetidos
        LDENode<T> aux, anterior, atual;
        if (this.isEmpty() == true) { // Caso 1: Lista vazia?
            System.out.println("Lista está vazia");
        }
        else if (this.inicio.getInfo().equals(obj) == true) { // Caso 2.1: remoção do primeiro
            if (this.qtd == 1) { // a lista só tem um elemento
                this.inicio = null;
                this.fim = null;
            }
            else { // a lista tem mais de um elemento
                this.inicio = this.inicio.getProx();
                this.inicio.setAnt(null);
            }
            this.qtd--;            
            System.out.println("Remoção efetuada!");
        }
        else if (this.fim.getInfo().equals(obj) == true) { // Caso 2.2: remoção do último
            aux = this.fim.getAnt();
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
        else { // remoção de um valor no meio da lista
            atual = this.inicio.getProx();
            while (atual != null) {
                if (atual.getInfo().equals(obj) == true) {
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
    
    public void ExibirUm(T obj){
        LDENode<T> aux;
        aux = this.inicio;
        int cont = 0;
        
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else {
            while(aux != null){
                if(obj.compareTo(aux.getInfo()) == 0){
                    System.out.println(aux.getInfo() + " ");
                    cont++;
                }
                aux = aux.getProx();
            }
            if(cont != 0){
                System.out.println("São " + cont + " tarefas com essa prioridade ");
            }
            else{
                System.out.println("Prioridade não consta na tarefa");
            }
        }
    }
    
    public void exibirTodos () {
        LDENode<T> aux;
        aux = this.inicio;
        if(this.isEmpty() == true){
            System.out.println("Lista vazia!");
        }
        else{
            while (aux != null) {
                System.out.println(aux.getInfo() + " ");
                aux = aux.getProx();
            }
        }
    }
    
    public T Retirar(T obj){ // Retirar objeto da lista, mas retornar a posição guradada dele
        LDENode<T> aux,aux2, anterior, atual;
        if (this.isEmpty() == true) { // Caso 1: Lista vazia?
            System.out.println("Lista está vazia");
        }
        else if (this.inicio.getInfo().equals(obj) == true) { // Caso 2.1: remoção do primeiro
            aux = this.inicio;
            if (this.qtd == 1) { // a lista só tem um elemento
                this.inicio = null;
                this.fim = null;
            }
            else { // a lista tem mais de um elemento
                this.inicio = this.inicio.getProx();
                this.inicio.setAnt(null);
            }
            this.qtd--;            
            return aux.getInfo();
        }
        else if (this.fim.getInfo().equals(obj) == true) { // Caso 2.2: remoção do último
            aux = this.fim.getAnt();
            aux2 = this.fim;
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
            return aux2.getInfo();
        }
        else { // remoção de um valor no meio da lista
            atual = this.inicio.getProx();
            while (atual != null) {
                if (atual.getInfo().equals(obj) == true) {
                    anterior = atual.getAnt();
                    anterior.setProx (atual.getProx());
                    atual.getProx().setAnt(anterior);
                    this.qtd--;
                    return atual.getInfo();
                }
                atual = atual.getProx();             
            }
        }
        return null;
    }
}