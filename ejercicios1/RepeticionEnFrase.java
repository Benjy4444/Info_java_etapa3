import java.util.Scanner;

/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una 
letra dada.
*/

public class RepeticionEnFrase {
	
    public static void main(String[] args) {
    	
    	Scanner leer = new Scanner(System.in);
    	
        System.out.print("Introduzca una frase: ");
        String cadena = leer.nextLine();
        
        System.out.print("Introduzca letra a contar: ");
        char letra = leer.next().charAt(0);

        int totalrepeticiones = 0;
        
        for (int i = 0; i < cadena.length(); i++) {

        	char temp = cadena.charAt(i);
        	
            if (letra == temp) {
                totalrepeticiones++;
            }

        }
        
        System.out.println("La letra " + letra +" aparece " + totalrepeticiones +
        		" veces en la frase ingresada.");
    }
}