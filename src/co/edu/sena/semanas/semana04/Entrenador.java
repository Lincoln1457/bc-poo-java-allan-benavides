package co.edu.sena.semanas.semana04;

public class Entrenador extends Persona {
  private int experienciaAnios;
  private String especialidad;
  private boolean disponible;

  public Entrenador(String nombre, int edad, String email,
                    int experienciaAnios, String especialidad, boolean disponible) {
    super(nombre, edad, email);
    validarExperiencia(experienciaAnios);
    validarString(especialidad, "especialidad");

    this.experienciaAnios = experienciaAnios;
    this.especialidad = especialidad;
    this.disponible = disponible;
  }

  public Entrenador(String nombre, int edad, String email, String especialidad) {
    super(nombre, edad, email);
    validarString(especialidad, "especialidad");

    this.experienciaAnios = 0;
    this.especialidad = especialidad;
    this.disponible = true;
  }

  public String nivelEntrenador() {
    if (experienciaAnios < 2) return "Junior";
    if (experienciaAnios < 5) return "Intermedio";
    return "Senior";
  }

  public void imprimirInfoEntrenador() {
    imprimirDatosPersonales(); // heredado
    System.out.println("Experiencia: " + experienciaAnios + " años");
    System.out.println("Especialidad: " + especialidad);
    System.out.println("Nivel: " + nivelEntrenador());
    System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
  }

  public void setExperienciaAnios(int experienciaAnios) {
    validarExperiencia(experienciaAnios);
    this.experienciaAnios = experienciaAnios;
  }

  public void setEspecialidad(String especialidad) {
    validarString(especialidad, "especialidad");
    this.especialidad = especialidad;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  // Validaciones privadas
  private void validarExperiencia(int experiencia) {
    if (experiencia < 0) {
      throw new IllegalArgumentException("La experiencia no puede ser negativa.");
    }
  }

  private void validarString(String valor, String campo) {
    if (valor == null || valor.trim().isEmpty()) {
      throw new IllegalArgumentException("El campo " + campo + " no puede estar vacío.");
    }
  }
}