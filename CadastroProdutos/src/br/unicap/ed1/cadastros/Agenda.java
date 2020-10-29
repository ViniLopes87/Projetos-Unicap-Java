package br.unicap.ed1.cadastros;

import br.unicap.ed1.dados.*;
import br.unicap.ed1.TiposdeDados.*;
import java.util.Scanner;

public class Agenda {
    private LSEOrdenada<Contato> cadastro;
    
    public Agenda(){
        cadastro = new LSEOrdenada<Contato> ();
    }
    Scanner input = new Scanner (System.in);
    Contato C,result;
    String nome, email;
    int numero,OP;
    
    public void Adicionar(){
        System.out.print("Informe o nome do contato: ");
        nome = input.nextLine();
        System.out.print("Informe o número do telefone do " + nome + ": ");
        numero = input.nextInt(); input.nextLine();
        System.out.print("Informe o email do " + nome + ": ");
        email = input.nextLine();
        
        C = new Contato(nome);
        C.setNumero(numero);
        C.setEmail(email);
        cadastro.inserirOrdenada(C);
    }
    public void Remover(){
        System.out.print("Informe o nome do contato a ser removido: ");
        nome = input.nextLine();
        C = new Contato(nome);
        cadastro.remover(C);
    }
    public void ListarTodos(){
        cadastro.ExibirTodos();
    }
    public void ListarUm(){
        System.out.print("Informe o nome do contato: ");
        nome = input.nextLine();
        C = new Contato(nome);
        cadastro.ExibirUm(C);
    }
    public void Alterar(){
        System.out.print("Informe o nome do contato que seja alterar: ");
        nome = input.nextLine();
        C = new Contato(nome);
        result = cadastro.AlterarValor(C);
        
        if(result == null){
            System.out.println("Nome do contato não existe");
        }
        else{
            MenuOpcao();
            OP = input.nextInt(); input.nextLine();
            switch(OP){
                case 1: System.out.print("Informe o novo número do telefone do " + nome + ": ");
                        numero = input.nextInt(); input.nextLine();
                        result.setNumero(numero);
                        break;
                case 2: System.out.print("Informe o novo email do " + nome + ": ");
                        email = input.nextLine();
                        result.setEmail(email);
                        break;
                case 3: System.out.print("Informe o novo número do telefone do " + nome + ": ");
                        numero = input.nextInt(); input.nextLine();
                        System.out.print("Informe o novo email do " + nome + ": ");
                        email = input.nextLine();
                        result.setNumero(numero);
                        result.setEmail(email);
                        break;
                default: System.out.println("Opção inválida");
            }
        }
    }
    
    public void MenuOpcao(){
        System.out.println("1 - Alterar o número de telefone do contato");
        System.out.println("2 - Alterar o email do contato");
        System.out.println("3 - Alterar o número e o email do contato");
    }
}