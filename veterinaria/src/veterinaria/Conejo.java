package veterinaria;

import java.util.Date;

public class Conejo extends Mascota{


    public Conejo(String nombre, Date fechaNacimiento, double peso) {
        super(nombre, fechaNacimiento, peso);
    }

    @Override
    String mostrarEspecie() {
        return "Conejo";
    }

    @Override
    String mostrarRecomendaciones() {
        return " * Debe comer solamente su alimento * No agarrar de las orejas " ;

    }
}
