import veterinaria.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************************************");
        System.out.println("            Veterinaria Rabitos               ");
        System.out.println("**********************************************");
        Scanner scanner = new Scanner(System.in);

        // Datos del encargado
        System.out.println(">Por favor, ingrese nombre del encargado:");
        String nombreEncargado = scanner.nextLine();
        Encargado encargado = Encargado.getInstancia();

        // Datos del solicitante
        System.out.println(">Por favor, rellene el formulario con los datos del solicitante:");
        System.out.println("\nIngrese el nombre completo: ");
        String nombreSolicitante = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edadSolicitante = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la dirección: ");
        String direccionSolicitante = scanner.nextLine();

        Solicitante solicitante = new Solicitante(nombreSolicitante, edadSolicitante, direccionSolicitante);

        // Datos de la mascota
        System.out.println(">Complete los datos de la mascota:");
        System.out.println("\nIngrese el nombre de la mascota: ");
        String nombreMascota = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento de la mascota (formato: yyyy-MM-dd): ");
        String ingresoFechaNacimiento = scanner.nextLine();
        Date fechaNacimiento;

        // Validación de ingreso de fecha
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            fechaNacimiento = sdf.parse(ingresoFechaNacimiento);
        } catch (ParseException e) {
            System.out.println("La fecha no es válida, se asignará la del día de hoy.");
            fechaNacimiento = new Date();
        }

        // Cambia el formato de fecha
        SimpleDateFormat cambiarFormato = new SimpleDateFormat("yyyy/MM/dd");
        String fechaFormateada = cambiarFormato.format(fechaNacimiento);


        double pesoMascota = 0.0;
        boolean pesoValido = false;

        // Validación de datos ingresados en el peso
        while (!pesoValido) {
            System.out.println("Ingrese el peso de la mascota: ");
            if (scanner.hasNextDouble()) {
                pesoMascota = scanner.nextDouble();
                pesoValido = true;
            } else {
                System.out.println("Ingreso un peso incorrecto, por favor ingrese nuevamente.");
                scanner.next();
            }
        }
        scanner.nextLine();

        System.out.println("Ingrese la raza de conejo (Conejo o Conejo Enano):");
        String especieMascota = scanner.nextLine().toLowerCase();

        //Validacion del ingreso de la especie
        Mascota mascota;
        if (especieMascota.equals("conejo")) {
            mascota = new Conejo(nombreMascota, fechaNacimiento, pesoMascota);
        } else if (especieMascota.equals("conejo enano")) {
            mascota = new ConejoEnano(nombreMascota, fechaNacimiento, pesoMascota);
        } else {
            System.out.println("La especie ingresada no existe");
            return;
        }

        // Solicitud de adopción
        System.out.println("Procecando ticket de adopción");
        Solicitud solicitud = new Solicitud(solicitante, mascota, encargado);
        solicitud.mostrarTicket();


    }
}
