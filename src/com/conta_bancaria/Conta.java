package src.com.conta_bancaria;

public class Conta {
    // ATRIBUTOS
    private int numero;
    private String titular;
    private double limite;
    private double saldo;

    // CONSTRUCTOR
    public Conta(int numero, String titular, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
    }

    // MÉTODOS
    public void sacar( double valor ) {
        if ( this.saldo >= 0 || valor < this.limite ) { // Para sacar precisa ter saldo na conta ou
            this.saldo -= valor;                        // o valor precisa ser menor q o limite.
            System.out.println("O valor de R$" + valor + " foi sacado!");
        } else {
            System.out.println("Desculpe, mas o valor desejado não pode ser sacado!");
        }
    }

    public void depositar( double valor ) {
        if ( valor > 0 ) {
            this.saldo += valor;
            System.out.println("O valor de R$" + valor + " foi depositado!");
        } else {
            System.out.println("Desculpe, mas o valor desejado não pode ser depositado!");
        }
    }

    // GETTERS & SETTERS
    public String saldoToString() {
        return "O saldo da conta: R$" + this.saldo;
    }

    public String limiteToString() {
        return "O limite da conta: R$" + this.limite;
    }
}
