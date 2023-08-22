package br.dio.example2;

public class resposta {

    int resposta;

    public resposta(int resposta) {
        this.resposta = resposta;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "{" +
                "resposta=" + resposta +
                '}';
    }
}
