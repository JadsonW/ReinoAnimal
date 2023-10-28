package ReinoAnimal;

public class Terrestre extends Animal{
	
	String regiao; //Atributo referente a regiao onde o animal vive
	boolean possuiPelo; //Atributo que veirifca se o animakl possui pelo

	public Terrestre(String especie, String sexo, String dtNascimento, String regiao,
			boolean possuiPelo) {
		super(especie, sexo, dtNascimento, getContador());
		this.regiao = regiao;
		this.possuiPelo = possuiPelo;
	}//contrutor da class

	public String getRegiao() {
		return regiao;
	}//metodo que retorna a regiao onde o animal vive

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}//metodo que adiciona a regiao ao atributo

	public boolean isPossuiPelo() {
		return possuiPelo;
	}//metodo que retorna se o animal possui pelo

	public void setPossuiPelo(boolean possuiPelo) {
		this.possuiPelo = possuiPelo;
	}//metodo que adiciona se o animal possui pelo
	
	public String comer() {
		return "o animal terrestre esta comendo";
	}// metodo q informa que o animal terrestre esta comendo
	
	public void perfil() {
		System.out.println("Especie: " + getEspecie());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de nascimento: " + getDtNascimento());
		System.out.println("Região onde vive: " + getRegiao());
		System.out.println("Possui pelo: " + isPossuiPelo());
	}//metodo que mostra o perfil as caracteristicas do animal
	
	
	
}
