package net.salesianos.investigadores;

public abstract class Investigadores {
    protected String nombre;
    protected String especialidad;
    protected double sueldo;

    public Investigadores(String nombre, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public void identificacion() {
        System.out.println("Cientifico: " + nombre + " | Especialidad: " + especialidad);
    }

    public void hacerCalculoBasico(double valor1, double valor2) {
        System.out.println("Suma: " + (valor1 + valor2));
        System.out.println("Resta: " + (valor1 - valor2));
    }

    public abstract String estadoSueldo();

    public abstract void trabajar();
}
