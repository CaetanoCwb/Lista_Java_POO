package Exercicio_03;

public class ContaBancaria {

        private int numeroConta;
        private String nomeTitular;
        private float saldo;
    
        public ContaBancaria(int numeroConta, String nomeTitular, float saldoInicial) {
            this.numeroConta = numeroConta;
            this.nomeTitular = nomeTitular;
            this.saldo = saldoInicial;
        }
    
        public int getNumeroConta() {
            return numeroConta;
        }
    
        public String getNomeTitular() {
            return nomeTitular;
        }
    
        public float getSaldo() {
            return saldo;
        }
    
        public void depositar(float valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }
    
        public void sacar(float valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente ou valor de saque inválido.");
            }
        }
}
