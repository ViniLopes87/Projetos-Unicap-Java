package br.unicap.ed1.cadastros;

import br.unicap.ed1.dados.*;
import br.unicap.ed1.TiposdeDados.*;
import java.util.Scanner;

public class CadastroTarefas {
    private LDEDecrescenteComRepetidos<Tarefa> cadastro;
    
    public CadastroTarefas(){
        cadastro = new LDEDecrescenteComRepetidos<Tarefa> ();
    }
    Scanner input = new Scanner (System.in);
    Tarefa T,result;
    String D;
    int P;
    
    public void Inserir(){
        System.out.print("Informe a prioridade da tarefa: ");
        P = input.nextInt(); input.nextLine();
        
        while(P < 1 || P > 10){
            System.out.println("Prioridade inválida");
            System.out.print("Informe a prioridade da tarefa que esteja entre 1 a 10: ");
            P = input.nextInt(); input.nextLine();
        }
        
        System.out.print("Informe a descrição da tarefa: ");
        D = input.nextLine();
        
        T = new Tarefa(D);
        T.setPrioridade(P);
        cadastro.inserir(T);
    }
    public void QuantidadeTarefa(){
        System.out.print("Informe a descrição da tarefa: ");
        D = input.nextLine();
        
        T = new Tarefa(D);
        cadastro.QuantidadeTarefa(T);
    }
    public void ExecutarTarefaVez(){
        cadastro.removerInicio();
    }
    public void CancelarExecucao(){
        System.out.print("Informe a descrição da tarefa: ");
        D = input.nextLine();
        
        T = new Tarefa(D);
        cadastro.remover(T);
    }
    public void ExibirTodos(){
        cadastro.exibirTodos();
    }
    public void ExibirUm(){
        System.out.print("Informe a prioridade da tarefa: ");
        P = input.nextInt();
        
        while(P < 1 || P > 10){
            System.out.println("Prioridade inválida");
            System.out.print("Informe a prioridade da tarefa que esteja entre 1 a 10: ");
            P = input.nextInt();
        }
        
        T = new Tarefa(D);
        T.setPrioridade(P);
        cadastro.ExibirUm(T);
    }
    public void Alterar(){
        System.out.print("Informe a descrição da tarefa: ");
        D = input.nextLine();
        System.out.print("Informe a nova prioridade da tarefa: ");
        P = input.nextInt(); input.nextLine();
        
        while(P < 1 || P > 10){
            System.out.println("Prioridade inválida");
            System.out.print("Informe a prioridade da tarefa que esteja entre 1 a 10: ");
            P = input.nextInt(); input.nextLine();
        }
        
        T = new Tarefa(D);
        result = cadastro.Retirar(T);
        if(result == null){
            System.out.println("Não existe essa tarefa");
        }
        else{
            result.setPrioridade(P);
            cadastro.inserir(result);
            System.out.println("Tarefa alterada!");
        }
    }
}