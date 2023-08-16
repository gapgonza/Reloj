public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private Reloj reloj;

    public Persona(String nombre, String apellido, int edad, double altura, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }
//Establecemos que la persona come
    public void comer() {
        System.out.println(nombre+" esta comiendo");
    }
//Establecemos que la persona habla
    public void hablar() {
        System.out.println(nombre+" esta hablando");
    }

    public int getEdad() {
        return edad;
    }
//Debe decir la hora
    public void decirHora() {
        System.out.println("La hora es: " + reloj.getHora());
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
