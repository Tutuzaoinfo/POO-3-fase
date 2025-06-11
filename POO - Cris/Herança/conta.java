public class conta {
    protected double saldo;

    public conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        }
    }

    public boolean sacar(double quantia) {
        double taxa = quantia * 0.02;
        double total = quantia + taxa;
        if (quantia > 0 && saldo >= total) {
            saldo -= total;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}