package projeto.para.cadastrar.os.produtos.da.loja.preço.bom.vetor.e.poo;

import java.util.Scanner;

public class ProjetoParaCadastrarOsProdutosDaLojaPreçoBomVetorEPOO {
    public static void MenuAlt(){
        System.out.println("Escolha uma operação: ");
        System.out.println("1- Aumento");
        System.out.println("2- Desconto");
    }
    public static void Menu(){
        System.out.println("Escolha uma operação:");
        System.out.println("0 - Para sair");
        System.out.println("1 - Cadastrar um novo produto");
        System.out.println("2 - Exibir os dados de todos os produtos da loja");
        System.out.println("3 - Exibir os dados de todos os produtos de um dado fornecedor");
        System.out.println("4 - Alterar o preço de um produto");
        System.out.println("5 - Atualizar o estoque de um produto");
        System.out.println("6 - Realizar a venda de um produto");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int CONT = 100;
        String C,D,F;
        double V,Percen;
        int OP,QE;
        Loja L = new Loja(CONT);
        Produto P;
        
          System.out.println("Seja bem vindo a loja Preço Bom!");
      do{
          Menu();
          System.out.print("Opção: ");
          OP = input.nextInt(); input.nextLine();
        switch(OP){
            case 0: break;
            case 1: System.out.print("Informe o código do produto: ");
                    C = input.nextLine(); 
                    P = new Produto(C);
                    System.out.print("Informe a definição do produto: ");
                    D = input.nextLine();
                    P.setD(D);
                    System.out.print("Informe a fornecedora do produto: ");
                    F = input.nextLine(); 
                    P.setF(F);
                    System.out.print("Informe o preço do produto: ");
                    V = input.nextDouble(); 
                    
                    while(V <= 0){
                        System.out.println("Preço inválido");
                        System.out.print("Informe o preço do produto que seja maior que 0: ");
                        V = input.nextDouble();
                    }
                    
                    P.setP(V);
                    System.out.print("Informe a quantidade do produto no estoque: ");
                    QE = input.nextInt(); input.nextLine();
                    
                    while(QE < 0){
                        System.out.println("Quantidade inválida");
                        System.out.print("Informe a quantidade do produto no estoque que se maior ou igual a 0: ");
                        QE = input.nextInt(); input.nextLine();
                    }
                    
                    P.setQE(QE);
                    
                    L.Cadastrar(P);  
                    break;
            case 2: L.Exibirtodos();
                    break;
            case 3: System.out.print("Informe o nome do fornecedor a ser procurado: ");
                    F = input.nextLine();
                    L.ExibirFornecedor(F);
                    break;
            case 4: System.out.print("Informe o código do produto a ser alterado o preço: ");
                    C = input.nextLine();
                    System.out.print("Informe o percentual de alteração: ");
                    Percen = input.nextDouble();
                    
                    while(Percen <= 0){
                        System.out.println("Percentual inválido");
                        System.out.print("Informe o percentual de alteração que seja maior que 0: ");
                        Percen = input.nextDouble();
                    }
                    
                    MenuAlt();
                    System.out.print("Opção: ");
                    OP = input.nextInt();
                    
                    while(OP != 1 && OP != 2){
                        System.out.println("Opção inválida");
                        System.out.print("Opção com 1 ou 2: ");
                        OP = input.nextInt();
                    }
                    
                    L.AlterarPreco(C,Percen,OP);
                    break;
            case 5: System.out.print("Informe o código do produto: ");
                    C = input.nextLine();
                    System.out.print("Informe quanto deve ser acrescido no estoque do produto: ");
                    QE = input.nextInt();
                    
                    while(QE < 0){
                        System.out.println("Quantidade inválida");
                        System.out.print("Informe a quantidade do produto que se maior ou igual a 0: ");
                        QE = input.nextInt(); input.nextLine();
                    }
                    
                    L.AlterarQuantidade(C,QE);
                    break;
            case 6: System.out.print("Informe o código do produto que será vendido: ");
                    C = input.nextLine();
                    System.out.print("Informe a quantidade à ser vendida: ");
                    QE = input.nextInt();
                    
                    while(QE < 0){
                        System.out.println("Quantidade inválida");
                        System.out.print("Informe a quantidade do produto que se maior ou igual a 0: ");
                        QE = input.nextInt(); input.nextLine();
                    }
                    
                    L.Venda(C,QE);
                    break;
            default: System.out.println("Opção inválida");
                     break;
        }
      }while(OP != 0);     
    }   
}