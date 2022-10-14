import java.util.Scanner;

/*

Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”

*/

/**
* Programa Imprimir Nombre
* @author Informatorio 2022 - Etapa 3
* @version 1.0
* @see Referencias
*/ 

public class ImprimirNombre
{
    @SuppressWarnings("resource")
	public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    System.out.print("Introduzca nombre: ");
    
    String nombre = leer.nextLine();
    
    System.out.println("HOLA " + nombre + "!!!");
    
    }

}