package controle.de.turma;

import java.util.Scanner;

public class ControleDeTurma {
    public static void Menu(){
        System.out.println("Escolha uma operação:");
        System.out.println("0 - Sair do programa");
        System.out.println("1 - Cadastrar um aluno");
        System.out.println("2 - Exibir os dados de todos os alunos");
        System.out.println("3 - Alterar a média ou as faltas de um aluno");
        System.out.println("4 - Exibir os dados de um aluno");
        System.out.println("5 - Remover um aluno");
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String M,N;
         double ME;
         int F,OP;
         
         Turma Cad = new Turma(60);
         Aluno A;
         
         do{
             Menu();
             System.out.print("Opção: ");
             OP = input.nextInt(); input.nextLine();
             switch(OP){
                 case 0: break;
                 case 1: System.out.print("Informe a matrícula do aluno: ");
                         M = input.nextLine();
                         A = new Aluno(M);
                         System.out.print("Informe o nome do aluno: ");
                         N = input.nextLine();
                         A.setN(N);
                         System.out.print("Informe a média do aluno: ");
                         ME = input.nextDouble();
                         
                         while(ME < 0 || ME > 10){
                             System.out.println("Média inválida");
                             System.out.print("Informe a média do aluno entre 0 e 10: ");
                             ME = input.nextDouble();
                         }
                         
                         A.setME(ME);
                         System.out.print("Informe a quantidade de faltas do aluno: ");
                         F = input.nextInt(); input.nextLine();
                         
                         while(F < 0){
                             System.out.println("Faltas inválidas");
                             System.out.print("Informe a quantidade de faltas do aluno que seja maior ou igual a 0: ");
                             F = input.nextInt(); input.nextLine();
                         }
                         
                         A.setF(F);
                         
                         Cad.Cadastrar(A);
                         break;
                 case 2: Cad.ExibirTodos();
                         break;
                 case 3: System.out.print("Informe a matrícula do aluno: ");
                         M = input.nextLine();
                         Cad.AlterarDados(M);
                         break;
                 case 4: System.out.print("Informe a matrícula do aluno: ");
                         M = input.nextLine();
                         Cad.ExibirTurma(M);
                         break;
                 case 5: System.out.print("Informe a matrícula do aluno: ");
                         M = input.nextLine();
                         Cad.Remoção(M);
                         break;
             }
         }while(OP != 0);
    }
}