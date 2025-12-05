package co.edu.sena.semanas.semana02;

public class ClaseGrupo {
  private String nombreClase;
  private String horario;
  private Entrenador entrenador;
  private Rutina rutinaAsignada;
  private Miembro participante;

  public ClaseGrupo(String nombreClase, String horario, Entrenador entrenador) {
    this.nombreClase = nombreClase;
    this.horario = horario;
    this.entrenador = entrenador;
  }

  public String getNombreClase() { return nombreClase; }
  public void setNombreClase(String nombreClase) { this.nombreClase = nombreClase; }

  public String getHorario() { return horario; }
  public void setHorario(String horario) { this.horario = horario; }

  public Entrenador getEntrenador() { return entrenador; }
  public void setEntrenador(Entrenador entrenador) { this.entrenador = entrenador; }

  public Rutina getRutinaAsignada() { return rutinaAsignada; }
  public void setRutinaAsignada(Rutina rutinaAsignada) { this.rutinaAsignada = rutinaAsignada; }

  public Miembro getParticipante() { return participante; }
  public void setParticipante(Miembro participante) { this.participante = participante; }

  public void mostrarClase() {
    System.out.println("Clase grupal: " + nombreClase +
        " | Horario: " + horario +
        " | co.edu.sena.semanas.semana03.Entrenador: " + entrenador.getNombre());

    if (participante != null) {
      System.out.println("Participante: " + participante.getNombre());
    } else {
      System.out.println("No hay participante asignado.");
    }

    if (rutinaAsignada != null) {
      System.out.println("Rutina: " + rutinaAsignada.getNombre() +
          " (" + rutinaAsignada.getDuracionMinutos() + " min)");
    } else {
      System.out.println("No hay rutina asignada.");
    }
  }
}
