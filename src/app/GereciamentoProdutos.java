package app;

import javax.swing.JOptionPane;

public class GereciamentoProdutos {
    private Produto produtos[];
    private int id;
    static public int ID = 1000;

    //Construtor
    public GereciamentoProdutos() {
        this.produtos = new Produto[10];
        this.id = 0;
    }

    public void adicionarProduto(String nome, String categoria, double preco, String validade, int quantidade){
        if(this.id < 5){
            Produto p = new Produto(nome, categoria, preco, validade, quantidade);
            this.produtos[this.id] = p;
            ++this.id;
        } else {
            System.out.println("Quantidade máxima de produtos cadastrados no sistema");
        }
    }    

    public String listarProdutos(){
        int i;
        String mensagem = ""; 
        for(i = 0; i < this.id; ++i){
            mensagem = mensagem + (this.produtos[i].toString() + "\n");
        }
        return mensagem;
    }

    public Produto buscarProduto(int busca){
        int i; 
        if (busca >= ID){
            return null;
        }
        for(i = 0; i != ID; i++){
            if(busca == this.produtos[i].getId()){
                return this.produtos[i];
            }
        }
        return null;
    }

    public Produto atualizarProduto(Produto produto, String nome, String categoria, Double preco, String validade, int quantidade){
        if(produto == null) {
            JOptionPane.showMessageDialog(null, "Houve um problema :(");
            return null;
        } else {
            produto.setNome(nome);
            produto.setCategoria(categoria);
            produto.setPreco(preco);
            produto.setValidade(validade);
            produto.setQuantidade(quantidade);
            return produto;
        }
    }

    public void removerProduto(int busca){
        int i;
        for(i = 0; i < this.id; i++){
            if(busca == this.produtos[i].getId()){ //aMain
                if(i == (this.id-1)){
                    this.produtos[i] = null;
                }
            } else {
                int j;
                for(j = i; j < (this.id - 1); ++j) {
                    this.produtos[j] = this.produtos[i+1];
                }
                this.produtos[this.id - 1] = null;
            }
            this.id--;
        }
    }
}

//pai nosso que estas no ceupackage app;

import javax.swing.JOptionPane;

public class GereciamentoProdutos {
    private Produto produtos[];
    private int id;
    static public int ID = 1000;

    //Construtor
    public GereciamentoProdutos() {
        this.produtos = new Produto[10];
        this.id = 0;
    }

    public void adicionarProduto(String nome, String categoria, double preco, String validade, int quantidade){
        if(this.id < 5){
            Produto p = new Produto(nome, categoria, preco, validade, quantidade);
            this.produtos[this.id] = p;
            ++this.id;
        } else {
            System.out.println("Quantidade máxima de produtos cadastrados no sistema");
        }
    }    

    public String listarProdutos(){
        int i;
        String mensagem = ""; 
        for(i = 0; i < this.id; ++i){
            mensagem = mensagem + (this.produtos[i].toString() + "\n");
        }
        return mensagem;
    }

    public Produto buscarProduto(int busca){
        int i; 
        if (busca >= ID){
            return null;
        }
        for(i = 0; i != ID; i++){
            if(busca == this.produtos[i].getId()){
                return this.produtos[i];
            }
        }
        return null;
    }

    public Produto atualizarProduto(Produto produto, String nome, String categoria, Double preco, String validade, int quantidade){
        if(produto == null) {
            JOptionPane.showMessageDialog(null, "Houve um problema :(");
            return null;
        } else {
            produto.setNome(nome);
            produto.setCategoria(categoria);
            produto.setPreco(preco);
            produto.setValidade(validade);
            produto.setQuantidade(quantidade);
            return produto;
        }
    }

    public void removerProduto(int busca){
        int i;
        for(i = 0; i < this.id; i++){
            if(busca == this.produtos[i].getId()){ //aMain
                if(i == (this.id-1)){
                    this.produtos[i] = null;
                }
            } else {
                int j;
                for(j = i; j < (this.id - 1); ++j) {
                    this.produtos[j] = this.produtos[i+1];
                }
                this.produtos[this.id - 1] = null;
            }
            this.id--;
        }
    }
}

//pai nosso que estas no ceu
