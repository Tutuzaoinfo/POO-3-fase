package aula10;

public class Mamifero extends Animal {
    private String alimento;

    
    public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

   
    public void dadosMamifero() {
        super.dados(); l
        System.out.println("Alimento: " + alimento);
    }
}