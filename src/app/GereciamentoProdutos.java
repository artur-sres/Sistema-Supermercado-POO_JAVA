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
        for(i = 1000; i != ID; i++){
            if(busca == this.produtos[i].getId()){
                return this.produtos[i];
            }
        }
        return null;
    }
}
