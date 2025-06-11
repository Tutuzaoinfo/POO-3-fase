package aula10;

public class Peixe extends Animal {
    private String caracteristica;

    
    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

   
    public void dadosPeixe() {
        super.dados(); 
        System.out.println("Caracter�stica: " + caracteristica);
    }
}