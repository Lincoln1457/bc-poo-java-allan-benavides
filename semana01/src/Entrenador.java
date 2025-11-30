public class Entrenador {
  private String nombre;
  private int experienciaAnios;
  private String especialidad;
  private boolean disponible;

  public Entrenador(String nombre, int experienciaAnios, String especialidad, boolean disponible) {
    this.nombre = nombre;
    this.experienciaAnios = experienciaAnios;
    this.especialidad = especialidad;
    this.disponible = disponible;
  }

  public void imprimirInfo() {
    System.out.println("----- Información del Entrenador -----");
    System.out.println("Nombre: " + nombre);
    System.out.println("Años de experiencia: " + experienciaAnios);
    System.out.println("Especialidad: " + especialidad);
    System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
  }

  public String nivelEntrenador() {
    if (experienciaAnios < 2) {
      return "Junior";
    } else if (experienciaAnios < 5) {
      return "Intermedio";
    } else {
      return "Senior";
    }
  }

  public void cambiarDisponibilidad(boolean nuevoEstado) {
    this.disponible = nuevoEstado;
  }

  public String getNombre() {
    return nombre;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }
}