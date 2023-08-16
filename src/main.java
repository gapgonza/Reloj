public class main {

    public static void main(String[] args) {
        Reloj reloj = new Reloj("Lunes", "10:00", "Modelo X", 12345);
      Persona persona = new Persona("Juan", "Pérez", 30, 1.75, reloj);
      persona.decirHora();
    }
}
