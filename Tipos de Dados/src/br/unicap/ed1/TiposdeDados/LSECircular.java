package br.unicap.ed1.TiposdeDados;

public class LSECircular <T extends Comparable<T>>{
    private LSENode<T> inicio;
    private LSENode<T> fim;
    private int qtd;
    
    public boolean isEmpty () {
        if (this.inicio == null) { // ou if (this.qtd == 0)
            return true;
        }
        else {
            return false;
        }
    }
    
    public void inserirNoFinal (T obj) {
        LSENode<T> novo = new LSENode (obj);        
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
            this.fim.setProx(this.inicio); // torna a lista circular
        }
        else {
            this.fim.setProx(novo);
            novo.setProx(this.inicio); // torna a lista circular
            this.fim = novo;
            this.qtd++;
        }   
    }
    
    public void exibirTodos () {
        LSENode<T> aux;
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
    
    public T Consultar(T obj){    // busca sequencia simples que procura o objeto para alterar
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
    
    public boolean BuscaSimples(T obj){ // busca sequencial simples para verificar a matrícula é válida
        LSENode<T> aux = this.inicio;
        while(aux != null){
            if(aux.getInfo().compareTo(obj) == 0){
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }
    
    public void Remover (T obj) { // versão 1
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
                this.fim.setProx(this.inicio); // torna a lista circular
            }
            this.qtd--;            
            System.out.println("Remoção efetuada!");
        }
        else if (this.fim.getInfo().compareTo(obj) == 0) { // Caso 2.2: remoção do último
            for (aux = this.inicio; aux.getProx() != this.fim; aux = aux.getProx()) {                
            }
            this.fim = aux;
            this.fim.setProx (this.inicio); // torna a lista circular
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
        else { // remoção de um valor no meio da lista
            atual = this.inicio.getProx();
            anterior = this.inicio;
            while (atual != null) {
                if (atual.getInfo().compareTo(obj) == 0) {
                    anterior.setProx(atual.getProx());
                    this.qtd--;
                    System.out.println("Remoção efetuada!");
                    return;
                }
                anterior = atual;
                atual = atual.getProx();             
            }
            System.out.println("Elemento não encontrado!");            
        }
    }
    
    public void ExibirUm(T obj){
        LSENode<T> aux = new LSENode<T> (obj);
        
        if(this.BuscaSimples(obj) == false){
            System.out.println("Matrícula não está cadastrada");
        }
        else{
            System.out.println(aux.getInfo());
        }
    }
    
    public boolean Igual(LSECircular<T> Lista2){
        LSENode<T> auxA = this.inicio;
        LSENode<T> auxB = Lista2.inicio;
        
        if(this.qtd > Lista2.qtd){
            return false;
        }
        else if(this.qtd < Lista2.qtd){
            return false;
        }
        else{
            while(auxA != null){
                if (auxA.getInfo().compareTo(auxB.getInfo()) != 0) {
                    return false;
                }
                auxA = auxA.getProx();
                auxB = auxB.getProx();
            }
        }
        return true;
    }
    
    public void Concatenar(LSECircular<T> Lista2){
        LSENode<T> auxA = this.inicio;
        LSENode<T> auxB = Lista2.inicio;
          
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
            while (auxA != null) {
                if(auxA.getProx() == null){
                    while (auxB != null) {
                        this.inserirNoFinal(auxB.getInfo());
                        Lista2.Remover(auxB.getInfo());
                        auxB = Lista2.inicio;
                    }
                    System.out.println("Listas concatenadas");
                    return;
                }
                auxA = auxA.getProx();
            }
        }
    }
}