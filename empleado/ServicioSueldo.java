public class ServicioSueldo {
    
    public static void main(String[] args) {
        
        Empleado emp1 = new EmpleadoEfectivo(1234, "Pedro", "Gomez",40000, 2);

        Empleado emp2 = new EmpleadoJornada(2345, "Javier", "Perez", 145, 37);  

        Empleado emp3 = new EmpleadoContratado(2345, "Javier", "Perez", 35000);  

        System.out.println(emp1.toString());
        System.out.println(emp1.calcularSueldo());

        System.out.println(emp2.toString());
        System.out.println(emp2.calcularSueldo());

        System.out.println(emp3.toString());
        System.out.println(emp3.calcularSueldo());

    }
}

