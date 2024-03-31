package Exercicio_08;

import java.util.List;
import java.util.ArrayList;

public class Pizzaria {
    public static void main(String[] args) {
        // Criando algumas pizzas
        Pizza mussarela = new Pizza("Mussarela", 25.0, List.of("Queijo", "Tomate", "Orégano"));
        Pizza calabresa = new Pizza("Calabresa", 30.0, List.of("Calabresa", "Queijo", "Cebola"));
        Pizza frangoCatupiry = new Pizza("Frango com Catupiry", 35.0, List.of("Frango", "Catupiry", "Milho"));

        // Criando um pedido
        Pedido pedido = new Pedido();
        pedido.adicionarPizza(mussarela);
        pedido.adicionarPizza(calabresa);

        // Exibindo as pizzas do pedido e o valor total
        System.out.println("Pizzas do pedido:");
        for (Pizza pizza : pedido.getPizzas()) {
            System.out.println("- " + pizza.getNome());
        }
        System.out.println("Valor Total: R$ " + pedido.getValorTotal());

        // Cancelando o pedido
        pedido.cancelarPedido();
        System.out.println("Pedido cancelado. Total: R$ " + pedido.getValorTotal());
    }
}
