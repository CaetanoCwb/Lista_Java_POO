package Exercicio_08;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas;
    private double valorTotal;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getValor();
    }

    public void cancelarPedido() {
        pizzas.clear();
        valorTotal = 0.0;
    }

    // Getters e setters
    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
