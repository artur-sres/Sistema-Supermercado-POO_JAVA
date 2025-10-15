package app;

public class Aplicacao {
    public static void main(String[] args) {
        GereciamentoProdutos gerenciamento = new GereciamentoProdutos();
        gerenciamento.adicionarProduto("Água", "Alimento", 3.20, "29/09/2030", 314);
        gerenciamento.adicionarProduto("Biscoito", "Alimento", 9.20, "17/03/2026", 23);
        gerenciamento.adicionarProduto("Sorvete", "Alimento", 32.20, "09/11/2025", 23);
        gerenciamento.adicionarProduto("Leite", "Alimento", 6.20, "02/10/2025", 23);
        gerenciamento.listarProdutos();
    }
    
}
