package regio.dev.interfaces;

public class Teste {

	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();
		
		Zoologico zoologico = new Zoologico();
		zoologico.interagirComAnimal(cachorro);
		zoologico.interagirComAnimal(gato);

	}

}
