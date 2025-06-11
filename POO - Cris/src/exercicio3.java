import java.util.Scanner; //importar o scanner

public class exercicio3 {
    public static void main(String[] args) { //classe principal
        Scanner quantia = new Scanner(System.in);
        String nome, sexo;
        double altura, peso, total2 = 0, total3 = 0, media_alt_homens, media_peso_mulheres; //declarar variaveis
        int qtde, total1, homens = 0, mulheres = 0;

        System.out.println("Quantas pessoas vão ser cadastradas ? ");
        qtde = quantia.nextInt();
        total1 = qtde;      //perguntar as informações

        for(qtde=1; qtde>=1; qtde++) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Qual seu nome ? "); //faz a pergunta
            nome = entrada.nextLine(); //transforma a resposta na variavel

            System.out.println("Qual seu gênero (feminino ou masculino) ? ");
            sexo = entrada.nextLine();
            if (sexo.equals("masculino")){
                homens++;   //se masculino adiciona mais 1 na contagem de homens
            }
            else if (sexo.equals("feminino")){
                mulheres++; //se feminino adiciona mais 1 na contagem de mulheres
            }

            System.out.println("Qual sua altura ? ");
            altura = entrada.nextDouble();
            if(sexo.equals("masculino")) {
                total2 = total2 + altura; //acumula o valor das alturas dos homens
            }

            System.out.println("Qual seu peso ? ");
            peso = entrada.nextDouble();
            if (sexo.equals("feminino")) {
                total3 = total3 + peso; //acumula o valor dos pesos das mulheres
            }

            if(total1 == qtde) {    //se o numero de pessoas cadastradas for igual a quantas pessoas eram pra ser cadastradas mostra as informações
                media_alt_homens = (total2 / homens); //pega a soma das alturas e divide pelo total de homens
                media_peso_mulheres = (total3 / mulheres); //pega a soma dos pesos das mulheres e divide pelo numero de mulheres
                System.out.println("Maior e menor altura cadastrada: " +altura+ "e" +altura);
                System.out.println("Média de altura dos homens: " +media_alt_homens);
                System.out.println("Média de peso das mulheres: " +media_peso_mulheres);
                System.out.println("Número de homens cadastrados: " +homens); //mostra a contagem dos homens
                System.exit(0);
            }

        }
    }
}
