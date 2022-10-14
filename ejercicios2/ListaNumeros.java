/* Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero 
 * al principio de la lista y otro al final. Por último, iterar e imprimir los 
 * elementos de la lista y el tamaño de la misma (antes y después de agregar a en 
 * la primera y última posición). */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumeros{
	
	public static void main(String[] args) {
		
	List<Integer> numeros = new ArrayList<>();
	
	for (int contador =1; contador<=5;contador++) {
		
		Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        Integer numero = leer.nextInt();
        numeros.add(numero);
		
	}

	System.out.println("Lista de números ingresados");
	
	for (int contador = 1; contador<=5; contador++) {
		
		int numero  = numeros.get(contador-1);
		
		System.out.println(numero);
			
	}
	
	System.out.println("Cantidad de elementos en la lista de números: " + numeros.size());
	
	Scanner leer = new Scanner(System.in);
    System.out.print("Introduzca un número al principio de la lista: ");
    Integer numero = leer.nextInt();
    numeros.add(0, numero);
    System.out.print("Introduzca un número al final de la lista: ");
    Integer numero2 = leer.nextInt();
    numeros.add(numeros.size(), numero2);
	
      
    for (int contador = 1; contador<=numeros.size(); contador++) {
		
		int numero3  = numeros.get(contador-1);
		
		System.out.println(numero3);
			
	}
    
    System.out.println("Cantidad de elementos en la lista de números con los agregados: " + numeros.size());
    
	}
	
}
