package regio.dev.reflection;

import java.lang.reflect.Field;

public class Usuario {

	public String nome;
	public int idade;
	
	
	
	public UsuarioDTO toUsuarioDto() throws Exception {

		UsuarioDTO usuario = new UsuarioDTO();

		for (Field f : getClass().getDeclaredFields()) {

			for (Field u : usuario.getClass().getDeclaredFields()) {

				if (u.getName().equals(f.getName())) {
					u.set(usuario, f.get(this));
				}
			}

		}

		return usuario;

	}

}
