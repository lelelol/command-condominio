package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministracaoTest {

    Administracao administracao;
    Assembleia assembleia;

    @BeforeEach
    void setUp() {
        administracao = new Administracao();
        assembleia = new Assembleia (2026, 1);
    }

    @Test
    void deveAbrirAssembleia() {
        Tarefa aberturaAssembleia = new AberturaAssembleiaTarefa(assembleia);
        administracao.executarTarefa(aberturaAssembleia);

        assertEquals("Assembleia aberta", assembleia.getSituacao());
    }

    @Test
    void deveEncerrarAssembleia() {
        Tarefa encerramentoAssembleia = new EncerramentoAssembleiaTarefa(assembleia);
        administracao.executarTarefa(encerramentoAssembleia);

        assertEquals("Assembleia encerrada", assembleia.getSituacao());
    }

    @Test
    void deveCancelarEncerramentoAssembleia() {
        Tarefa aberturaAssembleia = new AberturaAssembleiaTarefa(assembleia);
        Tarefa encerramentoAssembleia = new EncerramentoAssembleiaTarefa(assembleia);

        administracao.executarTarefa(aberturaAssembleia);
        administracao.executarTarefa(encerramentoAssembleia);

        administracao.cancelarUltimaTarefa();

        assertEquals("Assembleia aberta", assembleia.getSituacao());
    }

}
