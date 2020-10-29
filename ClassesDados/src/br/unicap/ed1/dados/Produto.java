package br.unicap.ed1.dados;

public class Produto implements Comparable <Produto> {
    private final String codigo;
    private String descricao;
    private double preco;
    private int estoque;
    
    public Produto (String C) { // construtor
        this.codigo = C;
    }
    
    public String getCodigo () {
        return this.codigo;
    }  
    public void setDescricao (String d){
        this.descricao = d;
    }   
    public String getDescricao () {
        return this.descricao;
    }
    public void setPreco (double p) {
        this.preco = p;
    }   
    public double getPreco () {
        return this.preco;
    }
    public void setEstoque (int e) {
        this.estoque = e;
    }   
    public int getEstoque () {
        return this.estoque;
    }
    @Override
    public String toString () {
        return "O produto de código " + this.codigo + " é um produto de " + this.descricao + " tem preço de R$ " + this.preco + " e tem " + this.estoque + " unidades no estoque";
    }
    @Override
    public int compareTo(Produto p) {
        return this.codigo.compareTo(p.getCodigo());
    }
}