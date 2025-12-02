public class Entrenador {
  private String nombre;
  private int experienciaAnios;
  private String especialidad;
  private boolean disponible;

  public Entrenador(String nombre, int experienciaAnios, String especialidad, boolean disponible) {
    setNombre(nombre);
    setExperienciaAnios(experienciaAnios);
    setEspecialidad(especialidad);
    setDisponible(disponible);
  }

  public Entrenador(String nombre, int experienciaAnios, String especialidad) {
    setNombre(nombre);
    setExperienciaAnios(experienciaAnios);
    setEspecialidad(especialidad);
    this.disponible = true; // por defecto
  }

  public void imprimirInfo() {
    System.out.println("~~~~ Información del entrenador ~~~~");
    System.out.println("Nombre: " + nombre);
    System.out.println("Años de experiencia: " + experienciaAnios);
    System.out.println("Especialidad: " + especialidad);
    System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
  }

  public String nivelEntrenador() {
    if (experienciaAnios < 2) return "Junior";
    else if (experienciaAnios < 5) return "Intermedio";
    else return "Senior";
  }

  public String getNombre() { return nombre; }
  public int getExperienciaAnios() { return experienciaAnios; }
  public String getEspecialidad() { return especialidad; }
  public boolean isDisponible() { return disponible; }

  public void setNombre(String nombre) {
    validarString(nombre, "Nombre");
    this.nombre = nombre;
  }

  public void setExperienciaAnios(int experienciaAnios) {
    if (experienciaAnios < 0 || experienciaAnios > 70) {
      throw new IllegalArgumentException("La experiencia debe estar entre 0 y 70 años.");
    }
    this.experienciaAnios = experienciaAnios;
  }

  public void setEspecialidad(String especialidad) {
    validarString(especialidad, "Especialidad");
    this.especialidad = especialidad;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  public void cambiarDisponibilidad(boolean nuevoEstado) {
    this.disponible = nuevoEstado;
  }

  // Métodos auxiliares privados
  private void validarString(String texto, String campo) {
    if (texto == null || texto.isBlank()) {
      throw new IllegalArgumentException(campo + " no puede ser vacío.");
    }
  }
}
