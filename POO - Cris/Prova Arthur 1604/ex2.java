import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {
        int a [] = new int[15]; //declarar variaveis
        boolean decrescente;
        int j;
        j = a.length;
        a[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[6] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : ")); //perguntar os numeros
        a[7] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[8] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[9] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[10] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[11] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[12] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[13] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[14] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));

        for (int i = 0; i < a.length; i++ ){
            decrescente = a[i] > a[j]; //vai criar a variavel indo do maior numero ate o menor
            System.out.println("Ordem decrescente : " +decrescente);

        }
    }
}
