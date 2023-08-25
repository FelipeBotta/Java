package dio.exercicio.linguagens;

import java.util.Objects;

public class Linguagens implements Comparable<Linguagens> {

    String nome;
    Integer ano;
    String ide;


    public Linguagens(String nome, int ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", ide='" + ide + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Linguagens that = (Linguagens) object;
        return ano == that.ano && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano, ide);
    }

    @Override
    public int compareTo(Linguagens o) {
        return 0;
    }
}
