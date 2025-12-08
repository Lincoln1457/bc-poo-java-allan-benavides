package co.edu.sena.semanas.semana05;

public class Miembro extends Persona {

  private String tipoMembresia;

  public Miembro(String nombre, String identificacion, String tipoMembresia) {
    super(nombre, identificacion);
    this.tipoMembresia = tipoMembresia;
  }

  public Miembro(String nombre, String identificacion) {
    super(nombre, identificacion);
    this.tipoMembresia = "Básica";
  }

  @Override
  public void saludar() {
    System.out.println("Hola, soy el miembro " + nombre + ". ¡Listo para entrenar!");
  }

  @Override
  public String mostrarInfo() {
    return "Miembro: " + nombre +
        " | ID: " + identificacion +
        " | Membresía: " + tipoMembresia;
  }
}
