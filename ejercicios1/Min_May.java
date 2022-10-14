/*
Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo 
a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase
*/

import java.util.Scanner;

public class Min_May {

    static String MinusMayus (String frase){
    	
    	String fraseMayus = frase;
    	 	
    	fraseMayus = fraseMayus.replace("a", "A");
    	fraseMayus = fraseMayus.replace("b", "B");
    	fraseMayus = fraseMayus.replace("c", "C");
    	fraseMayus = fraseMayus.replace("d", "D");
    	
    	fraseMayus = fraseMayus.replace("e", "E");
    	fraseMayus = fraseMayus.replace("f", "F");
    	fraseMayus = fraseMayus.replace("g", "G");
    	fraseMayus = fraseMayus.replace("h", "H");
    	
    	fraseMayus = fraseMayus.replace("i", "I");
    	fraseMayus = fraseMayus.replace("j", "J");
    	fraseMayus = fraseMayus.replace("k", "K");
    	fraseMayus = fraseMayus.replace("l", "L");
    	
    	fraseMayus = fraseMayus.replace("m", "M");
    	fraseMayus = fraseMayus.replace("n", "N");
    	fraseMayus = fraseMayus.replace("ñ", "Ñ");
    	fraseMayus = fraseMayus.replace("o", "O");
    	
    	fraseMayus = fraseMayus.replace("p", "P");
    	fraseMayus = fraseMayus.replace("q", "Q");
    	fraseMayus = fraseMayus.replace("r", "R");
    	fraseMayus = fraseMayus.replace("s", "S");
    	
    	fraseMayus = fraseMayus.replace("t", "T");
    	fraseMayus = fraseMayus.replace("u", "U");
    	fraseMayus = fraseMayus.replace("v", "V");
    	fraseMayus = fraseMayus.replace("w", "W");
    	
    	fraseMayus = fraseMayus.replace("x", "X");
    	fraseMayus = fraseMayus.replace("y", "Y");
    	fraseMayus = fraseMayus.replace("z", "Z");    		
    	 
		return fraseMayus;
    }

       
    public static void main (String[] args) {
      
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca una cadena en minúsculas: ");
        String cadena = leer.nextLine();
             
               
        String cadenaMayus = MinusMayus(cadena);
        System.out.println(cadenaMayus);
    }
}