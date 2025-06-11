import javax.swing.*;

public class ex1 {
    public static void main(String[] args) { //declarar variaveis e array
        int repetido;
        int a [] = new int[10];
        int b [] = new int[10];

        a[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : ")); //perguntar os numeros
        a[6] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[7] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[8] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        a[9] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));

        b[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        b[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        b[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        b[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        b[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        b[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : ")); //perguntar os numeros
        b[6] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        b[7] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        b[8] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));
        b[9] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros : "));

        for (int i = 0; i < a.length; i++ ){
                repetido = a [a.length] = b[b.length]; //comparar numeros e transformar em uma variavel
                System.out.println("Numeros repetidos : " +repetido);
        }
    }
}
