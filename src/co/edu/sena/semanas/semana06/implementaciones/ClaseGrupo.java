package co.edu.sena.semanas.semana06.implementaciones;

import co.edu.sena.semanas.semana06.abstractas.Actividad;
import co.edu.sena.semanas.semana06.interfaces.Calificable;
import co.edu.sena.semanas.semana06.interfaces.Reservable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ClaseGrupo extends Actividad implements Reservable, Calificable {

    private String entrenadorNombre;
    private int capacidad;
    private List<String> participantes;

    private Map<String, List<String>> reservas;

    private List<Calificacion> calificaciones;

    public ClaseGrupo(String nombre, int duracionMinutos, String nivel, String entrenadorNombre, int capacidad) {
        super(nombre, duracionMinutos, nivel);
        setEntrenadorNombre(entrenadorNombre);
        setCapacidad(capacidad);
        this.participantes = new ArrayList<>();
        this.reservas = new HashMap<>();
        this.calificaciones = new ArrayList<>();
    }

    public ClaseGrupo(String nombre, String entrenadorNombre) {
        super(nombre, 60, "Básico");
        setEntrenadorNombre(entrenadorNombre);
        this.capacidad = 20;
        this.participantes = new ArrayList<>();
        this.reservas = new HashMap<>();
        this.calificaciones = new ArrayList<>();
    }

    public String getEntrenadorNombre() { return entrenadorNombre; }

    public void setEntrenadorNombre(String entrenadorNombre) {
        validarTexto(entrenadorNombre, "El nombre del entrenador no puede estar vacío.");
        this.entrenadorNombre = entrenadorNombre.trim();
    }

    public int getCapacidad() { return capacidad; }

    public void setCapacidad(int capacidad) {
        if (capacidad <= 0 || capacidad > 200) {
            throw new IllegalArgumentException("Capacidad inválida (1..200).");
        }
        this.capacidad = capacidad;
    }

    public List<String> getParticipantes() { return participantes; }

    @Override
    public void ejecutar() {
        System.out.println("Iniciando clase grupal '" + nombre + "' con entrenador " + entrenadorNombre
                + ". Duración: " + duracionMinutos + " min. Nivel: " + nivel);
    }

    @Override
    public boolean verificarDisponibilidad(String fecha) {
        List<String> r = reservas.getOrDefault(fecha, new ArrayList<>());
        return r.size() < capacidad;
    }

    @Override
    public boolean realizarReserva(String nombre, String fecha) {
        if (nombre == null || nombre.trim().isEmpty()) return false;
        if (!verificarDisponibilidad(fecha)) return false;
        reservas.computeIfAbsent(fecha, k -> new ArrayList<>()).add(nombre.trim());
        if (!participantes.contains(nombre.trim())) {
            participantes.add(nombre.trim());
        }
        return true;
    }

    @Override
    public String obtenerCodigoReserva(String nombre, String fecha) {
        if (!reservas.containsKey(fecha)) return null;
        List<String> lista = reservas.get(fecha);
        if (!lista.contains(nombre)) return null;
        return (fecha + "-" + nombre + "-" + UUID.randomUUID().toString()).substring(0, Math.min(36, 64));
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
            System.out.println("No hay calificaciones para la clase '" + nombre + "'.");
            return;
        }
        System.out.println("Calificaciones de '" + nombre + "':");
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
