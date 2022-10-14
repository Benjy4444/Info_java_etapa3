/*
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
*/

import java.util.Scanner;

public class OperacionFactorial {

    static int Factorial (int num1){

        int resultado = 1;
        
        for (int contador=1; contador<=num1; contador++) {
        
        	resultado =  resultado * contador;
       
        }
        
		return resultado;
    }

       
    public static void main (String[] args) {
   
        int num1;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        num1 = leer.nextInt();
                                      
        System.out.println("El factorial del número es: " + Factorial(num1));

    }
}
