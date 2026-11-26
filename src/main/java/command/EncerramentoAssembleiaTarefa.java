package command;

public class EncerramentoAssembleiaTarefa implements Tarefa {

    private Assembleia assembleia;

    public EncerramentoAssembleiaTarefa(Assembleia assembleia) {
        this.assembleia = assembleia;
    }

    public void executar() {
        this.assembleia.encerrarAssembleia();
    }

    public void cancelar() {
        this.assembleia.abrirAssembleia();
    }
}
