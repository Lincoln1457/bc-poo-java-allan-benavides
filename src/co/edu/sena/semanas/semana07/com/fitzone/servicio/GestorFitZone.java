package co.edu.sena.semanas.semana07.com.fitzone.servicio;

import co.edu.sena.semanas.semana07.com.fitzone.modelo.*;
import co.edu.sena.semanas.semana07.com.fitzone.excepciones.ClaseLlenaException;

import java.util.ArrayList;
import java.util.List;

public class GestorFitZone {
    private List<Miembro> miembros;
    private List<Entrenador> entrenadores;
    private List<ClaseGrupo> clasesGrupo;
    private List<Rutina> rutinas;

    public GestorFitZone() {
        this.miembros = new ArrayList<>();
        this.entrenadores = new ArrayList<>();
        this.clasesGrupo = new ArrayList<>();
        this.rutinas = new ArrayList<>();
    }

    public List<Miembro> getMiembros() { return new ArrayList<>(miembros); }
    public List<Entrenador> getEntrenadores() { return new ArrayList<>(entrenadores); }
    public List<ClaseGrupo> getClasesGrupo() { return new ArrayList<>(clasesGrupo); }
    public List<Rutina> getRutinas() { return new ArrayList<>(rutinas); }

    public void agregarMiembro(Miembro m) {
        try {
            if (m == null) throw new IllegalArgumentException("Miembro no puede ser nulo.");
            miembros.add(m);
            System.out.println("Miembro agregado: " + m.getNombreCompleto());
        } catch (IllegalArgumentException e) {
            System.err.println("Error al agregar miembro: " + e.getMessage());
        }
    }

    public void agregarEntrenador(Entrenador e) {
        try {
            if (e == null) throw new IllegalArgumentException("Entrenador no puede ser nulo.");
            entrenadores.add(e);
            System.out.println("Entrenador agregado: " + e.getNombre());
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al agregar entrenador: " + ex.getMessage());
        }
    }

    public void agregarRutina(Rutina r) {
        try {
            if (r == null) throw new IllegalArgumentException("Rutina no puede ser nula.");
            rutinas.add(r);
            System.out.println("Rutina agregada: " + r.getNombre());
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al agregar rutina: " + ex.getMessage());
        }
    }

    public void agregarClaseGrupo(ClaseGrupo c) {
        try {
            if (c == null) throw new IllegalArgumentException("Clase grupal no puede ser nula.");
            clasesGrupo.add(c);
            System.out.println("Clase grupal agregada: " + c.getNombreClase());
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al agregar clase grupal: " + ex.getMessage());
        }
    }

    public void reservarEnClase(String nombreClase, String nombreParticipante) {
        try {
            ClaseGrupo encontrada = null;
            for (ClaseGrupo c : clasesGrupo) {
                if (c.getNombreClase().equalsIgnoreCase(nombreClase)) {
                    encontrada = c;
                    break;
                }
            }
            if (encontrada == null) {
                throw new IllegalArgumentException("Clase no encontrada: " + nombreClase);
            }
            encontrada.reservar(nombreParticipante);
            System.out.println("Reserva confirmada en " + nombreClase + " para " + nombreParticipante);
        } catch (ClaseLlenaException e) {
            System.err.println("No se pudo reservar: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error en reserva: " + e.getMessage());
        }
    }

    public void listarMiembros() {
        System.out.println("\n~~~~ LISTA DE MIEMBROS ~~~~");
        for (Miembro m : miembros) System.out.println("- " + m);
    }

    public void listarEntrenadores() {
        System.out.println("\n~~~~ LISTA DE ENTRENADORES ~~~~");
        for (Entrenador e : entrenadores) System.out.println("- " + e);
    }

    public void listarRutinas() {
        System.out.println("\n~~~~ LISTA DE RUTINAS ~~~~");
        for (Rutina r : rutinas) System.out.println("- " + r);
    }

    public void listarClasesGrupo() {
        System.out.println("\n~~~~ LISTA DE CLASES GRUPALES ~~~~");
        for (ClaseGrupo c : clasesGrupo) {
            c.mostrarClase();
            System.out.println();
        }
    }
}
