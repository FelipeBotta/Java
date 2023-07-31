package padrao;

public interface Iconta {
	
	 void sacar(double valor); 
	
	 void depoisitar(double valor);
	
	 void transferir(double valor, Conta contaDestino);
		

}
