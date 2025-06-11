import javax.swing.*;

public class ex3 {
    public static void main(String[] args) {
        cadastro(); //chamar o metodo
        System.exit(0);
    }
        public static void cadastro() { //criar o metodo
            String n [][] = new String[5][5];
            String aluno;   //criar variaveis
            aluno = JOptionPane.showInputDialog("Digite os alunos : "); //pedir as informações
            System.out.println("Alunos :" + aluno);
        }
}
