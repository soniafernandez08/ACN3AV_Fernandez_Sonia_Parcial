package veterinaria;

import java.util.Date;

public abstract class Mascota {
    private String nombre;
    private Date fechaNacimiento;
    private double peso;

    public Mascota(String nombre, Date fechaNacimiento, double peso) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    abstract String mostrarEspecie();
    abstract String mostrarRecomendaciones();



}
