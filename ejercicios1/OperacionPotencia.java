/*
Se desea una aplicación que solicite 2 números enteros 
y realice la operación de potencia (sin uso de librerías).
*/

import java.util.Scanner;

public class OperacionPotencia {

    static int Potencia (int num1, int num2){

        int resultado = 1;
        
        for (int contador=1; contador<=num2; contador++) {
        
        	resultado =  resultado * num1;
       
        }
        
		return resultado;
    }

       
    public static void main (String[] args) {
   
        int num1;
        int num2;

        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduzca la base de la potencia: ");
        num1 = leer.nextInt();
        
        System.out.print("Introduzca el exponente: ");
        num2 = leer.nextInt();
                              
        System.out.println("El resultado de la potencia es: " + Potencia(num1,num2));

    }

}