
public class Veículo {
	private String ano;
	private String cor;
    private float peso;
    private float largura;
    private int codigo;
    private String marca;
    private String modelo;
    

public Veiculo(String ano, String cor, float peso, float largura, int codigo, String marca, String modelo) {
    this.ano = ano;
    this.cor = cor;
    this.peso = peso;
    this.largura = largura;
    this.codigo = codigo;
    this.marca = marca;
    this.modelo = modelo;
}


public void dados() {
    System.out.println("Informações do carro:");
    System.out.println("Ano: " +ano);
    System.out.println("Cor: " +cor);
    System.out.println("Peso: " +peso);
    System.out.println("Largura: " +largura);
    System.out.println("Codigo: " +codigo);
    System.out.println("Marca: " +marca);
    System.out.println("Modelo: " +modelo);
}
}
