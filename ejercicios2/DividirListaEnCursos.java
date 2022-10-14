/* Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos 
 * (3 arrayList) e imprimir dichos cursos. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DividirListaEnCursos {
	
	public static void main(String[] args) {
		
	List<String> nombres = new ArrayList<>();
	
	List<String> curso1 = new ArrayList<>();
	List<String> curso2 = new ArrayList<>();
	List<String> curso3 = new ArrayList<>();
	
	
		for (int contador =1; contador<=12;contador++) {
			
			Scanner leer = new Scanner(System.in);
	        System.out.println("Introduzca nombre alumno: ");
	        String nombre = leer.nextLine();
	        nombres.add(nombre);
			
		}

		System.out.println("Nombres en la lista: " + nombres);
		
		
		curso1 = new ArrayList(nombres.subList(0, 4));
	    curso2 = new ArrayList(nombres.subList(4, 8));
	    curso3 = new ArrayList(nombres.subList(8,12));

		System.out.println("Curso 1: " + curso1);
		System.out.println("Curso 2: " + curso2);
		System.out.println("Curso 3: " + curso3);
					    
	}
	
}


