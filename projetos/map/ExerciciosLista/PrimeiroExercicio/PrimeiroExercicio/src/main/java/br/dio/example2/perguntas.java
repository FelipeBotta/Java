package br.dio.example2;

public class perguntas {

    String pergunta;

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public perguntas(String pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public String toString() {
        return "{" +
                "pergunta='" + pergunta + '\'' +
                '}';
    }
}
