package src.com.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(12345, "Fulano de Taldeu", 1000.50);

        c1.sacar(10.50);
        c1.getSaldo();
        c1.depositar(5421.85);
        c1.sacar(25.70);
        c1.getSaldo();
        c1.sacar(1300.99);
        c1.getLimite();
    }
}
