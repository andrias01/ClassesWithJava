package EPS.dominio;

import java.util.List;

public class Paciente {
    private long cedula;
    private String nombre;
    private Enfermedad enfermedad;

    public Paciente(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }
}
