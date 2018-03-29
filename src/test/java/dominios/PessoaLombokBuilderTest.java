package dominios;

import lombok.experimental.var;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PessoaLombokBuilderTest {

    @Test
    public void criarPessoa_comLombok_comBuilder_deveRetornarObjeto() {
        PessoaLombokBuilder pessoa = PessoaLombokBuilder
                .builder()
                .nome("Mateus")
                .sobrenome("Malaquias")
                .comunidade("Sou Java")
                .dtNascimento(LocalDate.now().toString())
                .build();

        var nome = "Mateus";

        assertNotNull(pessoa);
        assertEquals(pessoa.getNome(), "Mateus");
    }
}
