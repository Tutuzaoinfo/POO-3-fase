import javax.swing.*;

public class ex4 {
    public static void main(String[] args) {
        String senha;   //criar variavel

        senha = JOptionPane.showInputDialog("Digite a senha : ");

        if((senha == "A") && (senha == "E") && (senha == "I") && (senha == "O") && (senha == "U")) {
            System.out.println("Senha válida!");//caso nao tenha vogal a senha e valida
        }
        else{
            System.out.println("Senha não válida"); //caso tenha vogal a senha nao esta valida
        }

    }
}
