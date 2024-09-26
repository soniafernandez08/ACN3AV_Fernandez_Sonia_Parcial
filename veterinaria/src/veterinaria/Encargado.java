package veterinaria;

public class Encargado {
    private static Encargado instancia;
    private String nombre;
    //private String puesto;

    private Encargado(String nombre) {
        this.nombre = nombre;
    }

    public static Encargado getInstancia() {
        if (instancia == null) {
            instancia = new Encargado("");


        }
        return instancia;
    }
    public String getNombre() {
        return nombre;
    }

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }*/



}
