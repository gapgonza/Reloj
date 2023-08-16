
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Reloj {

    private String dia;
    private String hora;
    private String modelo;
    private long numSerie;

    public Reloj(String dia, String hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
//En este metodo y el siguiente, se usa un parse de fecha/hora
    public void incrementarDia() {
        //DD/MM/AAA
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
             ////Convertimos la fecha almacenada en el atributo dia a un objeto Date
            Date date = sdf.parse(dia);
            //se crea un objeto de tipo calendar y establecemos su tiempo al objeto Date
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            //Incrementa la fecha en un dia
            calendar.add(Calendar.DATE, 1);
            //Y actualizamos el valor del atributo dia con la nueva fecha
            dia = sdf.format(calendar.getTime());
        } catch (ParseException e) {
            //Esta excepcion, maneja en caso de que la fecha no pueda ser parseada
            e.printStackTrace();
        }
    }
//El metodo siguiente, sigue la linea de docuemntacion anterior, solo con cambios de Dia por Hora
    public void incrementarHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date date = sdf.parse(hora);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            hora = sdf.format(calendar.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void limpiarPantalla() {
        System.out.println("Bienvenido nuevamente");
    }
}
