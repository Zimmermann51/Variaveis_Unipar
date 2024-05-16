package br.unipar;

public class ContaPoupanca {
    private double saldo;

    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        double taxa = 5.0;
        double valorTotal = valor + taxa;
        if (valor > 0 && saldo >= valorTotal) {
            saldo -= valorTotal;
            return true;
        }
        return false;
    }
}