class gerente extends funcionario {
    private String setor;

    public gerente(String codigo, String nome, String sexo, int horasTrabalhadas, double valorHora, String setor) {
        super(codigo, nome, sexo, horasTrabalhadas, valorHora);
        this.setor = setor;
    }

    public void aplicarBonificacaoGerente() {
        double bonificacao = 0.02 * salario;
        this.salario += bonificacao;
    }

    public void mostrarDadosGerente() {
        super.mostrarDados();
        System.out.println("Setor: " + setor);
    }
}