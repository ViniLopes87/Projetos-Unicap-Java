package projeto.conta.bancária;

import java.util.Scanner;

public class ProjetoContaBancária {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double valor;
         int OP;
         
         ClasseConta operacao = new ClasseConta(2000,1206);
         operacao.VerSaldo();
         
         do{
         System.out.println("Escolha uma operação:");
         System.out.println("Digite 1 para DEPOSITAR");
         System.out.println("Digite 2 para SACAR");
         System.out.println("Digite 0 para SAIR");
         System.out.print("Opção: ");
         OP = input.nextInt();
         
         switch (OP){
             case 0: break;
             case 1: System.out.print("Digite o valor para depositar: ");
                     valor = input.nextDouble();
                     operacao.depositar(valor);
                     operacao.VerSaldo();
                     break;
             case 2: System.out.print("Digite o valor para Saque: ");
                     valor = input.nextDouble();
                     operacao.sacar(valor);
                     operacao.VerSaldo();;
                     break;
             default: System.out.println("Operação inválida");
                      break;           
         }
         }while(OP != 0);
    }    
}