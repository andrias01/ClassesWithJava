package com.andresVelez.ExamenParcialGood.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EPS2 {
    private static final int CAPACIDAD = 100;
    private List<Paciente2> paciente2s;

    public EPS2() {
        paciente2s = new ArrayList<>();
    }

    public boolean afiliarPaciente(long cedula, String nombre) {
        if (paciente2s.size() >= CAPACIDAD) {
            return false; // No se puede afiliar más pacientes, se alcanzó la capacidad máxima
        }

        for (Paciente2 paciente2 : paciente2s) {
            if (paciente2.getCedula() == cedula) {
                return false; // El paciente ya está afiliado
            }
        }

        Paciente2 nuevoPaciente2 = new Paciente2(cedula, nombre);
        paciente2s.add(nuevoPaciente2);
        return true;
    }

    public void sacarPaciente(long cedula) {
        Paciente2 paciente2Encontrado = buscarPaciente(cedula);
        if (paciente2Encontrado != null) {
            paciente2s.remove(paciente2Encontrado);
        } else {
            System.out.println("El paciente no existe en la EPS.");
        }
    }

    public Paciente2 buscarPaciente(long cedula) {
        for (Paciente2 paciente2 : paciente2s) {
            if (paciente2.getCedula() == cedula) {
                System.out.println("paciente encontrado con el nombre de "+ paciente2.getNombre());
                return paciente2;
            }
        }
        return null;
    }

    public List<Paciente2> buscarPacientesPorEnfermedad(String enfermedad) {
        List<Paciente2> pacientesEnfermos = new ArrayList<>();
        for (Paciente2 paciente2 : paciente2s) {
            // Supongamos que el paciente tiene una lista de enfermedades en la que se puede buscar
            // la enfermedad específica
            // Por simplicidad, asumimos que el paciente tiene una lista llamada "enfermedades"
            List<Enfermedad2> enfermedades = new ArrayList<>(); // Supongamos que esta lista está llena con las enfermedades del paciente
            for (Enfermedad2 enfermedadPaciente : enfermedades) {
                if (enfermedadPaciente.getNombre().equals(enfermedad)) {
                    pacientesEnfermos.add(paciente2);
                    break;
                }
            }
        }
        return pacientesEnfermos;
    }
    public List<Paciente2> obtenerPacientesSinEnfermedades() {
        List<Paciente2> pacientesSanos = new ArrayList<>();
        for (Paciente2 paciente2 : paciente2s) {
            // Supongamos que el paciente tiene una lista de enfermedades vacía si no padece ninguna
            // enfermedad, llamada "enfermedades"
            List<Enfermedad2> enfermedades = new ArrayList<>(); // Supongamos que esta lista está llena con las enfermedades del paciente
            if (enfermedades.isEmpty()) {
                pacientesSanos.add(paciente2);
            }
        }
        return pacientesSanos;
    }

    public void ordenarPacientesPorNombre() {
        Collections.sort(paciente2s, (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre()));
    }

}
