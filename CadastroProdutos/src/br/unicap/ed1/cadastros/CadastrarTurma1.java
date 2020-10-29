package br.unicap.ed1.cadastros;

import br.unicap.ed1.TiposdeDados.LSECircular;
import br.unicap.ed1.dados.Aluno;
import java.util.Scanner;

public class CadastrarTurma1 {
    private LSECircular<Aluno> cadastro;
    
    public CadastrarTurma1(){
        cadastro = new LSECircular<Aluno> ();
    }
    Scanner input = new Scanner (System.in);
    Aluno A,result;
    String nome, matricula;
    double media;
    int falta;
    
    public void CadastroInserirNoFinal(){
        System.out.print("Informe a matrícula do aluno: ");
        matricula = input.nextLine(); 
        System.out.print("Infome o nome do aluno: ");
        nome = input.nextLine();
        System.out.print("Informe a média final do aluno: ");
        media = input.nextDouble();  input.nextLine();
        
        while(media < 0 || media > 10){
                System.out.println("Média inválida");
                System.out.print("Informe a média final do aluno que esteja entre 0 e 10: ");
                media = input.nextDouble();  input.nextLine();
        }
        
        System.out.print("Informe a quantidade de faltas do aluno: ");
        falta = input.nextInt(); input.nextLine();
        
        while(falta < 0){
                System.out.println("Quantidade inválida");
                System.out.print("Informe a quantidade de faltas do aluno que seja maior ou igual a 0: ");
                falta = input.nextInt();
        }
        
        A = new Aluno(matricula);
        A.setNome(nome);
        A.setNota(media);
        A.setFalta(falta);
        cadastro.inserirNoFinal(A);
        System.out.println("Aluno cadastrado");
    }
    public void CadastroExibirTodos(){
        cadastro.exibirTodos();
    }
    public void CadastroExibirUm(){
        System.out.print("Informe a matrícula do aluno: ");
        matricula = input.nextLine();
        A = new Aluno(matricula);
        result = cadastro.Consultar(A);
        if (cadastro.BuscaSimples(result) == false) {
            System.out.println("Matrícula não existe");
        }
        else{
            cadastro.ExibirUm(result);
        }
    }
    public void CadastroRemover(){
        System.out.print("Informe a matrícula do aluno a ser removido: ");
        matricula = input.nextLine();
        A = new Aluno(matricula);
        if(cadastro.BuscaSimples(A) == true){
            cadastro.Remover(A);
        }
        else{
            System.out.println("Matrícula não existe");
        }
    }
    public void CadastroAlterarMedia(){
        System.out.print("Informe a matrícula do aluno: ");
        matricula = input.nextLine();
        A = new Aluno(matricula);
        result = cadastro.Consultar(A);
        if (cadastro.BuscaSimples(result) == false) {
            System.out.println("Matrícula não existe");
        } 
        else {
            System.out.print("Informe a nova média do aluno: ");
            media = input.nextDouble(); input.nextLine();
            
            while(media < 0 || media > 10){
                System.out.println("Média inválida");
                System.out.print("Informe a média final do aluno que esteja entre 0 e 10: ");
                media = input.nextDouble();  input.nextLine();
            }
            
            result.setNota(media);
            System.out.println("Média alterada");
        }
    }
    public void CadastroAlterarFalta(){
        int op;
        System.out.print("Informe a matrícula do aluno: ");
        matricula = input.nextLine();
        A = new Aluno(matricula);
        result = cadastro.Consultar(A);
        if (cadastro.BuscaSimples(result) == false) {
            System.out.println("Matrícula não existe");
        } 
        else {
            MenuAlterar();
            System.out.print("Opção: ");
            op = input.nextInt(); input.nextLine();
            
            if(op == 1){
                System.out.print("Informe a quantidade de faltas a ser acrescida ao aluno: ");
                falta = input.nextInt(); input.nextLine();
            
                while(falta < 0){
                    System.out.println("Quantidade inválida");
                    System.out.print("Informe a quantidade de faltas do aluno que seja maior ou igual a 0: ");
                    falta = input.nextInt();
                }
            
                result.setFalta(falta + result.getFalta());
                System.out.println("Falta alterada");
            }
            else{
                System.out.print("Informe a quantidade de faltas a ser diminuida ao aluno: ");
                falta = input.nextInt(); input.nextLine();
            
                while(falta < 0 && result.getFalta() >= falta){
                    System.out.println("Quantidade inválida");
                    System.out.print("Informe a quantidade de faltas do aluno que seja maior ou igual a 0: ");
                    falta = input.nextInt();
                }
            
                result.setFalta(result.getFalta() - falta);
                System.out.println("Falta alterada");
            }
        }
    }
    public void MenuAlterar(){
        System.out.println("Escolha uma opção para alterar faltas");
        System.out.println("1 - Acrescentar faltas");
        System.out.println("2 - Diminuir faltas");
    }
}