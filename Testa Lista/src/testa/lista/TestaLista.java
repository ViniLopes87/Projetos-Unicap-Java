package testa.lista;

import br.unicap.ed1.TiposdeDados.*;
import br.unicap.ed1.dados.*;
import java.util.Scanner;

public class TestaLista {
    public static void menuOpcoes () {
        System.out.println("1 - Inserir valor no início da lista");
        System.out.println("2 - Inserir valor no final da lista");
        System.out.println("3 - Exibir todos os valores da lista");
        System.out.println("4 - Alterar o conteúdo de um nó");
        System.out.println("5 - Remover do início da lista");
        System.out.println("6 - Remover do final da lista");
        System.out.println("0 - Sair do programa");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        LSESemRepetido <Aluno> lista  = new LSESemRepetido();
        int op, num,num2;
        Aluno AL;
        String nome;
        double nota;
        
        do {
            menuOpcoes ();
            System.out.print("Informe a opção: ");
            op = input.nextInt(); input.nextLine();
            switch (op) {
                case 1: System.out.print("Informe o nome do aluno: ");
                        nome = input.nextLine();
                        System.out.print("Informe a nota do aluno: ");
                        nota = input.nextDouble(); input.nextLine();
                        AL = new Aluno(nome);
                        AL.setNota(nota);
                        lista.inserirNoInicio(AL);
                        break;
                case 2: System.out.print("Informe o nome do aluno: ");
                        nome = input.nextLine();
                        System.out.print("Informe a nota do aluno: ");
                        nota = input.nextDouble(); input.nextLine();
                        AL = new Aluno(nome);
                        AL.setNota(nota);
                        lista.inserirNoFinal(AL);
                        break;
                case 3: lista.ExibirTodos();
                        break;
                case 4: System.out.print("Informe o nome do aluno: ");
                        nome = input.nextLine();
                        AL = new Aluno(nome);
                        AL = lista.AlterarValor(AL);
                        System.out.print("Informe a nova nota do aluno: ");
                        nota = input.nextDouble(); input.nextLine();
                        AL.setNota(nota);
                        break;
                case 5: lista.removerNoInicio();
                        break;
                case 6: lista.removerNoFinal();
                        break;
                case 0: System.out.println("Fim do programa!");
                        break;
                default: System.out.println("Opção inválida!");
            }
        } while (op != 0);         
    }  
}