import obj.Cartao;
import obj.Passageiro;
import obj.Passagem;

public class Main {
    public static void main(String[] args) {


        Passageiro passageiro1 = new Passageiro("Luis",46687714);
        passageiro1.colocarSaldo(10d);
        System.out.println(passageiro1);


        Passageiro passageiro2 = new Passageiro("Felipe",1232434);
        System.out.println(passageiro2);

        Passageiro passageiro3 = new Passageiro("Felipe",1232434);
        System.out.println(passageiro3);








    }

}
