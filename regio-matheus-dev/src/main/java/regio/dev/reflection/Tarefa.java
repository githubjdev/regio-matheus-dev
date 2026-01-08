package regio.dev.reflection;

public class Tarefa {

	@Executar
	public void rodar() {
		System.out.println("Tarefa executada");
	}

	@Delete
	public void deletar() {
		System.out.println("Deletando dados");
	}

}
