package regio.dev.exception;

public class App1 {

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());

		int divisao = 10 / 0;
		System.out.println("Valor da divisão: " + divisao);

	}

}
