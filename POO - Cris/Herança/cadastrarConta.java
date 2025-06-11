import java.util.Scanner;

public class cadastrarConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        conta conta = null;

        // Menu para o tipo de conta
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1 - Conta Corrente Normal");
        System.out.println("2 - Conta Corrente Especial");
        int tipoConta = scanner.nextInt();

        // Criação da conta com base na escolha do usuário
        if (tipoConta == 1) {
            conta = new conta(0);  // Saldo inicial será 0
            System.out.println("Você escolheu uma Conta Corrente Normal.");
        } else if (tipoConta == 2) {
            conta = new contaEspecial(0);  // Saldo inicial será 0
            System.out.println("Você escolheu uma Conta Corrente Especial.");
        } else {
            System.out.println("Opção inválida. Encerrando...");
            return;
        }

        // Menu de operações
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (conta.sacar(valorSaque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;

                case 4:
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}