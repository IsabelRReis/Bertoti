public class Cliente {
	
	private String nome;
	private String codigoDeProtocolo;
	private Roupas roup;
	
	public Cliente(String nome, String codigoDeProtocolo, Roupas roup) {
		super();
		this.nome = nome;
		this.codigoDeProtocolo = codigoDeProtocolo;
		this.roup = roup;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigoDeProtocolo() {
		return codigoDeProtocolo;
	}
	
	public void setCodigoDeProtocolo(String codigoDeProtocolo) {
		this.codigoDeProtocolo = codigoDeProtocolo;
	}
	
	public Roupas getRoup() {
		return roup;
	}
	
	public void setRoup(Roupas roup) {
		this.roup = roup;
	}
	
}
	

