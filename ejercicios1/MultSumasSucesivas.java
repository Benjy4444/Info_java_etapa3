/* 
Se desea una aplicación que solicite 2 números enteros y realice la operación de 
multiplicación por sumas sucesivas (sin uso de librerías).
*/

import java.util.Scanner;

public class MultSumasSucesivas {

    static int Producto (int num1, int num2){

        int resultado = 0;
        
        for (int contador=1; contador<=num1; contador++) {
        
        	resultado =  resultado + num2;
       
        }
        
		return resultado;
    }

       
    public static void main (String[] args) {
   
        int num1;
        int num2;

        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduzca el primer factor: ");
        num1 = leer.nextInt();
        
        System.out.print("Introduzca el segundo factor: ");
        num2 = leer.nextInt();
                              
        System.out.println("El resultado del producto por sumas sucesivas es: " + Producto(num1,num2));

    }
}