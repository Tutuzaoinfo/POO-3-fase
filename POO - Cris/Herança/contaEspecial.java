public class contaEspecial extends conta {

    public contaEspecial(double saldoInicial) {
        super(saldoInicial);
    }

    public boolean sacar(double quantia) {
        double taxa = quantia * 0.01;
        double total = quantia + taxa;
        if (quantia > 0 && saldo >= total) {
            saldo -= total;
            return true;
        }
        return false;
    }
}