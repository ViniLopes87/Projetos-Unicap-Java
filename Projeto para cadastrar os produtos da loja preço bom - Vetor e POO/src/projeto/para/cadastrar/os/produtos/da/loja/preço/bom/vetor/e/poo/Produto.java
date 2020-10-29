package projeto.para.cadastrar.os.produtos.da.loja.preço.bom.vetor.e.poo;

public class Produto {
    private String codigo, descricao, fornecedor;
    private double preco;
    private int quantidadeestoque;
    
    public Produto(String C){
        codigo = C;
    }
    public void setC(String c){
        codigo = c;
    }
    public String getC(){
        return codigo;
    }
    public void setD(String d){
        descricao = d;
    }
    public String getD(){
        return descricao;
    }
    public void setF(String f){
        fornecedor = f;
    }
    public String getF(){
        return fornecedor;
    }
    public void setP(double p){
        preco = p;
    }
    public double getP(){
        return preco;
    }
    public void setQE(int qe){
        quantidadeestoque = qe;
    }
    public int getQE(){
        return quantidadeestoque;
    }
    public String toString(){
        return "O produto do código " + this.codigo + " que é da " + fornecedor + " que serve para " + descricao + " tem o preço de R$" + preco + " e tem " + quantidadeestoque + " unidades no estoque";
    }
}