import java.util.Scanner;
import java.util.ArrayList;

public class cadastrarFuncionarios {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<funcionario> funcionarios = new ArrayList<>();
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Engenheiro");
            System.out.println("2 - Cadastrar Diretor");
            System.out.println("3 - Cadastrar Secretário");
            System.out.println("4 - Cadastrar Gerente");
            System.out.println("5 - Calcular Salarios e Aumentos");
            System.out.println("6 - Sair");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 6) {
            	System.out.print("Cadastros finalizado.... ");
            	break;
            }

            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Sexo: ");
            String sexo = scanner.nextLine();
            System.out.print("Horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();
            System.out.print("Valor hora: ");
            double valorHora = scanner.nextDouble();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Número CREA: ");
                    String nrCREA = scanner.nextLine();
                    System.out.print("Especialização: ");
                    String especializacao = scanner.nextLine();
                    engenheiro engenheiro = new engenheiro(codigo, nome, sexo, horasTrabalhadas, valorHora, nrCREA, especializacao);
                    funcionarios.add(engenheiro);
                    engenheiro.mostrarDadosEngenheiro();
                    break;

                case 2:
                    System.out.print("Área de Gestão: ");
                    String areaGestao = scanner.nextLine();
                    diretor diretor = new diretor(codigo, nome, sexo, horasTrabalhadas, valorHora, areaGestao);
                    funcionarios.add(diretor);
                    diretor.mostrarDadosDiretor();
                    break;

                case 3:
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Setor: ");
                    String setor = scanner.nextLine();
                    secretario secretario = new secretario(codigo, nome, sexo, horasTrabalhadas, valorHora, categoria, setor);
                    funcionarios.add(secretario);
                    secretario.mostrarDadosSecretario();
                    break;

                case 4:
                    System.out.print("Setor: ");
                    String setorGerente = scanner.nextLine();
                    gerente gerente = new gerente(codigo, nome, sexo, horasTrabalhadas, valorHora, setorGerente);
                    funcionarios.add(gerente);
                    gerente.mostrarDadosGerente();
                    break;
                    	
                case 5:
                    System.out.println("Calcular salarios..... ????");
                    if 

                    System.out.println("Calcular reajustes..... ????");
                    System.out.println("----------");
                    break;

                default:
                    System.out.println("Opção Inválida.");
            }
        }
        scanner.close();
    }
}