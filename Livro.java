package Exercicio_02;

public class Livro {

    private String nome;
    private String autor;
    private int ano;

    public Livro(String nome, String autor, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;

    }

    void exibeInfos() {

        System.out.println("\nlivro: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Ano publicado: " + ano);

    }
}
