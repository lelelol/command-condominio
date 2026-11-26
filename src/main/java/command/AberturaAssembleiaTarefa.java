package command;

public class AberturaAssembleiaTarefa implements Tarefa {

    private Assembleia assembleia;

    public AberturaAssembleiaTarefa(Assembleia assembleia) {
        this.assembleia = assembleia;
    }

    public void executar() {
        this.assembleia.abrirAssembleia();
    }

    public void cancelar() {
        this.assembleia.encerrarAssembleia();
    }
}
