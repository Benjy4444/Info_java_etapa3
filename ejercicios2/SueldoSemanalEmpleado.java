/*  Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen 
 * de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y 
 * luego imprimir el total final a cobrar. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SueldoSemanalEmpleado {
	
	public static void main(String[] args) {
		
	List<Integer> horas_trabajadas_dias = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
	
	List<Integer> valor_por_hora = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500));

	List<Integer> total_por_dias = new ArrayList<>();
	
	for (int contador =1; contador<=horas_trabajadas_dias.size();contador++) {
		
			int total_dia = horas_trabajadas_dias.get(contador-1)*valor_por_hora.get(contador-1);
			
			total_por_dias.add(total_dia);
	}

	System.out.println("Horas trabajadas por día de la semana: " + horas_trabajadas_dias);
	
	System.out.println("Pago por hora por día de la semana: " + valor_por_hora);
	
	System.out.println("Pago por días de la semana: " + total_por_dias);
	
	 int suma = total_por_dias.stream().mapToInt(Integer::intValue).sum();;
	
	System.out.println("Pago total por semana: " + suma);
	
	}
	
}


