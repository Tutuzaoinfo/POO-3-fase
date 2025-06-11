class engenheiro extends funcionario {
    private String nrCREA;
    private String especializacao;

    public engenheiro(String codigo, String nome, String sexo, int horasTrabalhadas, double valorHora, String nrCREA, String especializacao) {
        super(codigo, nome, sexo, horasTrabalhadas, valorHora);
        this.nrCREA = nrCREA;
        this.especializacao = especializacao;
    }

    public void aplicarBonificacaoEngenheiro() {
        super.aplicarBonificacao();
    }

    public void mostrarDadosEngenheiro() {
        super.mostrarDados();
        System.out.println("Número CREA: " + nrCREA);
        System.out.println("Especialização: " + especializacao);
    }
}