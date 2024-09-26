package veterinaria;

import java.util.Date;

public class ConejoEnano extends Mascota{


    public ConejoEnano(String nombre, Date fechaNacimiento, double peso) {
        super(nombre, fechaNacimiento, peso);
    }

    @Override
    String mostrarEspecie() {
        return "ConejoEnano";
    }

    @Override
    String mostrarRecomendaciones() {
        return " * Limpiar su lugar solamente cuando no vea * Cortar las uñas una cada tres meses  ";
    }


}
