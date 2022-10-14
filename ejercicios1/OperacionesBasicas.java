/*
Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado 
de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.
*/

/**
* Programa Operaciones Básicas
* @author Informatorio 2022 - Etapa 3
* @version 1.0
* @see Referencias
*/ 

import java.util.Scanner;

public class OperacionesBasicas {

    static double Suma (double num1, double num2){

        double resultado;
        
        resultado = num1 + num2;

        return resultado;
    }
    
    static double Resta (double num1, double num2){

        double resultado;
        
        resultado = num1 - num2;

        return resultado;
    }
    
    static double Multiplicacion (double num1, double num2){

        double resultado;
        
        resultado = num1 * num2;

        return resultado;
    }
    
    static double Division (double num1, double num2){

        double resultado;
        
        resultado = num1 / num2;

        return resultado;
    }


    static double Modulo (double num1, double num2){

        double resultado;
        
        resultado = num1 % num2;

        return resultado;
    }

       
    public static void main (String[] args) {
   
        double num1;
        double num2;

        @SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num1 = leer.nextInt();
        System.out.print("Introduzca otro número: ");
        num2 = leer.nextInt();
                
        System.out.println("El resultado de la suma es " + Suma(num1,num2));
        System.out.println("El resultado de la resta es " + Resta(num1,num2));
        System.out.println("El resultado de la multiplicación es " + Multiplicacion(num1,num2));
        System.out.println("El resultado de la división es " + Division(num1,num2));
        System.out.println("El resultado del módulo es " + Modulo(num1,num2));
    }
} 
   