package obj;

public class Passageiro extends Cartao{
    private String nome;
    private int cpf;

    public Passageiro(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
        Cartao.getId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", id=" + getId() +
                '}';
    }
}


