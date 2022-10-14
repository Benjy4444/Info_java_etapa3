/* Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva 
 * un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número 
 * es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo 
 * de ambos colocara “FizzBuzz”. 
 * Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué 
 * valor debe frenar (no se incluye en el cálculo) 
 * Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzFuncion{
	
	
	 static List<String> FizzBuzz (int num1, int num2){

	        List<String> resultado = new ArrayList<>();
	        
	        for (int i = num1; i < num2; i++) {
				
	        	if (i%2==0 && i%3==0) {
					
	        		resultado.add("FizzBuzz");
	        		
				} 
	        	else if (i%2==0) {
					
	        		resultado.add("Fizz");

					
				}
	        	else if (i%3==0) {
					
	        		resultado.add("Buzz");
	        
				}
	        	
	        	else {
					
					resultado.add(String.valueOf(i));
				}

			}
	        	
			return resultado;
	    }

	       
	    public static void main (String[] args) {
	   
	        int num1;
	        int num2;

	        @SuppressWarnings("resource")
			Scanner leer = new Scanner(System.in);
	        System.out.print("Introduzca un número: ");
	        num1 = leer.nextInt();
	        System.out.print("Introduzca otro número: ");
	        num2 = leer.nextInt();
	                
	        System.out.println("El resultado es " + FizzBuzz(num1,num2));

	    }
	
		
}

