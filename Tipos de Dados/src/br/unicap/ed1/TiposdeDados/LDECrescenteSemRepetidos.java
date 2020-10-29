package br.unicap.ed1.TiposdeDados;

public class LDECrescenteSemRepetidos <T extends Objeto<T>>{
    private LDENodeClone<T> inicio;
    private LDENodeClone<T> fim;
    private int qtd;
    
    public boolean isEmpty(){
        if(this.qtd == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void Cadastrar (T obj) {   //Crescente sem repetido
        LDENodeClone<T> novo = new LDENodeClone (obj);
        LDENodeClone<T> anterior, atual;
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
            System.out.println("Cadastro efetuado");
        }
        else{
            if(this.inicio.getInfo().compareTo(obj) > 0){
                novo.setProx(this.inicio);
                this.inicio.setAnt(novo);
                this.inicio = novo;
                this.qtd++;
                System.out.println("Cadastro efetuado!");
            }
            else if(this.fim.getInfo().compareTo(obj) < 0){
                this.fim.setProx(novo);
                novo.setAnt(this.fim);
                this.fim = novo;
                this.qtd++;
                System.out.println("Cadastro efetuado!!");
            }
            else{
                atual = this.inicio;
                while(true){
                    if(atual.getInfo().compareTo(obj) == 0){
                        System.out.println("Valor repetido! Inserção não efetuada");
                        return;
                    }
                    else if(atual.getInfo().compareTo(obj) > 0){
                        anterior = atual.getAnt();  
                        anterior.setProx(novo);
                        novo.setAnt(anterior);
                        novo.setProx(atual);
                        atual.setAnt(novo);
                        this.qtd++;
                        System.out.println("Cadastro efetuado!!!");
                        return;
                    }
                    else{
                        atual = atual.getProx();
                    }
                }
            }
        }
    }
    
    public LDECrescenteSemRepetidos<T> IntersecaoListas(LDECrescenteSemRepetidos<T> listaB) {
        LDECrescenteSemRepetidos<T> listaC = new LDECrescenteSemRepetidos();
        LDENodeClone<T> auxA = this.inicio;
        LDENodeClone<T> auxB = listaB.inicio;
        boolean achou = false;

        if (this.isEmpty() && listaB.isEmpty()) {
            System.out.println("As duas listas estão Vazias!");
        } 
        else if (this.isEmpty()) {
            System.out.println("ListaA está Vazia!");
        } 
        else if (listaB.isEmpty()) {
            System.out.println("ListaB está Vazia!");
        } 
        else {
            while (auxA != null) {
                while (auxB != null) {
                    if (auxA.getInfo().compareTo(auxB.getInfo()) == 0) {
                        listaC.Cadastrar(auxA.getInfo().clone());
                        achou = true;
                    }
                    auxB = auxB.getProx();
                }
                auxB = listaB.inicio;
                auxA = auxA.getProx();
            }
            if (!achou) {
                System.out.println("Sem elementos em comum!");
            }
        }
        return listaC;
    }
    
    public LDECrescenteSemRepetidos<T> UniaoListas(LDECrescenteSemRepetidos<T> listaB) {
        LDECrescenteSemRepetidos<T> listaC = new LDECrescenteSemRepetidos();
        LDENodeClone<T> auxA = this.inicio;
        LDENodeClone<T> auxB = listaB.inicio;

        if (this.isEmpty() && listaB.isEmpty()) {
            System.out.println("As duas listas estão Vazias!");
        } 
        else if (this.isEmpty()) {
            while(auxB != null){
                listaC.Cadastrar(auxB.getInfo().clone());
                auxB = auxB.getProx();
            }
        } 
        else if (listaB.isEmpty()) {
            while(auxA != null){
                listaC.Cadastrar(auxA.getInfo().clone());
                auxA = auxA.getProx();
            }
        } 
        else {
            while (auxA != null) {        
                listaC.Cadastrar(auxA.getInfo().clone());
                auxA = auxA.getProx();
            }
            while (auxB != null) {        
                listaC.Cadastrar(auxB.getInfo().clone());
                auxB = auxB.getProx();
            }
        }
        return listaC;
    }
    
    public LDECrescenteSemRepetidos<T> DiferencaListas(LDECrescenteSemRepetidos<T> listaB) {
        LDECrescenteSemRepetidos<T> listaC = new LDECrescenteSemRepetidos();
        LDENodeClone<T> auxA = this.inicio;
        LDENodeClone<T> auxB = listaB.inicio;
        boolean achou = false,chave = false;

        if (this.isEmpty() && listaB.isEmpty()) {
            System.out.println("As duas listas estão Vazias!");
        } 
        else if (this.isEmpty()) {
            System.out.println("ListaA está Vazia!");
        } 
        else if (listaB.isEmpty()) {
            while(auxA != null){
                listaC.Cadastrar(auxA.getInfo().clone());
                auxA = auxA.getProx();
            }
        } 
        else {
            while (auxA != null) {
                while (auxB != null) {
                    if (auxA.getInfo().compareTo(auxB.getInfo()) == 0) {
                        achou = true;
                    }
                    auxB = auxB.getProx();
                }
                if(achou != true){
                    listaC.Cadastrar(auxA.getInfo().clone());
                    chave = true;
                }
                achou = false;
                auxB = listaB.inicio;
                auxA = auxA.getProx();
            }
            if (!chave) {
                System.out.println("Sem elementos diferentes!");
            }
        }
        return listaC;
    }
    
    public void ExibirTodos () {
        LDENodeClone<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }
}