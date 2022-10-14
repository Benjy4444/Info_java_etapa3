/*
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/

import java.util.Scanner;

public class EntradaPersona {

    private String nombreyapellido;
    private int edad;
    private String direccion;
    private String ciudad;
    
    /* Constuctor por defecto */
    public EntradaPersona (){
        this("", 0, "", "");
    }

    /* Constuctor con parámetros */
    public EntradaPersona (String nombreyapellido, int edad, String direccion, String ciudad){
        this.nombreyapellido = nombreyapellido;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }   

    @Override
    public String toString(){
        return ("Ciudad: " + this.ciudad + " - " +"Dirección: " +
        		this.direccion) + " - " + ("Edad: " + String.valueOf(this.edad)) + " - " +
                ("Nombre y apellido: " + this.nombreyapellido);
     }

        public static void main(String[] args) {
                  
        	Scanner leer = new Scanner(System.in);
        	Scanner leer2 = new Scanner(System.in);

            System.out.print("Introduzca nombre y apellido: ");
            String nombreyapellido = leer.nextLine();
            
            System.out.print("Introduzca edad: ");
            int edad = leer.nextInt();
          
            System.out.print("Introduzca dirección: ");
            String direccion =  leer2.nextLine();
            
            System.out.print("Introduzca ciudad: ");
            String ciudad =  leer2.nextLine();
            
            EntradaPersona persona1 = new EntradaPersona(nombreyapellido, edad, direccion, ciudad);
            
            System.out.println(persona1.toString());
               
    }

}


