

/*
* Este programa lee los nombres por linea de un archivo de texto y los imprimer por pantalla con el método System.out.println()
*/

/**
* Programa Factorial
* @author Informatorio 2022 - Etapa 3
* @version 1.0
* @see Referencias
*/ 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNombres
{
    @SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException  {

        File doc = new File("C:\\Info_2022_etapa_3\\alumnos.txt");
 
        Scanner obj = new Scanner(doc);
        
        while (obj.hasNextLine())
            System.out.println(obj.nextLine());
        }
}

