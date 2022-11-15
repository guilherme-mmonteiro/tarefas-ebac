/**
 * 
 */
package MOD7;

/**
 * @author guilherme-mmonteiro
 *
 */
public class Mouse {
	
	private String cor;
	
	private String marca;
	
	private String modelo;
	
	/*
	 *  String inutilizada uma vez que o setCor da classe ClasseMouse nos traz o parametro da cor
	 * 
	public String getCor("preto");
	*/
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
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	
	}
	
}
