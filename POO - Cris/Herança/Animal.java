package aula10;

public class Animal {
    private String nome;
    private float comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    
    public Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    
    public void dados() {
        System.out.println("ðŸ�¾ Dados do Animal:");
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("NÃºmero de patas: " + numeroDePatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade mÃ©dia: " + velocidadeMedia + " m/s");
    }
}