package veterinaria;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solicitud{
    private Solicitante solicitante;
    private Mascota mascota;
    private Encargado encargado;
    private Date fechaActual;

    public Solicitud(Solicitante solicitante, Mascota mascota, Encargado encargado) {
        this.solicitante = solicitante;
        this.mascota = mascota;
        this.encargado = encargado;
    }

    public Date getFechaActual() {
        return new Date();
    }

    public void mostrarTicket() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                 Ticket de Adopción ");
        System.out.println("-----------------------------------------------------------------");
        Date fechaActual = getFechaActual();
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy/MM/dd");
        String fechaActual1 = formato1.format(fechaActual);

        // Imprimir la fecha formateada
        System.out.println("Fecha y hora: " + fechaActual1 + "\n");


        System.out.println("Datos del Adoptante:");
        System.out.println("Nombre:" + "["  + solicitante.getNombre() + "]");
        System.out.println("Edad:" + "["  + solicitante.getEdad() + "]");
        System.out.println("Dirección:" + "["  + solicitante.getDireccion() + "]\n ");

        System.out.println("Datos de la Mascota:");
        System.out.println("Nombre:" + "["  + mascota.getNombre() + "]");

        // Obtener y formatear la fecha
        SimpleDateFormat formatoDeseado = new SimpleDateFormat("yyyy/MM/dd");
        Date fechaNacimiento = mascota.getFechaNacimiento();
        String fechaFormateada = formatoDeseado.format(fechaNacimiento);
        System.out.println("Fecha de nacimiento: " + "[" + fechaFormateada +"]");

        System.out.println("Peso:" + "[" + mascota.getPeso() +" ]");
        System.out.println("Especie:" + "["  + mascota.mostrarEspecie() + "]");
        System.out.println("Peso:" + "[" + mascota.mostrarRecomendaciones() +" ]\n ");

        System.out.println("Datos del Empleado");
        System.out.println("Nombre:" + "[" + solicitante.getNombre() +"]");

        System.out.println("-----------------------------------------------------------------");
        System.out.println("           ♥¡Gracias por adoptar a una mascota!♥                  ");
        System.out.println("-----------------------------------------------------------------");

    }
}

