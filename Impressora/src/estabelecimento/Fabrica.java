package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.Multifuncional;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.copiadora.Copiadora;


public class Fabrica {
	public static void main(String[] args) {
		Multifuncional mu = new Multifuncional();
		
		Impressora impressora = mu;
		Digitalizadora digitalizadora = mu;
		Copiadora copiadora = mu;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		}

}
