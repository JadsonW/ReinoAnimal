package ReinoAnimal;

public class Animal {
	String especie; //Atributo especie
	String sexo; //Atributo sexo
	String dtNascimento; //Atributo data de nascimento
	private static int contador; //Atributo contador(informa o total de animais, a partir de um incremento ao instanciamento
	
	public Animal(String especie, String sexo, String dtNascimento, int contador) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
		this.contador = contador;
		setContador(contador+1);
	}// construtor da classe
	
	
	public String getEspecie() {
		return especie;
	} //Metodo getEspecie, retorna a especie do animal
	public void setEspecie(String especie) {
		this.especie = especie;
	}//Metodo setEspecie, adiciona uma especie do animal
	public String getSexo() {
		return sexo;
	}//Metodo getSexo, retorna o sexo do animal
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}//Metodo setSexo, adiciona um sexo no animal
	public String getDtNascimento() {
		return dtNascimento;
	}// Metodo getDtNascimento, retorna a data de nascimento do animal
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}//Metodo setDtNascimento, adiciona a data de nascimento no animal
	public static int getContador() {
		return contador;
	}//Metodo getContador, retorna a qunatidade de animais
	private void setContador(int contador) {
		this.contador = contador;
	}//Metodo setContador, adiciona um animal
	
	public String comer() {
		return "o animal esta comendo";
	}// metodo q informa que o animal esta comendo
	
	public void perfil() {
		System.out.println("Especie: " + getEspecie());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de nascimento: " + getDtNascimento());
	}//metodo que mostra o perfil as caracteristicas do animal
	
}
