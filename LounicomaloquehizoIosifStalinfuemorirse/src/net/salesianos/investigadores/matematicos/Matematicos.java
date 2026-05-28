package net.salesianos.investigadores.matematicos;

import java.util.Arrays;

import net.salesianos.investigadores.Investigadores;

public class Matematicos extends Investigadores {
    private final int[][] resultados = {
            { 1, 1, 1 },
            { 1, 1, 1 },
            { 1, 1, 1 }
    };

    public Matematicos(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);
    }

    @Override
    public String estadoSueldo() {
        return sueldo < 1800
                ? "Aviso: se solicita un aumento de sueldo. Actual: " + sueldo + " euros."
                : "Mensaje: el sueldo es correcto.";
    }

    @Override
    public void trabajar() {
        System.out.println("El matematico necesita un numero o una matriz para trabajar.");
    }

    public void trabajar(int numero) {
        for (int fila = 0; fila < resultados.length; fila++) {
            for (int columna = 0; columna < resultados[fila].length; columna++) {
                resultados[fila][columna] *= numero;
            }
        }
        System.out.println("Matriz multiplicada por " + numero + ".");
    }

    public void trabajar(int[][] matriz) {
        for (int fila = 0; fila < resultados.length; fila++) {
            for (int columna = 0; columna < resultados[fila].length; columna++) {
                resultados[fila][columna] += matriz[fila][columna];
            }
        }
        System.out.println("Matriz sumada a los resultados.");
    }

    public void mostrarResultados() {
        System.out.println(Arrays.deepToString(resultados));
    }
}
