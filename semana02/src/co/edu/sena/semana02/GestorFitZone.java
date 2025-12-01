package co.edu.sena.semana02;

import java.util.ArrayList;

public class GestorFitZone {
  private ArrayList<Miembro> miembros;
  private ArrayList<Entrenador> entrenadores;
  private ArrayList<ClaseGrupo> clasesGrupo;
  private ArrayList<Rutina> rutinas;

  public GestorFitZone() {
    miembros = new ArrayList<>();
    entrenadores = new ArrayList<>();
    clasesGrupo = new ArrayList<>();
    rutinas = new ArrayList<>();
  }

  public void agregarMiembro(Miembro m) {
    miembros.add(m);
    System.out.println("Miembro agregado: " + m.getNombre());
  }

  public void listarMiembros() {
    System.out.println("\n~~~~ LISTA DE MIEMBROS ~~~~");
    for (Miembro m : miembros) {
      System.out.println("- " + m.getNombre());
    }
  }

  public void agregarEntrenador(Entrenador e) {
    entrenadores.add(e);
    System.out.println("Entrenador agregado: " + e.getNombre());
  }

  public void listarEntrenadores() {
    System.out.println("\n~~~~ LISTA DE ENTRENADORES ~~~~");
    for (Entrenador e : entrenadores) {
      System.out.println("- " + e.getNombre());
    }
  }

  public void agregarClaseGrupo(ClaseGrupo c) {
    clasesGrupo.add(c);
    System.out.println("Clase grupal agregada: " + c.getNombreClase());
  }

  public void listarClasesGrupo() {
    System.out.println("\n~~~~ LISTA DE CLASES GRUPALES ~~~~");
    for (ClaseGrupo c : clasesGrupo) {
      System.out.println("- " + c.getNombreClase() + " | Horario: " + c.getHorario());
    }
  }

  public void agregarRutina(Rutina r) {
    rutinas.add(r);
    System.out.println("Rutina agregada: " + r.getNombre());
  }

  public void listarRutinas() {
    System.out.println("\n~~~~ LISTA DE RUTINAS ~~~~");
    for (Rutina r : rutinas) {
      System.out.println("- " + r.getNombre() + " (" + r.getDuracionMinutos() + " min)");
    }
  }

  public void mostrarResumenGeneral() {
    System.out.println("\n------ RESUMEN COMPLETO FITZONE ------");
    listarMiembros();
    listarEntrenadores();
    listarClasesGrupo();
    listarRutinas();
  }
}