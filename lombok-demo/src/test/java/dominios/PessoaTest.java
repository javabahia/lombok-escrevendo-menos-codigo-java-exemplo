package dominios;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PessoaTest {

    @Test
    public void criarPessoa_comConstrutorPadrao_deveRetornarObjeto() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mateus");
        pessoa.setSobrenome("Malaquias");
        pessoa.setDtNascimento(LocalDate.now());
        pessoa.setComunidade("Sou Java");

        pessoa.equals(new Pessoa());
        pessoa.toString();

        assertNotNull(pessoa);
        assertEquals(pessoa.getNome(), "Mateus");
    }
}
