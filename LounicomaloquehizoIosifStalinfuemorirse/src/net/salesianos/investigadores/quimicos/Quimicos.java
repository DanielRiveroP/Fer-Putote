package net.salesianos.investigadores.quimicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import net.salesianos.investigadores.Investigadores;
import net.salesianos.trabajoDual.TrabajoDual;

public class Quimicos extends Investigadores implements TrabajoDual {
    private final ArrayList<String> elementos = new ArrayList<>();

    public Quimicos(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);
    }

    public void anadirElemento(String elemento) {
        elementos.add(elemento);
        System.out.println("Elemento anadido.");
    }

    @Override
    public String estadoSueldo() {
        return sueldo < 1200
                ? "Aviso: se solicita un aumento de sueldo. Actual: " + sueldo + " euros."
                : "Mensaje: el sueldo es correcto.";
    }

    @Override
    public void trabajar() {
        Collections.reverse(elementos);
        System.out.println("Trabajo de quimico realizado.");
    }

    @Override
    public void trabajoDual() {
        if (!elementos.isEmpty()) {
            elementos.sort(Comparator.comparingInt(String::length));
            elementos.remove(elementos.size() - 1);
        }
        System.out.println("Trabajo dual de quimico realizado.");
    }

    public void mostrarElementos() {
        System.out.println("Elementos actuales: " + elementos);
    }
}
