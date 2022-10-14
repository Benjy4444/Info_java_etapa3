package empleado;

public abstract class Empleado {

    private int dni;
    private String nombre;
    private String apellido;

    public Empleado(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public abstract int calcularSueldo();
        
    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    public String getNombre() {
       return nombre;
    }

    @Override
    public String toString() {
            return String.valueOf(this.dni) + " - " + this.nombre + " " + this.apellido;
    }
       
}