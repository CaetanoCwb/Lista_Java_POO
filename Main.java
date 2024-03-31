package Exercicio_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Gerar relatório de estoque");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    gerarRelatorio();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade em estoque do produto:");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    private static void atualizarProduto() {
        System.out.println("Digite o código do produto que deseja atualizar:");
        int codigo = scanner.nextInt();

        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                System.out.println("Digite o novo nome do produto:");
                String nome = scanner.next();
                System.out.println("Digite o novo preço do produto:");
                double preco = scanner.nextDouble();
                System.out.println("Digite a nova quantidade em estoque do produto:");
                int quantidade = scanner.nextInt();

                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);

                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    private static void removerProduto() {
        System.out.println("Digite o código do produto que deseja remover:");
        int codigo = scanner.nextInt();

        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    private static void gerarRelatorio() {
        System.out.println("Relatório de estoque:");
        System.out.println("------------------------------");
        for (Produto produto : estoque) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidade());
            System.out.println("------------------------------");
        }
    }

}
