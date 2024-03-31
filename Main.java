package Exercicio_02;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();

        System.out.println("Bem vindo a biblioteca!\n");
        System.out.println("1 - Cadastrar livro \n2 - Exibir livros cadastrados");
        int escolha = leitor.nextInt();

        switch (escolha) {
            case 1:
                // cadastra_livro()
                break;

            case 2:
                System.out.println("\nAinda não existem livros cadastrados!!");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("\nQuantos livros deseja cadastrar?");
        int quantidadeLivros = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.println("\nInsira os dados do livro " + (i + 1) + ":");
            System.out.printf("\nTítulo:");
            String titulo = leitor.nextLine();
            System.out.printf("Autor:");
            String autor = leitor.nextLine();
            System.out.printf("Ano de Publicação:");
            int ano = leitor.nextInt();
            leitor.nextLine();

            livros.add(new Livro(titulo, autor, ano));
        }

        System.out.println("\n- Livros cadastrados -");

        for (Livro livro : livros) {
            livro.exibeInfos();

        }
    }

}
