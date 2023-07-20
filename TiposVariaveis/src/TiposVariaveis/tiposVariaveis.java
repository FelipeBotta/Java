package TiposVariaveis;

public class tiposVariaveis {

	public static void main(String[] args) {
		
		String meuNome = "Luis";
		
		double salarioMinimo = 2500;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal; //casting
		
		int numero = 5;
		
		numero = 10;
		
		System.out.println(numero);
		
		
		final double VALOR_DE_PI = 3.14; //final define que a variavel se torna uma constante, por convencao o nome dela é em caixa alta.
		
		VALOR_DE_PI = 10;
	}

}
