package app;
import javax.swing.JOptionPane;

public class Supermecado {
    public static void main(String[] args) {
        int opcao = 1;
    GereciamentoProdutos gerenciamento = new GereciamentoProdutos();

        //JOptionPane.showMessageDialog(null, "Menu");
        gerenciamento.adicionarProduto("Água", "Alimento", 3.20, "29/09/2030", 314);
        gerenciamento.adicionarProduto("Biscoito", "Alimento", 9.20, "17/03/2026", 23);
        gerenciamento.adicionarProduto("Sorvete", "Alimento", 32.20, "09/11/2025", 23);
        gerenciamento.adicionarProduto("Leite", "Alimento", 6.20, "02/10/2025", 23);
        

        String nome, categoria, validade, mensagem;
        double preco;
        int quantidade, busca; 
        Produto produto;

        while (opcao != 0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n01 - Adicionar Produto\n02 - Buscar Produtos\n03 - Listar Todos os Produto\n04 - Modificar Produto\n05 - Remover Produto\n00 - Sair"));
            switch (opcao) {
                case 01:
                    nome = JOptionPane.showInputDialog(null, "Digite o nome do produto");
                    categoria = JOptionPane.showInputDialog(null, "Digite a categoria do produto");
                    preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto custa a unidade do produto?"));
                    validade = JOptionPane.showInputDialog(null, "Qual a validade do produto?");
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos produtos há em estoque?"));
                    gerenciamento.adicionarProduto(nome, categoria, preco, validade, quantidade);
                    break;
                case 02:
                    busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do produto:"));
                    produto = gerenciamento.buscarProduto(busca);
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
                
                case 04:
                    busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto que deseja modificar:"));

                    produto = gerenciamento.buscarProduto(busca);
                    if(produto != null){
                        nome = JOptionPane.showInputDialog(null, "Digite o nome do produto");
                        categoria = JOptionPane.showInputDialog(null, "Digite a categoria do produto");
                        preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto custa a unidade do produto?"));
                        validade = JOptionPane.showInputDialog(null, "Qual a validade do produto?");
                        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos produtos há em estoque?"));

                        produto = gerenciamento.atualizarProduto(produto, nome, categoria, preco, validade, quantidade);
                        mensagem = "Produto modificado com sucesso\n\n" + produto.toString();
                        JOptionPane.showMessageDialog(null, mensagem);
                    } else {
                        JOptionPane.showMessageDialog(null,"Produto não encontrado");
                        break;
                    }
                    break;

                    case 05:
                        busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto que deseja modificar:"));

                        produto = gerenciamento.buscarProduto(busca);
                        if(produto != null){
                            gerenciamento.removerProduto(produto.getId());

                        } else {
                            JOptionPane.showMessageDialog(null,"Produto não encontrado");
                            break;
                        }
                    break;

                default:
                    break;
            }
        }
    }
}

//remover produto
