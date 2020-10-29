package programa.de.conta.bancária.de.p3.poo;

import java.util.Scanner;

public class ProgramaDeContaBancáriaDeP3POO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor;
        String conta;
        int OP;
         
        ClasseBanco operacao = new ClasseBanco();
        ClasseConta C;
        Poupanca P;
        ClasseContaPG PG;
        ClasseVerificarConta VC = new ClasseVerificarConta();
        do{ 
            operacao.Menu();
            OP = input.nextInt(); input.nextLine();
            switch (OP){
                case 0: break;
                case 1: System.out.print("Informe o número da conta: ");
                        conta = input.nextLine();
                        if(VC.VerificarConta(conta) == true){
                            C = new ClasseConta(conta);
                            operacao.CadastrarConta(C);
                        }
                        break;
                case 2: System.out.print("Informe o número da poupança: ");
                        conta = input.nextLine();
                        if(VC.VerificarConta(conta) == true){
                            P = new Poupanca(conta);
                            operacao.CadastrarPoupanca(P);
                        }
                        break;
                case 3: System.out.print("Informe o número da conta PG: ");
                        conta = input.nextLine();
                        if(VC.VerificarConta(conta) == true){
                            PG = new ClasseContaPG(conta);
                            operacao.CadastrarContaPG(PG);
                        }
                        break;
                case 4: System.out.print("Informe o número da conta: ");
                        conta = input.nextLine();
                        System.out.print("Digite o valor para depositar: ");
                        valor = input.nextDouble(); input.nextLine();
                        
                        while(valor <= 0){
                            System.out.println("Valor inválido");
                            System.out.print("Informe um valor para deposito que seja maior que 0: ");
                            valor = input.nextDouble(); input.nextLine();
                        }
                        
                        operacao.Depositar(conta, valor);
                        break;
                case 5: System.out.print("Informe o número da conta: ");
                        conta = input.nextLine();
                        System.out.print("Digite o valor para Saque: ");
                        valor = input.nextDouble(); input.nextLine();
                        
                        while(valor <= 0){
                            System.out.println("Valor inválido");
                            System.out.print("Informe um valor para saque que seja maior que 0: ");
                            valor = input.nextDouble(); input.nextLine();
                        }
                        
                        operacao.Sacar(conta, valor);
                        break;
                case 6: System.out.print("Informe o número da conta: ");
                        conta = input.nextLine();
                        operacao.VerSaldo(conta);
                        break;
                case 7: System.out.print("Informe o número da conta: ");
                        conta = input.nextLine();
                        operacao.renderJuros(conta);
                        break;
                default: System.out.println("Operação inválida");
                         break;           
            }
        }while(OP != 0);
    } 
}