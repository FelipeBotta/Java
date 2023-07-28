package teste;

public enum EstadoBrasileiro {
	SAO_PAULO("SP","Sao Paulo", 11),
	MINAS_GERAIS("MG","Minas Gerais", 35),
	PARANA("PR","Parana", 41),
	SANTA_CATARINA("SC","Santa Catarina", 53),
	RIO_GRANDE_DO_SUL("RS","Rio Grande do Sul", 24)
	;
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	
	public int getIbge() {
		return ibge;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	

}
