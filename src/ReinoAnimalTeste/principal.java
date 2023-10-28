package ReinoAnimalTeste;

import ReinoAnimal.Terrestre;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Aereo;

public class principal {

	public static void main(String[] args) {
		//instancia dos animais terrestres
		Terrestre felisCatus = new Terrestre("Felis catus", "fêmea", "2", "Asia", true);
		Terrestre Hydrochoerus = new Terrestre("Hydrochoerus hydrochaeris", "macho",
												"8", "America do sul", true);
		
		//instancia dos animais aquaticos
		Aquatico taurus = new Aquatico("Carcharias taurus", "fêmea", "7", "agua salgada", false);
		Aquatico natterer = new Aquatico("Pygocentrus nattereri", "macho", "3", "agua doce", true);
		
		//instancia dos animais aereos
		Aereo atratus = new Aereo("Coragyps atratus", "macho", "3", 54.5);
		Aereo Amazona = new Aereo("Amazona aestiva", "fêmea", "10", 37.9);
		
		System.out.println("Quantidade de animais adicionados: " + felisCatus.getContador());
	}

}
