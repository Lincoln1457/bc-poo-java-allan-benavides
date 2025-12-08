package co.edu.sena.semanas.semana05;

public class Entrenador extends Persona {

  private String especialidad;

  public Entrenador(String nombre, String identificacion, String especialidad) {
    super(nombre, identificacion);
    this.especialidad = especialidad;
  }

  public Entrenador(String nombre, String identificacion) {
    super(nombre, identificacion);
    this.especialidad = "General";
  }

  @Override
  public void saludar() {
    System.out.println("Hola, soy el entrenador " + nombre + ". ¡Listo para tu rutina!");
  }

  @Override
  public String mostrarInfo() {
    return "Entrenador: " + nombre +
        " | ID: " + identificacion +
        " | Especialidad: " + especialidad;
  }
}
