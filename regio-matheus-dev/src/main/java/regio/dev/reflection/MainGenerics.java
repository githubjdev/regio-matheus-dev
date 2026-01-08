package regio.dev.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainGenerics {
	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		
		/*Repository, Service, Controler*/
		Tarefa tarefa = new Tarefa();
		
		for(Method metodo : tarefa.getClass().getDeclaredMethods()) {
			if (metodo.isAnnotationPresent(Executar.class)) {
				metodo.invoke(tarefa);
			}
			
			if (metodo.isAnnotationPresent(Delete.class)) {
				metodo.invoke(tarefa);
			}
		}
	}

}
