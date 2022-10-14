import java.util.Scanner;

/*
Confeccionar un programa que dado un número entero como dato de entrada imprima la 
secuencia de números (incrementos de 1) de la siguiente forma:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

/**
* Programa Lista Números
* @author Informatorio 2022 - Etapa 3
* @version 1.0
* @see Referencias
*/ 

public class ListaNumeros
{
    @SuppressWarnings("resource")
	public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    
    int numero = leer.nextInt();
    
    for (int contador=1;contador<=numero; contador++) {
    	    		
    	for (int contador2=1; contador2<=contador; contador2++) {
    		if (contador2==1){
    			System.out.println();
    		}
    		System.out.print(contador2);
    		
    	}	
    }
    
    }

}
