package dominios;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private LocalDate dtNascimento;
    private String comunidade;

    public Pessoa() {}

    public Pessoa(String nome, String sobrenome, LocalDate dtNascimento, String comunidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtNascimento = dtNascimento;
        this.comunidade = comunidade;
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getComunidade() {
        return comunidade;
    }

    public void setComunidade(String comunidade) {
        this.comunidade = comunidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(sobrenome, pessoa.sobrenome) &&
                Objects.equals(dtNascimento, pessoa.dtNascimento);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, sobrenome, dtNascimento);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dtNascimento=" + dtNascimento +
                ", comunidade='" + comunidade + '\'' +
                '}';
    }
}
