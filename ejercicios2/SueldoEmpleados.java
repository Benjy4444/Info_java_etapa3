/* Se dispone de una colección de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo 
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) 
donde la clave (key) es el dni y el valor (value) es el sueldo calculado.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SueldoEmpleados {
	
	public static void main(String[] args) {
		
		Set<String> nombreyapellido = new HashSet<>();
					
		List<Long> dni = new ArrayList<>();
		
		List<Integer> horasTrabajadas = new ArrayList<>();
		
		List<Integer> valorPorHora = new ArrayList<>();
		
		Map<Long, Integer> dniSueldo = new HashMap<>();
		
		String respuesta = "s";

		while (respuesta.equals("s")) {
			
			Scanner leer0 = new Scanner(System.in);
			
            System.out.print("Introduzca nombre y apellido: ");
            String nombreyapellidoEmpleado = leer0.nextLine();
            nombreyapellido.add(nombreyapellidoEmpleado);
            
			System.out.print("¿Desea continuar cargando empleados? (s/n): ");
	        respuesta =  leer0.nextLine();

		}
		
		
		String [] myArray = nombreyapellido.toArray(new String[nombreyapellido.size()]);
		
		System.out.println("Carga de datos de empleados: ");
		
		for (int posicion=0; posicion < myArray.length; posicion++) {
			
			Scanner leer = new Scanner(System.in);
        	Scanner leer2 = new Scanner(System.in);
        	
        	System.out.println("Nombre y apellido: " + myArray[posicion]);
        		
            System.out.print("Introduzca DNI: ");
            long dniEmpleado = leer.nextInt();
            dni.add(dniEmpleado);
          
            System.out.print("Horas trabajadas: ");
            int horasTrabajadasEmpleado =  leer.nextInt();
            horasTrabajadas.add(horasTrabajadasEmpleado);
            
            System.out.print("Valor por hora: ");
            int valorPorHoraEmpleado =  leer.nextInt();
            valorPorHora.add(valorPorHoraEmpleado);

            int sueldoempleado = horasTrabajadas.get(posicion)*valorPorHora.get(posicion);
			
			dniSueldo.put(Long.valueOf(dniEmpleado), sueldoempleado);		
					
		}
		
		System.out.println("DNI y sueldo correspondiente: " + dniSueldo);		

	}
	
}



