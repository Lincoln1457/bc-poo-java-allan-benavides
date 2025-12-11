package co.edu.sena.semanas.semana06.implementaciones;

import co.edu.sena.semanas.semana06.abstractas.Actividad;
import co.edu.sena.semanas.semana06.interfaces.Calificable;

import java.util.ArrayList;
import java.util.List;

public class Rutina extends Actividad implements Calificable {

    private String entrenadorNombre;
    private String miembroNombre;
    private List<Calificacion> calificaciones;

    public Rutina(String nombre, int duracionMinutos, String nivel, String entrenadorNombre, String miembroNombre) {
        super(nombre, duracionMinutos, nivel);
        this.entrenadorNombre = entrenadorNombre;
        this.miembroNombre = miembroNombre;
        this.calificaciones = new ArrayList<>();
    }

    public Rutina(String nombre, int duracionMinutos) {
        super(nombre, duracionMinutos, "Básico");
        this.entrenadorNombre = "Sin asignar";
        this.miembroNombre = "Sin asignar";
        this.calificaciones = new ArrayList<>();
    }

    public String getEntrenadorNombre() { return entrenadorNombre; }
    public void setEntrenadorNombre(String entrenadorNombre) {
        validarTexto(entrenadorNombre, "El nombre del entrenador no puede estar vacío.");
        this.entrenadorNombre = entrenadorNombre.trim();
    }

    public String getMiembroNombre() { return miembroNombre; }
    public void setMiembroNombre(String miembroNombre) {
        validarTexto(miembroNombre, "El nombre del miembro no puede estar vacío.");
        this.miembroNombre = miembroNombre.trim();
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando rutina '" + nombre + "' para " + miembroNombre +
                ", guiada por " + entrenadorNombre + ". Duración: " + duracionMinutos + " min.");
    }

    @Override
    public void agregarCalificacion(int estrellas, String comentario) {
        if (estrellas < 1 || estrellas > 5) {
            throw new IllegalArgumentException("Las estrellas deben estar entre 1 y 5.");
        }
        calificaciones.add(new Calificacion(estrellas, comentario));
    }

    @Override
    public double obtenerPromedioCalificaciones() {
        if (calificaciones.isEmpty()) return 0.0;
        double suma = 0;
        for (Calificacion c : calificaciones) suma += c.estrellas;
        return suma / calificaciones.size();
    }

    @Override
    public void mostrarCalificaciones() {
        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones para la rutina '" + nombre + "'.");
            return;
        }
        System.out.println("Calificaciones de la rutina '" + nombre + "':");
        for (Calificacion c : calificaciones) {
            System.out.println("- " + c.estrellas + " estrellas | " + (c.comentario == null ? "" : c.comentario));
        }
        System.out.printf("Promedio: %.2f estrellas%n", obtenerPromedioCalificaciones());
    }

    private static class Calificacion {
        int estrellas;
        String comentario;
        Calificacion(int estrellas, String comentario) {
            this.estrellas = estrellas;
            this.comentario = comentario;
        }
    }
}
