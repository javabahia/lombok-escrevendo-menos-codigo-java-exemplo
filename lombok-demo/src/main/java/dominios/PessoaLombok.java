package dominios;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"nome", "sobrenome", "dtNascimento"})
@ToString
public class PessoaLombok {

    @Id @GeneratedValue
    @Getter private Long id;
    @Setter @Getter @NonNull private String nome;
    @Setter @Getter @NonNull  private String sobrenome;
    @Setter @Getter private String dtNascimento;
    @Setter @Getter private String comunidade;
}
