import java.util.Scanner;

public class cadastrarAnimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Escolha o tipo de animal (1 - Peixe, 2 - Mamífero): ");
        int escolha = scanner.nextInt();
        scanner.nextLine();  

        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Comprimento (em cm): ");
        float comprimento = scanner.nextFloat();

        System.out.print("Número de patas: ");
        int numeroDePatas = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Ambiente: ");
        String ambiente = scanner.nextLine();

        System.out.print("Velocidade m�dia (m/s): ");
        float velocidadeMedia = scanner.nextFloat();
        scanner.nextLine(); 
        if (escolha == 1) {
            
            System.out.print("Característica do peixe: ");
            String caracteristica = scanner.nextLine();

            
            Peixe peixe = new Peixe(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia, caracteristica);
            System.out.println("\n📋 Relatório do Peixe:");
            peixe.dadosPeixe();
        } else if (escolha == 2) {
  
            System.out.print("Alimento do mam�fero: ");
            String alimento = scanner.nextLine();

         
            Mamifero mamifero = new Mamifero(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia, alimento);
            System.out.println("\n📋 Relatório do Mamífero:");
            mamifero.dadosMamifero();
        } else {
            System.out.println("Opção inválida! Escolha 1 para Peixe ou 2 para Mamífero.");
        }

        scanner.close(); 
    }
}