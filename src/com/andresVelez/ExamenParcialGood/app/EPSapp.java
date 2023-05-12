package com.andresVelez.ExamenParcialGood.app;

import com.andresVelez.ExamenParcialGood.domain.EPS2;
import com.andresVelez.ExamenParcialGood.domain.Paciente2;
import com.andresVelez.ExamenParcialOrigin.domain.EPS;
import com.andresVelez.ExamenParcialOrigin.domain.Enfermedad;
import com.andresVelez.ExamenParcialOrigin.domain.Paciente;

public class EPSapp {
    public static void main(String[] args) {
//        Paciente andres = new Paciente(123,"Andres");
//        Paciente carlos = new Paciente(321,"Carlos");
//        Paciente daniel = new Paciente(456,"Daniel");
//        Paciente julian = new Paciente(654,"Julian");
//        Paciente orlando = new Paciente(789,"Orlando");
//
//        Enfermedad cancer = new Enfermedad("Cancer",3);
//        Enfermedad tos = new Enfermedad("Tos",1);
//        Enfermedad bomito = new Enfermedad("Bomito",2);

        EPS2 eps = new EPS2();
        eps.afiliarPaciente(123,"Andres");
        eps.afiliarPaciente(321,"Carlos");
        eps.afiliarPaciente(456,"Daniel");
        eps.afiliarPaciente(654,"Julian");
        eps.afiliarPaciente(789,"Orlando");

        eps.buscarPaciente(654);

        eps.buscarPacientesPorEnfermedad("tos");
    }
}
