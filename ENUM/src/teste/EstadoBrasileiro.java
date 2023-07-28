package teste;

public enum EstadoBrasileiro {
	SAO_PAULO("SP","Sao Paulo"),
	MINAS_GERAIS("MG","Minas Gerais"),
	PARANA("PR","Parana"),
	SANTA_CATARINA("SC","Santa Catarina"),
	RIO_GRANDE_DO_SUL("RS","Rio Grande do Sul")
	;
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
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
