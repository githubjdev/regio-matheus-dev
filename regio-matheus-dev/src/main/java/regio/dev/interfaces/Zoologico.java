package regio.dev.interfaces;

public class Zoologico {
	
	public void interagirComAnimal(Animal animal) {
		
		System.out.println("-------------------------");
		animal.emitorSom();
		animal.dormir();
	}

}
