import java.util.Scanner;

public class Persona {

    /*Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. 
    No queremos que se acceda directamente a ellos. Piensa que modificador de acceso es el más adecuado, 
    también su tipo. Si quieres añadir algún atributo puedes hacerlo.
    Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo 
    (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello. */

    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    /* Se implantaran varios constructores:
    Un constructor por defecto.
    Un constructor con el nombre, edad y sexo, el resto por defecto.
    Un constructor con todos los atributos como parámetro. */

    /* Constuctor por defecto */
    public Persona (){
        this("", 0, 0, 'H', 0, 0);
    }

    /* Constructor con nombre, edad y sexo, el resto por defecto */
    public Persona (String nombre, int edad, char sexo){
        this(nombre, edad, 0, sexo, 0, 0);
    }

    /* Constuctor con parámetros */
    public Persona (String nombre, int edad, int dni, char sexo, float peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }   

    /* Los métodos que se implementarán son:
    *** calcularIMC(): calculará si la persona está en su peso ideal (peso en kg/(altura^2  en m)), 
        si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), 
        significa que está por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor 
        mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. 
        Te recomiendo que uses constantes para devolver estos valores.
    *** esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    *** comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H. No será visible al exterior.
    *** toString(): devuelve toda la información del objeto.
    *** generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. 
        Este método será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. 
        No será visible al exterior.
    *** Métodos set de cada parámetro, excepto de DNI. */

    public int calcularIMC(){
        double pesoIdeal=(this.peso/(this.altura*this.altura));
        if (pesoIdeal<20) {
            return -1;
        }else if (pesoIdeal>25){
            return 1;
        }
        return 0;
    }

    public boolean esMayorDeEdad(){
        if (this.edad>=18) {
            return true;
        }
        return false;
    }

    public void comprobarSexo(){
        if (!(this.sexo == 'M' || this.sexo=='H')) {
            this.sexo='H';
        }        
    }
   
    @Override
    public String toString(){
        return ("Nombre: " + this.nombre)+(" - Edad: " + String.valueOf(this.edad))+
        (" - DNI: " + String.valueOf(this.dni))+(" - Sexo: " + this.sexo)+(" - Peso: " + String.valueOf(this.peso))+
        (" - Altura: " + String.valueOf(this.altura));
     }

    public int generaDNI(){
        return this.dni = (int) Math.floor(Math.random()*99999+1);    
    }

   



    public void setNombre(String nombre) {
       this.nombre = nombre;
    }
 
    public void setEdad(int edad) {
        this.edad = edad;
     }
  
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
     
    public void setPeso(float peso) {
        this.peso = peso;
     }

    public void setAltura(int altura) {
        this.altura = altura;
     }

    /* Ahora, crea una clase ejecutable que haga lo siguiente:
    Pide por teclado el nombre, la edad, sexo, peso y altura.
    Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado,
    el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, 
    para este último utiliza los métodos set para darle a los atributos un valor.
    Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
    Indicar para cada objeto si es mayor de edad.
    Por último, mostrar la información de cada objeto.
    Puedes usar métodos en la clase ejecutable, para que os sea más fácil. */

    public static void main(String[] args) {
        
        /* Persona persona1 = new Persona("Laura", 31, 0, 'M', 120, 1);
        Persona persona2 = new Persona("Pedro", 34, 'H');
        Persona persona3 = new Persona();
        Persona persona4 = new Persona("María", 60, 'M');
        persona1.generaDNI();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        System.out.println(persona4.toString());

        System.out.println(persona1.esMayorDeEdad());
        persona1.comprobarSexo();
        System.out.println(persona1.sexo);
        System.out.println(persona1.toString()); */
        String continuar = "s";
        
        while (continuar.equalsIgnoreCase("s")) {
            
            Persona persona1 = new Persona();
            @SuppressWarnings("resource")
			Scanner leer = new Scanner(System.in);

            System.out.print("Introduzca nombre: ");
            String nombre1 = leer.nextLine();
            persona1.setNombre(nombre1);

            System.out.print("Introduzca edad: ");
            int edad1 = leer.nextInt();
            persona1.setEdad(edad1);

            persona1.generaDNI();

            System.out.print("Introduzca sexo: ");
            char sexo1 =  leer.next().charAt(0);
            persona1.setSexo(sexo1);

            System.out.print("Introduzca peso: ");
            int peso1 = leer.nextInt();
            persona1.setPeso(peso1);

            System.out.print("Introduzca altura: ");
            int altura1 = leer.nextInt();
            persona1.setAltura(altura1);

            System.out.println(persona1.calcularIMC());

            System.out.println(persona1.esMayorDeEdad());

            System.out.println(persona1.toString());

            Persona persona2 = new Persona(nombre1, edad1, sexo1);

            System.out.println(persona2.calcularIMC());

            switch (persona2.calcularIMC()) {
                case -1:
                    System.out.println("La persona está baja de peso.");
                case 1:
                    System.out.println("La persona está excedida de peso.");
                case 0:
                    System.out.println("La persona está bien de peso.");
            }

            System.out.println(persona2.esMayorDeEdad());

            System.out.println(persona2.toString());

            System.out.print("Desea ingresar datos de otra persona?(s/n): ");
            continuar = leer.next();
                                                                      
        }
               
    }

}


