import java.util.Scanner; //importar o scanner

public class exercicio4 {
    public static void main(String[] args) { //classe principal
        Scanner quantia = new Scanner(System.in);
        String nome;
        double celsius, kelvin, reaumur, farenheit, conversor1, conversor2, conversor3 ; //criar variaveis
        int temperatura, tempo = 1;

        System.out.println("Temperatura em celsius :"); //pergunta a temperatura em celsius
        celsius = quantia.nextDouble();

        while (tempo == 1) { //enquanto ser 1 continua no while
        System.out.println("Para qual temperatura você deseja converter ? (1 - Farenheit, 2 - Kelvin, 3 - Réaumur, 4 - Sair");
        temperatura = quantia.nextInt();

            if(temperatura == 1) {
                conversor1 = celsius * (1.8) + (32); //converte para farenheit
                System.out.println("Celsius em Farenheit:" +conversor1);

            }
            else if(temperatura == 2) {
                conversor2 = celsius + (273.15); //converte para kelvin
                System.out.println("Celsius em Kelvin:" +conversor2);
            }
            else if(temperatura == 3) {
                conversor3 = celsius * (0.8); //converte para reaumur
                System.out.println("Celsius em Réaumur:" +conversor3);
            }
            else if(temperatura == 4) { //encerra o programa
                System.out.println("Obrigado pela escolha ! ");
                System.exit(0);
            }
            else if(temperatura < 5) { //caso o numero seja invalido
                System.out.println("Número inválido!");
            }
        }
    }
}
