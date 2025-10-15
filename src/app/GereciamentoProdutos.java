package app;

public class GereciamentoProdutos {
    private Produto produtos[];
    private int id;
    static public int ID = 1000;

    //Construtor
    public GereciamentoProdutos() {
        this.produtos = new Produto[5];
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

    public void listarProdutos(){
        int i;
        for(i = 0; i < this.id; ++i){
            System.out.println(this.produtos[i].toString());
        }
    }
}
