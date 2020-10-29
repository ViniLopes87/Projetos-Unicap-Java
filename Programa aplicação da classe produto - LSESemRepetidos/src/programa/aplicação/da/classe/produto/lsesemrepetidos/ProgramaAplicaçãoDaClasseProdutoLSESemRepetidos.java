package programa.aplicação.da.classe.produto.lsesemrepetidos;

import br.unicap.ed1.cadastros.CadastroProduto;
import br.unicap.ed1.dados.*;
import java.util.Scanner;

public class ProgramaAplicaçãoDaClasseProdutoLSESemRepetidos {
    public static void menuOpcoes () {
        System.out.println("1 - Inserir novo produto no início da lista");
        System.out.println("2 - Inserir novo produto no final da lista");
        System.out.println("3 - Exibir todos os produtos da lista");
        System.out.println("4 - Exibir os dados de um produto da lista");
        System.out.println("5 - Alterar os dados de um produto da lista");
        System.out.println("6 - Remover o primeiro produto da lista");
        System.out.println("7 - Remover o último produto da lista");
        System.out.println("8 - Remover um produto da lista");
        System.out.println("9 - Efetuar uma venda");
        System.out.println("0 - Sair do programa");
    }
    public static void Menu2(){
        System.out.println("1 - Alterar o preço do produto");
        System.out.println("2 - Alterar o estoque do produto");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        CadastroProduto lista  = new CadastroProduto();
        int OP;
        
        do {
            menuOpcoes ();
            System.out.print("Informe a opção: ");
            OP = input.nextInt(); input.nextLine();
            switch (OP) {
                case 1: lista.CadastroInserirNoInicio();
                        break;
                case 2: lista.CadastroInserirNoFinal();
                        break;
                case 3: lista.CadastroExibirTodos();
                        break;
                case 4: lista.CadastroExibirUm();
                        break;
                case 5: Menu2();
                        System.out.print("Informe a opção: ");
                        OP = input.nextInt(); input.nextLine();
                            switch (OP){
                                case 1: lista.CadastroAlterarPreco();
                                        break;
                                case 2: lista.CadastroAlterarEstoque();
                                        break;
                                default: System.out.println("Opção inválida!");
                            }
                        break;
                case 6: lista.CadastrarRemoverInicio();
                        break;
                case 7: lista.CadastrarRemoverFinal();
                        break;
                case 8: lista.CadastroRemoverUm();
                        break;
                case 9: lista.CadastrarVenda();
                        break;
                case 0: System.out.println("Fim do programa!");
                        break;
                default: System.out.println("Opção inválida!");
            }
        } while (OP != 0);   
    }  
}