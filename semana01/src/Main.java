public class Main {
  public static void main(String[] args) {

    Miembro miembro1 = new Miembro(
        "Anderson Chala",
        25,
        72.5,
        "anderlindo@gmail.com",
        false,
        0
    );

    miembro1.imprimirInfo();

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    double imc = miembro1.calcularIMC(1.75);
    System.out.println("IMC del que se hizo cálclo: " + imc);

    System.out.println("Nombre del miembro: " + miembro1.getNombreCompleto());

    miembro1.setPeso(78.0);
    System.out.println("Nuevo peso: " + miembro1.calcularIMC(1.75));

    Miembro m = new Miembro("Carlos Pérez", 28, 75.5, true, 10);
    Entrenador e = new Entrenador("Laura Gómez", 6, "Musculación", true);

    m.imprimirInfo();
    e.imprimirInfo();

    System.out.println("Nivel del entrenador: " + e.nivelEntrenador());

    e.cambiarDisponibilidad(false);
    System.out.println("Disponibilidad actualizada: " + (e.nivelEntrenador()));
  }
}
