package app;

//Importações
import javax.swing.JOptionPane; //Importa a biblioteca para criar janelas

public class Supermecado {
    public static void main(String[] args) {
        int opcao = 1;
    GereciamentoProdutos gerenciamento = new GereciamentoProdutos(); //Cria a nova lista responsável por gerenciar os produtos

        //Adiciona produtos iniciais para testes
        gerenciamento.adicionarProduto("Água", "Alimento", 3.20, "29/09/2030", 314);
        gerenciamento.adicionarProduto("Biscoito", "Alimento", 9.20, "17/03/2026", 121);
        gerenciamento.adicionarProduto("Amaciante", "Limpeza", 22.20, "01/01/2029", 96);

        do {
            //Declaração de variáveis usadas no menu
            String nome, categoria, validade, mensagem;
            double preco;
            int quantidade, busca; 
            Produto produto;

            //Menu de opções
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n01 - Adicionar Produto\n02 - Buscar Produto\n03 - Listar Todos os Produtos\n00 - Sair"));

            //Switch case para tratar as opções do menu
            switch (opcao) {

                case 01: //Adicionar um novo produto

                    //Pede os dados do produto nas janelas
                    nome = JOptionPane.showInputDialog(null, "Digite o nome do produto");
                    categoria = JOptionPane.showInputDialog(null, "Digite a categoria do produto");
                    preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto custa a unidade do produto?"));
                    validade = JOptionPane.showInputDialog(null, "Qual a validade do produto?");
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos produtos há em estoque?"));
                    
                    gerenciamento.adicionarProduto(nome, categoria, preco, validade, quantidade); //Adiciona o produto na lista
                    break;

                case 02:
                    busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do produto:")); //Pede o ID do produto que deseja buscar
                    produto = gerenciamento.buscarProduto(busca); //Busca o produto na lista

                    //Tratamento para casos em que o produto é encontraado ou não
                    if(produto != null){
                        mensagem = produto.toString();
                        JOptionPane.showMessageDialog(null, mensagem);
                    } else {
                        JOptionPane.showMessageDialog(null, "Produto não encontrado");
                    }

                    break;

                case 03:
                JOptionPane.showMessageDialog(null, gerenciamento.listarProdutos());
                break;
                default:
                    break;
            }
        }while (opcao != 0); //Enquanto a opção for diferente de 0, o menu continua aparecendo         
    }
}
