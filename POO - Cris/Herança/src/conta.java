import javax.swing.JOptionPane;

public class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
            JOptionPane.showMessageDialog(null, "Depósito de R$ " + quantia + " realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido para depósito.");
        }
    }

    public boolean sacar(double quantia) {
        double taxa = quantia * 0.02;
        double total = quantia + taxa;
        if (quantia > 0 && saldo >= total) {
            saldo -= total;
            JOptionPane.showMessageDialog(null, "Saque de R$ " + quantia + " realizado com sucesso! Taxa: R$ " + taxa);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor inválido para saque.");
            return false;
        }
    }

    public double getSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + saldo);
        return saldo;
    }
}