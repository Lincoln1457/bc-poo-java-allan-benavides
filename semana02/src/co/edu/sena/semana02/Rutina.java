package co.edu.sena.semana02;

public class Rutina {

  private String nombre;
  private String nivelDificultad;
  private int duracionMinutos;

  private Entrenador entrenadorAsignado;

  private Miembro miembroAsignado;

  public Rutina(String nombre, String nivelDificultad, int duracionMinutos, Entrenador entrenadorAsignado, Miembro miembroAsignado) {
    this.nombre = nombre;
    this.nivelDificultad = nivelDificultad;
    this.duracionMinutos = duracionMinutos;
    this.entrenadorAsignado = entrenadorAsignado;
    this.miembroAsignado = miembroAsignado;
  }

  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }

  public String getNivelDificultad() { return nivelDificultad; }
  public void setNivelDificultad(String nivelDificultad) { this.nivelDificultad = nivelDificultad; }

  public int getDuracionMinutos() { return duracionMinutos; }
  public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }

  public Entrenador getEntrenadorAsignado() { return entrenadorAsignado; }
  public void setEntrenadorAsignado(Entrenador entrenadorAsignado) { this.entrenadorAsignado = entrenadorAsignado; }

  public Miembro getMiembroAsignado() { return miembroAsignado; }
  public void setMiembroAsignado(Miembro miembroAsignado) { this.miembroAsignado = miembroAsignado; }

  public void mostrarRutina() {
    System.out.println("Rutina: " + nombre);
    System.out.println("Dificultad: " + nivelDificultad);
    System.out.println("Duración: " + duracionMinutos + " min");
    System.out.println("Entrenador: " + entrenadorAsignado.getNombre());
    System.out.println("Asignada al miembro: " + miembroAsignado.getNombre());
  }
}
