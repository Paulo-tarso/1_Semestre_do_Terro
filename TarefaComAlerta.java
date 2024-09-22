class TarefaComAlerta extends Tarefa implements Notificacao {

    public TarefaComAlerta(){
        super(enviarNotificacao);
    }
    public TarefaComAlerta(String titulo, String descricao, String prazo, int prioridade) {
        super(titulo, descricao, prazo, prioridade);
        enviarNotificacao(); // Envia alerta ao criar a tarefa
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Alerta: A tarefa '" + this.getTitulo() + "' foi criada com sucesso!");
    }

}