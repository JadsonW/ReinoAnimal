package ReinoAnimal;
public class Aereo extends Animal{

	double altitudePossivel;//Atributo referente a altitude maxima de voo
	
	public Aereo(String especie, String sexo, String dtNascimento, int contador, double altitudePossivel) {
		super(especie, sexo, dtNascimento, contador);
		this.altitudePossivel = altitudePossivel;
	}//construtor da class

	public double getAltitudePossivel() {
		return altitudePossivel;
	}//metodo que retorna a altitude maxima do animal

	public void setAltitudePossivel(double altitudePossivel) {
		this.altitudePossivel = altitudePossivel;
	}//metodo que adiciona a altitude maxima do animal
	
	public String comer() {
		return "o animal aereo esta comendo";
	}// metodo q informa que o animal aereo esta comendo
	
	public void perfil() {
		System.out.println("Especie: " + getEspecie());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de nascimento: " + getDtNascimento());
		System.out.println("Altitude maxima: " + getAltitudePossivel());
	}//metodo que mostra o perfil as caracteristicas do animal
	
	
	
}
