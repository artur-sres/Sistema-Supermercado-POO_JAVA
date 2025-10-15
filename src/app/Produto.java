package app;

public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private double preco;
    private String validade;
    private int quantidade;

    //Construtor
    public Produto(String nome, String categoria, double preco, String validade, int quantidade){
        this.id = GereciamentoProdutos.ID++;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    //Getters
    public int getId(){return this.id;}
    public String getNome(){return this.nome;}
    public String getCategoria(){return this.categoria;}
    public double getPreco(){return this.preco;}
    public String getValidade(){return this.validade;}
    public int getQuantidade(){return this.quantidade;}

    //Setters
    public void setId(int id) {this.id = id;}
    public void setNome(String nome) {this.nome = nome;}
    public void setCategoria(String categoria) {this.categoria = categoria;}
    public void setPreco(double preco) {this.preco = preco;}
    public void setValidade(String validade) {this.validade = validade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;} 
    
    public String toString(){
        return "ID: " + this.id + " - " + this.nome +
               "\nCategoria: " + this.categoria + " - Validade: " + this.validade + " - Preço: R$" + String.format("%.2f", this.preco) +
               "\nQuantidade em estoque: " + this.quantidade + "\n";
    }
}
