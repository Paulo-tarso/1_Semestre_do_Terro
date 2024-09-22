public class TarefaUrgente extends Tarefa implements Notificacao{
    private String razaoUrgencia;


    // Construtor da Tarefa Urgente
    public TarefaUrgente(String titulo, String descricao, String prazo, String razaoUrgencia) {
        super(titulo, descricao, prazo, 5);  // new Tarefa()
        this.razaoUrgencia = razaoUrgencia;
    }

    // Métodos getters e setters
    public String getRazaoUrgencia() {
        return this.razaoUrgencia;
    }

    public void setRazaoUrgencia(String razaoUrgencia) {
        this.razaoUrgencia = razaoUrgencia;
    }

    // Sobreescrevendo o método exibirDetalhes()
    @Override
    public void exibirDetalhes() {
        System.out.println("==============Tarefa urgente==================");
        super.exibirDetalhes();
        System.out.println("Razão da Urgência: " + this.razaoUrgencia);
    }
    @Override
    public void enviarNotificacao(){

        System.out.println("============== Notificaçao =============");
        System.out.println("Notificação recebida");

    }
}
