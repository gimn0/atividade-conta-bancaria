package src.com.conta_bancaria;

public class Conta {
    // ATRIBUTOS
    private int numero;
    private String titular;
    private double limite;
    private double saldo = 0;

    // CONSTRUCTOR
    public Conta(int numero, String titular, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
    }

    // MÉTODOS
    public void sacar( double valor ) {
        if ( this.saldo > 0 && valor < this.limite ) { // Para sacar precisa ter saldo na conta ou
            this.saldo -= valor;                        // o valor precisa ser menor q o limite.
            System.out.printf("O valor de R$%,.2f foi sacado!\n", valor);
        } else {
            System.out.println("Desculpe, mas o valor desejado não pode ser sacado!");
        }
    }

    public void depositar( double valor ) {
        if ( valor > 0 ) {
            this.saldo += valor;
            System.out.printf("O valor de R$%,.2f foi depositado!\n", valor);
        } else {
            System.out.println("Desculpe, mas o valor desejado não pode ser depositado!");
        }
    }

    // GETTERS & SETTERS
    public void getSaldo() {
        System.out.printf("O saldo da conta do titular %s, número %d: R$%,.2f\n", this.titular, this.numero, this.saldo);
    }

    public void getLimite() {
        System.out.printf("O limite da conta do titular %s, número %d: R$%,.2f\n", this.titular, this.numero, this.limite);
    }
}
