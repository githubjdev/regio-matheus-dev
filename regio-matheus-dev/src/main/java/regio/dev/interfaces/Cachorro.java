package regio.dev.interfaces;

public class Cachorro implements Animal {

	@Override
	public void emitorSom() {
		System.out.println("Au au");
	}
	
	@Override
	public void dormir() {
	   System.out.println("cachorro está dormindo na cazinha");
	}
	

}
