import java.util.Scanner; //importar o scanner

public class exercicio5 {
    public static void main(String[] args) { //classe principal
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, igual; //declarar variaveis

        System.out.println("Qual seu primeiro número ? ");//faz a pergunta
        num1 = entrada.nextInt(); //transforma a resposta na variavel

        System.out.println("Qual seu segundo número ? ");
        num2 = entrada.nextInt();

        System.out.println("Qual seu terceiro número ? ");
        num3 = entrada.nextInt();

        if (num1 == num2){//se o numeros forem iguaia da print nos dois
            System.out.println("Números iguais: " +num1+ " e " +num2);
            System.out.println("Números em ordem crescente: " +num1+num2+num3);
        }
        if (num1 == num3){//se o numeros forem iguaia da print nos dois
            System.out.println("Números iguais: " +num1+ " e " +num3);
            System.out.println("Números em ordem crescente: " +num1+num2+num3);
        }
        if (num2 == num3){//se o numeros forem iguaia da print nos dois
            System.out.println("Números iguais: " +num2+ " e " +num3);
            System.out.println("Números em ordem crescente: " +num1+num2+num3);
        }
    }
}
