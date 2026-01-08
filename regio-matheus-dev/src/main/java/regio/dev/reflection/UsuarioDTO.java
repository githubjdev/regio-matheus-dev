package regio.dev.reflection;

import java.lang.reflect.Field;

public class UsuarioDTO {

	public String nome;
	public int idade;

	public Usuario toUsuario() throws Exception {

		Usuario usuario = new Usuario();

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
