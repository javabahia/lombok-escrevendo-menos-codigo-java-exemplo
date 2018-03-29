package dominios;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class PessoaLombokData {

    @Id
    @GeneratedValue
    @Setter(value = AccessLevel.PRIVATE) private Long id;
    private String nome;
    private String sobrenome;
    private String dtNascimento;
    private String comunidade;
}
