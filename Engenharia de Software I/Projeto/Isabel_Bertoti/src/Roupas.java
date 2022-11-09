public class Roupas {

	private String tamanho;
	private String cor;
	private String marca;
	
	public Roupas(String tamanho, String cor, String marca) {
		super();
		this.tamanho = tamanho;
		this.cor = cor;
		this.marca = marca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean comparar (Roupas roupas) {
		if(tamanho.equals(roupas.tamanho) && cor.equals(roupas.cor) && marca.equals(roupas.marca) ) {
			return true;
		}else {
			return false;
		}
	}
}
