public class EmpleadoContratado extends Empleado {

    private int pago_mensual_contrato;
    
    public EmpleadoContratado (int dni, String nombre, String apellido, int pago_mensual_contrato){
        super(dni, nombre, apellido);
        this.pago_mensual_contrato = pago_mensual_contrato;
    }

    @Override
    public int calcularSueldo(){
        return (this.pago_mensual_contrato);
    }
}
