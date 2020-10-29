package programa.aplicação.da.classe.tarefa.ldedecrescentecomrepetidos;

import br.unicap.ed1.cadastros.CadastroTarefas;
import java.util.Scanner;

public class ProgramaAplicaçãoDaClasseTarefaLDEDecrescenteComRepetidos {
    public static void menuOpcoes () {
        System.out.println("1 - Inserir uma nova tarefa na lista");
        System.out.println("2 - Procurar uma descrição na lista");
        System.out.println("3 - Executar a tarefa que está na vez");
        System.out.println("4 - Cancelar execução,");
        System.out.println("5 - Exibir as descrições de uma prioridade");
        System.out.println("6 - Exibir a descrição e a prioridade de todas as tarefas");
        System.out.println("7 - Alterar prioridade");
        System.out.println("0 - Sair do programa");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        CadastroTarefas lista  = new CadastroTarefas();
        int OP;
        
        do {
            menuOpcoes ();
            System.out.print("Informe a opção: ");
            OP = input.nextInt(); input.nextLine();
            switch (OP) {
                case 1: lista.Inserir();
                        break;
                case 2: lista.QuantidadeTarefa();
                        break;
                case 3: lista.ExecutarTarefaVez();
                        break;
                case 4: lista.CancelarExecucao();
                        break;
                case 5: lista.ExibirUm();
                        break;
                case 6: lista.ExibirTodos();
                        break;
                case 7: lista.Alterar();
                        break;
                case 0: System.out.println("Fim do programa!");
                        break;
                default: System.out.println("Opção inválida!");
            }
        } while (OP != 0);
    }   
}