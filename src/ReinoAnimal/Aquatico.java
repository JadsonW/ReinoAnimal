package ReinoAnimal;

public class Aquatico extends Animal{

	String tipoAgua;//atributo que especifica o tipo de agua que o animal vive
	boolean possuiEscama; //atributo que especifica se o animal possui escama
	
	public Aquatico(String especie, String sexo, String dtNascimento, String tipoAgua,
			boolean possuiEscama) {
		super(especie, sexo, dtNascimento, getContador());
		this.tipoAgua = tipoAgua;
		this.possuiEscama = possuiEscama;
	}//construtor da classe
	
	public String getTipoAgua() {
		return tipoAgua;
	}//metodo getTipoAgua, retorna o tipo da agua

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	} // metodo que adiciona o tipo da agua

	public boolean isPossuiEscama() {
		return possuiEscama;
	} //metodo que retorna se o animal possui escama

	public void setPossuiEscama(boolean possuiEscama) {
		this.possuiEscama = possuiEscama;
	}//metodo que adiciona se o animal possui escama ou nao

	public String nadar() {
		return "Esta nadando";
	}// metodo que informa que o aquatico esta nadando
	
	public String comendo() {
		return "O aquatico esta comendo";
	}//metodo que informa que o aquatico esta comendo

	public void perfil() {
		System.out.println("Especie: " + getEspecie());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de nascimento: " + getDtNascimento());
		System.out.println("Tipo da agua do seu habitat: " + getTipoAgua());
		System.out.println("Possui escama: " + isPossuiEscama());
	}//metodo que informa as caracteristicas do aquatico

	
}
