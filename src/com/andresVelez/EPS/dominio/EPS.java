package EPS.dominio;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EPS {
    private static final int CAPACIDAD = 1000;
    private List<Paciente> pacientes;

    public EPS() {
        pacientes = new ArrayList<>();
    }

    public boolean afiliarPaciente(long cedula, String nombre) {
        if (pacientes.size() >= CAPACIDAD) {
            return false;
        }
        if (buscarPaciente(cedula) != null) {
            return false;
        }
        Paciente paciente = new Paciente(cedula, nombre);
        pacientes.add(paciente);
        return true;
    }

    public void sacarPaciente(long cedula) {
        Paciente paciente = buscarPaciente(cedula);
        if (paciente != null) {
            pacientes.remove(paciente);
        } else {
            System.out.println("El paciente con cédula " + cedula + " no existe en la EPS");
        }
    }

    public Paciente buscarPaciente(long cedula) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCedula() == cedula) {
                return paciente;
            }
        }
        return null;
    }

    public List<Paciente> buscarPacientesEnfermos(String nombreEnfermedad) {
        List<Paciente> pacientesEnfermos = new ArrayList<>();
        for (Paciente paciente : pacientes) {
            if (paciente.getEnfermedad() != null && paciente.getEnfermedad().getNombre().equals(nombreEnfermedad)) {
                pacientesEnfermos.add(paciente);
            }
        }
        return pacientesEnfermos;
    }
}
