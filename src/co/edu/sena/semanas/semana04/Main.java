package co.edu.sena.semanas.semana04;

public class Main {

  public static void main(String[] args) {

    System.out.println("~~~~~~ FitZone ~~~~~~\n");

    Entrenador entrenador1 = new Entrenador(
        "Carlos Gómez",
        30,
        "carlos@fitzone.com",
        5,
        "Crossfit",
        true
    );

    System.out.println("-- Información del entrenador --");
    entrenador1.imprimirInfoEntrenador();

    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    Miembro miembro1 = new Miembro(
        "Ana Pérez",
        25,
        "ana.perez@correo.com",
        60.5,
        true,
        8
    );

    System.out.println("-- Información del Miembro --");
    miembro1.imprimirInfoMiembro();

    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    System.out.println("¿La entrenadora es mayor de edad? " + entrenador1.esMayorDeEdad());
    System.out.println("¿La miembro es mayor de edad? " + miembro1.esMayorDeEdad());

    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    double imc = miembro1.calcularIMC(1.65);
    System.out.println("IMC de " + miembro1.nombre + ": " + imc);
  }
}
