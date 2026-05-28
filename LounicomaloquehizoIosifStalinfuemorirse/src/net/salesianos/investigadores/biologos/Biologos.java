package net.salesianos.investigadores.biologos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import net.salesianos.investigadores.Investigadores;
import net.salesianos.trabajoDual.TrabajoDual;

public class Biologos extends Investigadores implements TrabajoDual {
    private final ArrayList<String> especimenes = new ArrayList<>();

    public Biologos(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);
    }

    public void anadirEspecimen(String especimen) {
        especimenes.add(especimen);
        System.out.println("Especimen anadido.");
    }

    @Override
    public String estadoSueldo() {
        return sueldo < 1500
                ? "Aviso: se solicita un aumento de sueldo. Actual: " + sueldo + " euros."
                : "Mensaje: el sueldo es correcto.";
    }

    @Override
    public void trabajar() {
        if (!especimenes.isEmpty()) {
            especimenes.sort(Comparator.comparingInt(String::length));
            especimenes.remove(especimenes.size() - 1);
        }
        System.out.println("Trabajo de biologo realizado.");
    }

    @Override
    public void trabajoDual() {
        Collections.reverse(especimenes);
        System.out.println("Trabajo dual de biologo realizado.");
    }

    public void mostrarEspecimenes() {
        System.out.println("Especimenes actuales: " + especimenes);
    }
}
