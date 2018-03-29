package dominios;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Getter
public class PessoaLombokBuilder {

    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String sobrenome;
    private String dtNascimento;
    private String comunidade;

}
