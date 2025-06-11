import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cores = new String[5];    

        System.out.println("Digite 5 cores:");
        for (int i = 0; i < cores.length; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            cores[i] = scanner.nextLine();
        }

        System.out.println("\nLista de cores digitadas:");
        for (int i = 0; i < cores.length; i++) {
            System.out.println(cores[i]);
        }
        scanner.close();
    }
}
