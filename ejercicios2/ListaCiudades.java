/* Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
 luego imprimir por pantalla el ranking */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaCiudades{
	
	public static void main(String[] args) {
		
	List<String> ciudades = new ArrayList<>();
	
	for (int contador =1; contador<=5;contador++) {
		
		Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca ciudad favorita "+ contador + ": ");
        String ciudad = leer.nextLine();
        ciudades.add(ciudad);
		
	}

	System.out.println("Lista de ciudades preferidas de Argentina");
	
	int contador = 1;
	
	for (Iterator<String> iterator = ciudades.iterator(); iterator.hasNext();) {
		
		String ciudad = (String) iterator.next();
		System.out.println("#"+ contador + " " + ciudad);
		contador++;
		
	}
	
}
	
}