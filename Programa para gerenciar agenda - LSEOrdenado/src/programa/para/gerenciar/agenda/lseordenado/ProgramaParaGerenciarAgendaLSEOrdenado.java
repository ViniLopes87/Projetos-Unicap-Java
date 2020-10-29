package programa.para.gerenciar.agenda.lseordenado;

import br.unicap.ed1.cadastros.Agenda;
import java.util.Scanner;

public class ProgramaParaGerenciarAgendaLSEOrdenado {
    public static void menuOpcoes () {
        System.out.println("1 - Adicionar um novo contato na agenda");
        System.out.println("2 - Remover um contato da agenda");
        System.out.println("3 - Exibir todos os contados da agenda");
        System.out.println("4 - Exibir apenas um contato da agenda");
        System.out.println("5 - Alterar os dados de um contato da agenda");
        System.out.println("6 - Fazer uma copia da agenda");
        System.out.println("0 - Sair do programa");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Agenda lista  = new Agenda();
        int OP;
        
        do {
            menuOpcoes ();
            System.out.print("Informe a opção: ");
            OP = input.nextInt(); input.nextLine();
            switch (OP) {
                case 1: lista.Adicionar();
                        break;
                case 2: lista.Remover();
                        break;
                case 3: lista.ListarTodos();
                        break;
                case 4: lista.ListarUm();
                        break;
                case 5: lista.Alterar();
                        break;
                case 0: System.out.println("Fim do programa!");
                        break;
                default: System.out.println("Opção inválida!");
            }
        } while (OP != 0);
    }
}