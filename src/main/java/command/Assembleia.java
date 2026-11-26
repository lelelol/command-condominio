package command;

public class Assembleia {

    private int ano;
    private int numero;
    private String situacao;

    public Assembleia(int ano, int numero) {
        this.ano = ano;
        this.numero = numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirAssembleia() {
        this.situacao = "Assembleia aberta";
    }

    public void encerrarAssembleia() {
        this.situacao = "Assembleia encerrada";
    }
}
