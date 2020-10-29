package programa.para.cadastrar.as.pessoas.vetor.e.poo;

import java.util.Scanner;

public class ProgramaParaCadastrarAsPessoasVetorEPOO {
    public static void Menu(){
        System.out.println("Opções: ");
        System.out.println("1- Cadastrar uma pessoa");
        System.out.println("2- Exibir todo o cadastro");
        System.out.println("3- Exibir dados de uma pessoa");
        System.out.println("4- Alterar o peso da pessoa");
        System.out.println("0 - Sair");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Cadastrarpessoas cad = new Cadastrarpessoas(100);
        Pessoa P;
        String nome;
        int idade,OP;
        double peso;
        
     do{ 
        Menu();
        System.out.print("Informe a opção: ");
        OP = input.nextInt(); input.nextLine();
        switch(OP){
            case 1: System.out.print("Informe o nome da pessoa: ");
                    nome = input.nextLine();
                    P = new Pessoa(nome);
                    System.out.print("Informe a idade da pessoa: ");
                    idade = input.nextInt(); input.nextLine();
                    P.setI(idade);
                    
                    cad.CadastrarOrdenado(P);
                    break;
            case 2:cad.Exibir();
                   break;
            case 3:System.out.print("Digite o nome a ser procurado: ");
                   nome = input.nextLine();
                   cad.ExibirPessoa(nome);
                   break;
            case 4:System.out.print("Digite o nome a ser aumentado o peso: ");
                   nome = input.nextLine();
                   System.out.print("Digite o novo peso: ");
                   peso = input.nextDouble(); input.nextLine();
                   cad.AtualizarPeso(nome, peso);
                   break;
            case 0: break;
            default: System.out.println("Opção inválida");
        }
     }while(OP != 0);
    }   
}