package co.edu.sena.semanas.semana05;

public class Persona {

  protected String nombre;
  protected String identificacion;

  public Persona(String nombre, String identificacion) {
    setNombre(nombre);
    setIdentificacion(identificacion);
  }

  public void setNombre(String nombre) {
    if (nombre == null || nombre.isEmpty()) {
      throw new IllegalArgumentException("El nombre no puede estar vacío.");
    }
    this.nombre = nombre;
  }

  public void setIdentificacion(String identificacion) {
    if (identificacion == null || identificacion.isEmpty()) {
      throw new IllegalArgumentException("La identificación no puede estar vacía.");
    }
    this.identificacion = identificacion;
  }

  public String getNombre() { return nombre; }
  public String getIdentificacion() { return identificacion; }

  public void saludar() {
    System.out.println("Hola, soy una persona del gimnasio.");
  }

  public String mostrarInfo() {
    return "Nombre: " + nombre + " | ID: " + identificacion;
  }
}
