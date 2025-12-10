package regio.dev.generics;

public class TesteResponse {

	public static void main(String[] args) {
		
		
		Response<Produto> response1 = new Response<Produto>(new Produto("Feijão"), "Salvo com sucesso");
		Response<Pessoa> response2 = new Response<Pessoa>(new Pessoa("Alex", 38), "Salvo com sucesso");
		
		System.out.println("Resposta 1: " + response1.getData().getNome() + ", msg: " + response1.getMessage());
		
		System.out.println("Resposta Pessoa 2: " + response2.getData().getNome());
		System.out.println("Resposta Pesssoa 2: " + response2.getData().getIdade());
		
		

	}

}
