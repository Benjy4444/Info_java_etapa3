import java.util.HashMap;
import java.util.Map;

public class HashMapEjemplos {
	
	public static void main(String[] args) {
		
		//Inicializar HashMaps (Ejemplo de Constructores)
		Map<Integer, String> dnis = new HashMap<Integer, String>(); //clave (Integer) y valores (String)
		Map<String, String> personajesShow = new HashMap<>(); //clave (String) y valores (String)
		
		// Operaciones de Insercion
		dnis.put(2131231312, "Homero Simpson");
		dnis.put(987654321, "Bart Simpson");
		personajesShow.put("Sr. Calamardo", "Bob Esponja");
		personajesShow.put("Bob Esponja", "Bob Esponja");
		personajesShow.put("Patricio", "Bob Esponja");
		personajesShow.put("Patricio", "Bob Esponja - Temporada 2"); //agregamos una clave repetida para comprobar luego el size()
		System.out.println("Elementos en la Lista dnis: " + dnis.size());
		System.out.println("Elementos en la Lista nombres: " + personajesShow.size());
		System.out.println(dnis.size() == personajesShow.size()); //Preguntamos si ambas maps tienen la misma cantidad de elementos
		
		//Operaciones de Acceso
		System.out.println(personajesShow.get("Bob Esponja")); //Buscamos por clave, nos devuelve valor
		
		//Operaciones de Eliminar
		personajesShow.remove("Patricio");
		System.out.println("Elementos en la Lista: " + personajesShow.size()); //Comparar el tamaño luego de remover
		
	}
	
}