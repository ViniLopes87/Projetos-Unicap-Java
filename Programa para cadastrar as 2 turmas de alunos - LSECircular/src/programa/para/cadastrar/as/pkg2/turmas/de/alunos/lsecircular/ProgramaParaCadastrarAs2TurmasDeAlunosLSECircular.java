package programa.para.cadastrar.as.pkg2.turmas.de.alunos.lsecircular;

import br.unicap.ed1.cadastros.CadastrarTurma1;
import br.unicap.ed1.cadastros.CadastrarTurma2;
import java.util.Scanner;

public class ProgramaParaCadastrarAs2TurmasDeAlunosLSECircular {
    public static void menuOpcoes () {
        System.out.println("1 - Inserir um novo aluno na turma");
        System.out.println("2 - Remover um aluno da turma");
        System.out.println("3 - Exibir todos os alunos da turma");
        System.out.println("4 - Exibir um aluno da turma");
        System.out.println("5 - Alterar a média de um aluno");
        System.out.println("6 - Alterar a quantidade de faltas de um aluno");
        System.out.println("0 - Sair do programa");
    }
    public static void MenuLista(){
        System.out.println("Escolha a turma");
        System.out.println("Turma 1");
        System.out.println("Turma 2");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        CadastrarTurma1 listaA  = new CadastrarTurma1();
        CadastrarTurma1 listaB  = new CadastrarTurma1();
        int OP,op;
        
        do {
            MenuLista();
            System.out.print("Informe a opção: ");
            op = input.nextInt(); input.nextLine();
            if(op == 1){
                menuOpcoes ();
                System.out.print("Informe a opção: ");
                OP = input.nextInt(); input.nextLine();
                switch (OP) {
                    case 1: listaA.CadastroInserirNoFinal();
                            break;
                    case 2: listaA.CadastroRemover();
                            break;
                    case 3: listaA.CadastroExibirTodos();
                            break;
                    case 4: listaA.CadastroExibirUm();
                            break;
                    case 5: listaA.CadastroAlterarMedia();
                            break;
                    case 6: listaA.CadastroAlterarFalta();
                            break;
                    case 0: System.out.println("Fim do programa!");
                            break;
                    default: System.out.println("Opção inválida!");
                }
            }
            else{
                menuOpcoes ();
                System.out.print("Informe a opção: ");
                OP = input.nextInt(); input.nextLine();
                switch (OP) {
                    case 1: listaB.CadastroInserirNoFinal();
                            break;
                    case 2: listaB.CadastroRemover();
                            break;
                    case 3: listaB.CadastroExibirTodos();
                            break;
                    case 4: listaB.CadastroExibirUm();
                            break;
                    case 5: listaB.CadastroAlterarMedia();
                            break;
                    case 6: listaB.CadastroAlterarFalta();
                            break;
                    case 0: System.out.println("Fim do programa!");
                            break;
                    default: System.out.println("Opção inválida!");
                }
            }
        } while (OP != 0);
    }   
}