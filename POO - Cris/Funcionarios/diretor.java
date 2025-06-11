
class diretor extends funcionario {
    private String areaGestao;

    public diretor(String codigo, String nome, String sexo, int horasTrabalhadas, double valorHora, String areaGestao) {
        super(codigo, nome, sexo, horasTrabalhadas, valorHora);
        this.areaGestao = areaGestao;
    }

    public void aplicarBonificacaoDiretor() {
        double bonificacao = 0.02 * salario;
        this.salario += bonificacao;
    }

    public void mostrarDadosDiretor() {
        super.mostrarDados();
        System.out.println("Área de Gestão: " + areaGestao);
    }
}