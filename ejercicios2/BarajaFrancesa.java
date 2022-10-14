/* Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
 * (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir 
 * en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BarajaFrancesa{
	
	public static void main(String[] args) {
		
	List<Integer> cartas = new ArrayList<>();
	
		for (int contador =1; contador<=13;contador++) {
			
			cartas.add(contador);
			
		}

		System.out.println("Números de cartas en la lista");
		
		for (int contador = 1; contador<=cartas.size(); contador++) {
			
			int carta  = cartas.get(contador-1);
			
			System.out.println(carta);
				
		}
	
		Collections.reverse(cartas);
			 
		System.out.println("Números de cartas en la lista en orden inverso");
			
		for (int contador = 1; contador<=cartas.size(); contador++) {
			
			int carta  = cartas.get(contador-1);
			
			System.out.println(carta);
				
		}

	
		Collections.shuffle(cartas);
	
	 
		System.out.println("Números de cartas desordenados en la lista");
		
		for (int contador = 1; contador<=cartas.size(); contador++) {
			
			int carta  = cartas.get(contador-1);
			
			System.out.println(carta);
				
		}

		    
	}
	
}

