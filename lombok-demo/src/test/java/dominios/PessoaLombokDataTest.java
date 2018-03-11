package dominios;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PessoaLombokDataTest {

    @Test
    public void criarPessoa_comLombok_comData_deveRetornarObjeto() {
        PessoaLombokData pessoa = new PessoaLombokData();
        pessoa.setNome("Mateus");
        pessoa.setSobrenome("Malaquias");
        pessoa.setDtNascimento(LocalDate.now().toString());
        pessoa.setComunidade("Sou Java");

        pessoa.equals(new PessoaLombok());
        pessoa.toString();

        assertNotNull(pessoa);
        assertEquals(pessoa.getNome(), "Mateus");
    }
}
