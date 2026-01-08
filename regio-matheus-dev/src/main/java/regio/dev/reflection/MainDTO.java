package regio.dev.reflection;

public class MainDTO {

	public static void main(String[] args) throws Exception {

		UsuarioDTO dtoUser = new UsuarioDTO();
		dtoUser.idade = 38;
		dtoUser.nome = "Alex";

		Usuario usuario = dtoUser.toUsuario();

		System.out.println(usuario.nome);
		System.out.println(usuario.idade);
		
		
		System.out.println("=====================================================");
		
		Usuario user2 = new Usuario();
		user2.idade = 55;
		user2.nome = "João";
		
		UsuarioDTO dto2 = user2.toUsuarioDto();
		System.out.println(dto2.nome);
		System.out.println(dto2.idade);

	}

}
