package co.edu.sena.semana01;

public class Main {
  public static void main(String[] args) {

    Miembro miembro1 = new Miembro("Anderson Chala", 25, 75.5, "andylindo@gmail.com",false, 2);
    Miembro miembro2 = new Miembro("Ana Torres", 34, 62.0, "anrrez@gmail.com",true, 27);

    Entrenador entrenador1 = new Entrenador("Laura Gómez", 6, "Musculación", true);
    Entrenador entrenador2 = new Entrenador("Julián Rojas", 1, "Yoga", false);

    System.out.println("\n~~~~~~~~ INFORMACIÓN DE MIEMBROS ~~~~~~~~");
    System.out.println("Primer miembro:");
    miembro1.imprimirInfo();
    System.out.println("\nSegundo miembro:");
    miembro2.imprimirInfo();

    System.out.println("\nIMC de " + miembro1.getNombreCompleto() + ": " + miembro1.calcularIMC(1.73));
    System.out.println("IMC de " + miembro2.getNombreCompleto() + ": " + miembro2.calcularIMC(1.61));

    miembro1.setPeso(78.0);
    System.out.println("\nNuevo IMC de " + miembro1.getNombreCompleto() + " tras actualizar el peso: "
        + miembro1.calcularIMC(1.73));

    System.out.println("\n~~~~~~~~ INFORMACIÓN DE ENTRENADORES ~~~~~~~~");
    entrenador1.imprimirInfo();
    entrenador2.imprimirInfo();

    System.out.println("\nNivel de entrenador " + entrenador1.getNombre() + ": " + entrenador1.nivelEntrenador());
    System.out.println("Nivel de entrenador " + entrenador2.getNombre() + ": " + entrenador2.nivelEntrenador());

    entrenador2.setEspecialidad("Entrenamiento Funcional");

    entrenador2.cambiarDisponibilidad(true);

    System.out.println("\nInformación actualizada del entrenador 2:");
    entrenador2.imprimirInfo();
  }
}
