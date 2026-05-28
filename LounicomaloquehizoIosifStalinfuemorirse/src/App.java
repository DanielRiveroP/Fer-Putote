import java.util.InputMismatchException;
import java.util.Scanner;

import net.salesianos.investigadores.biologos.Biologos;
import net.salesianos.investigadores.matematicos.Matematicos;
import net.salesianos.investigadores.quimicos.Quimicos;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Matematicos matematico = new Matematicos("Alan Turing", "Criptografia", 1700);
        Biologos biologo = new Biologos("Charles Darwin", "Evolucion", 1600);
        Quimicos quimico = new Quimicos("Marie Curie", "Radiactividad", 1100);

        int opcion;
        do {
            mostrarMenu();
            opcion = pedirNumero("Elige una opcion: ");

            switch (opcion) {
                case 1 -> menuMatematico(matematico);
                case 2 -> menuBiologo(biologo);
                case 3 -> menuQuimico(quimico);
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida.");
            }

            System.out.println("----------------------------------------");
        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1. Matematico");
        System.out.println("2. Biologo");
        System.out.println("3. Quimico");
        System.out.println("4. Salir");
    }

    private static int pedirNumero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (InputMismatchException error) {
                System.out.println("ERROR CRITICO: Debes introducir un numero entero.");
                sc.nextLine();
            }
        }
    }

    private static void menuMatematico(Matematicos matematico) {
        matematico.identificacion();
        System.out.println(matematico.estadoSueldo());
        matematico.trabajar(pedirNumero("Numero para multiplicar la matriz: "));
        matematico.mostrarResultados();
    }

    private static void menuBiologo(Biologos biologo) {
        biologo.identificacion();
        System.out.println(biologo.estadoSueldo());
        System.out.print("Especimen para anadir: ");
        biologo.anadirEspecimen(sc.nextLine());
        biologo.mostrarEspecimenes();
        biologo.trabajar();
        biologo.mostrarEspecimenes();
        biologo.trabajoDual();
        biologo.mostrarEspecimenes();
    }

    private static void menuQuimico(Quimicos quimico) {
        quimico.identificacion();
        System.out.println(quimico.estadoSueldo());
        System.out.print("Elemento para anadir: ");
        quimico.anadirElemento(sc.nextLine());
        quimico.mostrarElementos();
        quimico.trabajar();
        quimico.mostrarElementos();
        quimico.trabajoDual();
        quimico.mostrarElementos();
    }
}
