package com.andresVelez.Desafio2.app;

import com.andresVelez.Desafio2.domain.Directo;
import com.andresVelez.Desafio2.domain.Freelance;
import com.andresVelez.Desafio2.domain.Nomina;
import com.andresVelez.Desafio2.domain.Vendedor;

import java.util.ArrayList;

public class NominaBicicletasApp {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        Directo juan = new Directo("Juan", 4_840_000);
        Directo david = new Directo("David", 3_975_000);
        Vendedor julián = new Vendedor("Julián", 2_050_000, 45_510_000);
        Vendedor carolina = new Vendedor("Carolina", 980_000, 35_989_000);
        Freelance johanna = new Freelance("Johanna", 71_000, 89);
        Freelance gustavo = new Freelance("Gustavo", 42_500, 65);

        nomina.setEmpleados(juan);
        nomina.setEmpleados(david);
        nomina.setEmpleados(julián);
        nomina.setEmpleados(carolina);
        nomina.setEmpleados(johanna);
        nomina.setEmpleados(gustavo);

        nomina.calcularNomina();

        nomina.listarDirectos();

        nomina.listarFreelancers();


    }
}
