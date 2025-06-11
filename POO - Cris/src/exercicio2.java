import java.util.Scanner; //importar o scanner

public class exercicio2 {
    public static void main(String[] args) { //classe principal
        Scanner quantia = new Scanner(System.in);
        String nome;
        int idade, qtde, total, infantil = 0, juvenil = 0, profissional = 0, veterano = 0; //definir variáveis

        System.out.println("Quantos atletas vão ser cadastrados ? ");
        qtde = quantia.nextInt();                                           //perguntar as informações
        total = qtde;

        for(qtde=1; qtde>=1; qtde++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Qual seu nome ? "); //faz a pergunta
            nome = entrada.nextLine(); //transforma a resposta na variavel
            System.out.println("Qual sua idade ? ");
            idade = entrada.nextInt();

            if ((idade >= 0) && (idade <= 13)) {    //se for entre 0 e 13 anos categoria infantil
                System.out.println("Categoria infantil ");
                infantil++;
            }
            if ((idade >= 14) && (idade <= 17)) { //se for entre 14 e 17 anos categoria juvenil
                System.out.println("Categoria juvenil ");
                juvenil++;
            }
            if ((idade >= 18) && (idade <= 40)) {   //se for entre 18 e 40 anos categoria profissional
                System.out.println("Categoria Profissional ");
                profissional++;
            }
            if (idade > 40) { //se for 40 anos ou mais categoria veterano
                System.out.println("Categoria Veterano ");
                veterano++;
            }

            if(total == qtde){ //se o numero de pessoas cadastradas for igual a quantas pessoas eram pra ser cadastradas mostra as informações
                System.out.println("Atletas infantis: " +infantil);
                System.out.println("Atletas juvenis: "  +juvenil);
                System.out.println("Atletas infantis: " +profissional);
                System.out.println("Atletas infantis: " +veterano);

                System.exit(0);
            }
        }
    }
}