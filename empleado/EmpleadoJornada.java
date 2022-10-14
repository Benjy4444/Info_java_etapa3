public class EmpleadoJornada extends Empleado {
 
    private int pago_hora;
    private int horas_trabajadas;

    public EmpleadoJornada (int dni, String nombre, String apellido, int pago_hora, int horas_trabajadas){
        super(dni, nombre, apellido);
        this.pago_hora = pago_hora;
        this.horas_trabajadas = horas_trabajadas;
    }

    @Override
    public int calcularSueldo(){
        return (this.pago_hora*this.horas_trabajadas);
    }
}    

