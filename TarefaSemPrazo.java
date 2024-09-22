class TarefaSemPrazo extends Tarefa {

    public TarefaSemPrazo(String titulo, String descricao) {
        super(titulo, descricao,"Sem prazo", 0); // Sem prazo definido
    }

    @Override
    public long calcularDiasRestantes() {
        return -1; // Indica que não há prazo definido
    }
}
