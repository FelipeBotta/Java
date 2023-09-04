package obj;

public class Cartao {

    private static int id = 0;
    private double saldo = 0d;

    public Cartao()
    {id++;}

    public void colocarSaldo(double credito){
        saldo += credito;
    }

    public void comprarPassagem(){

    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Cartao.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "{" +
                "saldo=" + saldo +
                " Id=" + getId() +
                '}';
    }
}
