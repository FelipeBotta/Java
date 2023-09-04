package obj;

public class Passagem {
    private String origem;
    private String destino;
    private double km;
    private double valor;

    public Passagem(String origem, String destino, double km, double valor) {
        this.origem = origem;
        this.destino = destino;
        this.km = km;
        this.valor = valor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}



