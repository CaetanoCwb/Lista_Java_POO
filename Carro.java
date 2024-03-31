package Exercicio_05;

public class Carro {
    // Atributos privados
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    // Construtor
    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; // O carro começa parado
    }

    // Método para acelerar o carro
    public void acelerar(int aumentoVelocidade) {
        if (aumentoVelocidade > 0) {
            this.velocidadeAtual += aumentoVelocidade;
            System.out.println("O carro acelerou para " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("Aumento de velocidade inválido.");
        }
    }

    // Método para frear o carro
    public void frear(int reducaoVelocidade) {
        if (reducaoVelocidade > 0) {
            this.velocidadeAtual -= reducaoVelocidade;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0; // Não permitir velocidade negativa
            }
            System.out.println("O carro reduziu a velocidade para " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("Redução de velocidade inválida.");
        }
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }

}
