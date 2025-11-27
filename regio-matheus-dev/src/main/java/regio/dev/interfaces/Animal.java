package regio.dev.interfaces;

public interface Animal {

	void emitorSom();

	default void dormir() {
		System.out.println("ZZZ....");
	}

}
