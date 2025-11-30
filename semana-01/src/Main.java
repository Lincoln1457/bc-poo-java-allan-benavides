public class Main {
  public static void main(String[] args) {

    // Crear un objeto Miembro
    Miembro miembro1 = new Miembro(
        "Anderson Chala",
        25,
        72.5,
        false,
        0
    );

    // Imprimir información del miembro
    miembro1.imprimirInfo();

    // Calcular IMC
    double imc = miembro1.calcularIMC(1.75); // altura en metros
    System.out.println("IMC calculado: " + imc);

    // Usar getter
    System.out.println("Nombre del miembro: " + miembro1.getNombreCompleto());

    // Usar setter
    miembro1.setPeso(78.0);
    System.out.println("Nuevo peso: " + miembro1.calcularIMC(1.75));
  }
}

