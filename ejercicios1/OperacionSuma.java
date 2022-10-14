/*
* Este programa suma dos números y muestra el resutlado en la consola utilizando el método System.out.println()
*/

/**
* Programa Suma
* @author Informatorio 2022 - Etapa 3
* @version 1.0
* @see Referencias
*/ 

import java.util.Scanner;

public class OperacionSuma {

    static int Suma (int num1, int num2){

        int resultado;
        
        resultado = num1 + num2;

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
                
        System.out.println("El resultado de la suma es " + Suma(num1,num2));

    }
} 
   