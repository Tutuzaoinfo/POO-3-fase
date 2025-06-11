import java.util.Scanner; //importar o scanner

public class exercicio1 {
    public static void main(String[] args) { //classe principal
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;      //definir variáveis
        double peso;

        System.out.println("Qual seu nome ? "); //faz a pergunta
        nome = entrada.nextLine();  //transforma a resposta na variavel
        System.out.println("Qual sua idade ? ");                      //perguntar as informações
        idade = entrada.nextInt();
        System.out.println("Qual seu peso ? ");
        peso = entrada.nextDouble();

        if ((idade >= 0) && (idade <= 15)) {
            System.out.println("Você está abaixo da idade permitida e não pode doar sangue ! ");    //caso menor de 15 anos nao doa sangue
            System.exit(0); //encerra o programa
        }
        if ((idade >= 16) && (idade <= 17) && (peso > 50)) {
            System.out.println("Você pode doar sangue com a autorização de seus pais ! "); //caso 16 ou 17 anos acima de 50 quilos pode doar sangue com a permissão dos pais
            System.exit(0); //encerra o programa
        }
        if ((idade >= 16) && (idade <= 17) && (peso < 50)) {
            System.out.println("Você está abaixo do peso permitido e não pode doar sangue ! "); //caso 16 ou 17 anos abaixo de 50 quilos nao pode doar sangue
            System.exit(0); //encerra o programa
        }
        if ((idade >= 18) && (idade <= 69) && (peso > 50)) { //caso entre 18 e 69 anos acima de 50 quilos pode doar sangue
            System.out.println("Você pode doar sangue ! ");
            System.exit(0); //encerra o programa
        }
        if ((idade >= 18) && (idade <= 69) && (peso < 50)) {
            System.out.println("Você está abaixo do peso permitido e não pode doar sangue ! "); //caso entre 18 e 69 anos abaixo de 50 quilos nao pode doar sangue
            System.exit(0); //encerra o programa
        }
        if (idade > 69) {
            System.out.println("Você está acima da idade permitida e não pode doar sangue ! "); //caso acima de 69 anos nao pode doar sangue
            System.exit(0); //encerra o programa
        }
    }
}