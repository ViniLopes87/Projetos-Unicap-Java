package programa.para.cadastrar.funcionários.vetor.e.poo;

import java.util.Scanner;

public class ProgramaParaCadastrarFuncionáriosVetorEPOO {
    public static void Menu(){
        System.out.println("Escolha uma operação:");
        System.out.println("0 -  Para sair");
        System.out.println("1 - Cadastrar um funcionário");
        System.out.println("2 - Aumento salarial");
        System.out.println("3 - Exibir os dados de todos os funcionários");
        System.out.println("4 - Exibir os dados de um funcionário");
        System.out.println("5 - Demitir um funcionário");
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         Cadastrarfuncionario Cad = new Cadastrarfuncionario(1000);
         Funcionario F;
         
         int OP,A;
         String M,N,C;
         double S,P;
         
         do{
             Menu();
             System.out.print("Opção: ");
             OP = input.nextInt(); input.nextLine();
             switch(OP){
                 case 0: break;
                 case 1: System.out.print("Informe a matrícula do funcionário: ");
                         M = input.nextLine();
                         F = new Funcionario(M);
                         System.out.print("Informe o nome do funcionário: ");
                         N = input.nextLine();
                         F.setN(N);
                         System.out.print("Informe o cargo do funcionário: ");
                         C = input.nextLine();
                         F.setC(C);
                         System.out.print("Informe o salário do funcionário: ");
                         S = input.nextDouble();
                         
                         while(S <= 0){
                             System.out.println("Salário inválido");
                             System.out.print("Informe o salário do funcionário que seja maior que 0: ");
                             S = input.nextDouble();
                         }
                         
                         F.setS(S);
                         System.out.print("Informe o ano de contratação do funcionário: ");
                         A = input.nextInt(); input.nextLine();
                         
                         while(A <= 0){
                             System.out.println("Ano inválido");
                             System.out.print("Informe o ano de contratação do funcionário que seja maior que 0: ");
                             A = input.nextInt(); input.nextLine();
                         }
                         
                         F.setA(A);
                         
                         Cad.Cadastrar(F);
                         break;
                 case 2: System.out.print("Informe a matrícula do funcionário: ");
                         M = input.nextLine();
                         System.out.print("Informe o percentual de aumento: ");
                         P = input.nextDouble();
                         
                         while(P <= 0){
                             System.out.println("Percentual inválido");
                             System.out.print("Informe o percentual de aumento que seja maior que 0: ");
                             P = input.nextDouble();
                         }
                         
                         Cad.Aumento(M, P);
                         break;
                 case 3: Cad.Exibirtodos();
                         break;
                 case 4: System.out.print("Informe a matrícula do funcionário: ");
                         M = input.nextLine();
                         Cad.ExibirFuncionario(M);
                         break;
                 case 5: System.out.print("Informe a matrícula do funcionário: ");
                         M = input.nextLine();
                         Cad.Demitir(M);
                         break;
                 default: System.out.println("Opção inválida");
         }    
         }while(OP != 0);
    }
}