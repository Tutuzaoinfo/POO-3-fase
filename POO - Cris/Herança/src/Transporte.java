public class Transporte {
    private String descricao;
    private double tamanho;
    private double peso;

    public Transporte(String descricao, double tamanho, double peso) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void exibirInfo() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Tamanho: " + tamanho + " metros");
        System.out.println("Peso: " + peso + " kg");
    }
}
