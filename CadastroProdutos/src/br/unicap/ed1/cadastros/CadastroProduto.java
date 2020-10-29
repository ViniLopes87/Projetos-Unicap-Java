package br.unicap.ed1.cadastros;

import br.unicap.ed1.dados.*;
import br.unicap.ed1.TiposdeDados.*;
import java.util.Scanner;

public class CadastroProduto {
    private LSESemRepetido<Produto> cadastro;
    
    public CadastroProduto(){
        cadastro = new LSESemRepetido<Produto> ();
    }
    Scanner input = new Scanner (System.in);
    Produto P,result;
    String codigo, descricao;
    double preco;
    int estoque;
    
    public void CadastroInserirNoInicio(){
        System.out.print("Informe o código do produto: ");
        codigo = input.nextLine();
        System.out.print("Informe a descrição do produto: ");
        descricao = input.nextLine();
        System.out.print("Informe o preço do produto: ");
        preco = input.nextDouble();  input.nextLine();
        
        while(preco <= 0){
                System.out.println("Preço inválida");
                System.out.print("Informe o novo preço do produto que seja maior que 0: ");
                preco = input.nextDouble();  input.nextLine();
        }
        
        System.out.print("Informe a quantidade de unicades do produto no estoque: ");
        estoque = input.nextInt(); input.nextLine();
        
        while(estoque <= 0){
                System.out.println("Quantidade inválida");
                System.out.print("Informe a quantidade a ser acrescida no estoque que seja maior que 0: ");
                estoque = input.nextInt();
        }
        
        P = new Produto(codigo);
        P.setDescricao(descricao);
        P.setPreco(preco);
        P.setEstoque(estoque);
        cadastro.inserirNoInicio(P);
    }
    public void CadastroInserirNoFinal(){
        System.out.print("Informe o código do produto: ");
        codigo = input.nextLine(); 
        System.out.print("Informe a descrição do produto: ");
        descricao = input.nextLine();
        System.out.print("Informe o preço do produto: ");
        preco = input.nextDouble();  input.nextLine();
        
        while(preco <= 0){
                System.out.println("Preço inválida");
                System.out.print("Informe o novo preço do produto que seja maior que 0: ");
                preco = input.nextDouble();  input.nextLine();
        }
        
        System.out.print("Informe a quantidade de unicades do produto no estoque: ");
        estoque = input.nextInt(); input.nextLine();
        
        while(estoque <= 0){
                System.out.println("Quantidade inválida");
                System.out.print("Informe a quantidade a ser acrescida no estoque que seja maior que 0: ");
                estoque = input.nextInt();
        }
        
        P = new Produto(codigo);
        P.setDescricao(descricao);
        P.setPreco(preco);
        P.setEstoque(estoque);
        cadastro.inserirNoFinal(P);
    }
    public void CadastroExibirTodos(){
        cadastro.ExibirTodos();
    }
    public void CadastroExibirUm(){
        System.out.print("Informe o código do produto: ");
        codigo = input.nextLine();
        P = new Produto(codigo);
        cadastro.ExibirUm(P);
    }
    public void CadastroRemoverUm(){
        System.out.print("Informe o código do produto a ser removido: ");
        codigo = input.nextLine();
        P = new Produto(codigo);
        cadastro.Remover(P);
    }
    public void CadastrarRemoverInicio(){
        cadastro.removerNoInicio();
    }
    public void CadastrarRemoverFinal(){
        cadastro.removerNoFinal();
    }
    public void CadastroAlterarPreco(){
        System.out.print("Informe o código do produto: ");
        codigo = input.nextLine();
        P = new Produto(codigo);
        result = cadastro.AlterarValor(P);
        if (result == null) {
            System.out.println("Código do produto não existe");
        } 
        else {
            System.out.print("Informe o novo preço do produto: ");
            preco = input.nextDouble(); input.nextLine();
            
            while(preco <= 0){
                System.out.println("Preço inválida");
                System.out.print("Informe o novo preço do produto que seja maior que 0: ");
                preco = input.nextDouble(); input.nextLine();
            }
            
            result.setPreco(preco);
            System.out.println("Preço alterado");
        }
    }
    public void CadastroAlterarEstoque(){
        System.out.print("Informe o código do produto: ");
        codigo = input.nextLine();
        P = new Produto(codigo);
        result = cadastro.AlterarValor(P);
        if (result == null) {
            System.out.println("Código do produto não existe");
        } 
        else {
            System.out.print("Informe a quantidade a ser acrescida no estoque do produto: ");
            estoque = input.nextInt(); input.nextLine();
            
            while(estoque <= 0){
                System.out.println("Quantidade inválida");
                System.out.print("Informe a quantidade a ser acrescida no estoque que seja maior que 0: ");
                estoque = input.nextInt(); input.nextLine();
            }
            
            result.setEstoque(estoque + result.getEstoque());
            System.out.println("Estoque alterado");
        }
    }
    public void CadastrarVenda(){
        System.out.print("Informe o código do produto: ");
        codigo = input.nextLine();
        P = new Produto(codigo);
        result = cadastro.AlterarValor(P);
        if (result == null) {
            System.out.println("Código do produto não existe");
        } 
        else {
            System.out.print("Informe a quantidade a ser vendida do produto: ");
            estoque = input.nextInt(); input.nextLine();
            
            while(estoque > result.getEstoque()){
                System.out.println("Quantidade inválida");
                System.out.print("Informe a quantidade a ser vendida do produto que seja igual ou menor que o estoque: ");
                estoque = input.nextInt(); input.nextLine();
            }
            
            result.setEstoque(result.getEstoque() - estoque);
            System.out.println("Venda realizada");
        }
    }
}