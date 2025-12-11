package co.edu.sena.semanas.semana07.com.fitzone.modelo;

import co.edu.sena.semanas.semana07.com.fitzone.excepciones.ClaseLlenaException;

import java.util.ArrayList;
import java.util.List;

public class ClaseGrupo {
    private String nombreClase;
    private String horario;
    private Entrenador entrenador;
    private Rutina rutinaAsignada;
    private List<String> participantes;
    private int capacidad;

    public ClaseGrupo(String nombreClase, String horario, Entrenador entrenador, int capacidad) {
        setNombreClase(nombreClase);
        setHorario(horario);
        setEntrenador(entrenador);
        setCapacidad(capacidad);
        this.participantes = new ArrayList<>();
    }

    public ClaseGrupo(String nombreClase, Entrenador entrenador) {
        setNombreClase(nombreClase);
        this.horario = "Sin definir";
        setEntrenador(entrenador);
        this.capacidad = 20;
        this.participantes = new ArrayList<>();
    }

    public String getNombreClase() { return nombreClasseSafe(); }

    private String nombreClasseSafe() { return nombreClase; }

    public void setNombreClase(String nombreClase) {
        if (!textoValido(nombreClase)) throw new IllegalArgumentException("El nombre de la clase no puede estar vacío.");
        this.nombreClase = nombreClase.trim();
    }

    public String getHorario() { return horario; }
    public void setHorario(String horario) {
        if (!textoValido(horario)) throw new IllegalArgumentException("Horario inválido.");
        this.horario = horario.trim();
    }

    public Entrenador getEntrenador() { return entrenador; }
    public void setEntrenador(Entrenador entrenador) {
        if (entrenador == null) throw new IllegalArgumentException("Entrenador no puede ser nulo.");
        this.entrenador = entrenador;
    }

    public Rutina getRutinaAsignada() { return rutinaAsignada; }
    public void setRutinaAsignada(Rutina rutinaAsignada) { this.rutinaAsignada = rutinaAsignada; }

    public List<String> getParticipantes() { return new ArrayList<>(participantes); }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) {
        if (capacidad <= 0 || capacidad > 200) throw new IllegalArgumentException("Capacidad inválida (1..200).");
        this.capacidad = capacidad;
    }

    public void reservar(String nombreParticipante) throws ClaseLlenaException {
        if (!textoValido(nombreParticipante)) throw new IllegalArgumentException("Nombre participante inválido.");
        if (participantes.size() >= capacidad) {
            throw new ClaseLlenaException("La clase '" + nombreClase + "' está llena.");
        }
        participantes.add(nombreParticipante.trim());
    }

    public void mostrarClase() {
        System.out.println("Clase: " + nombreClase + " | Horario: " + horario + " | Entrenador: " + entrenador.getNombre());
        System.out.println("Participantes (" + participantes.size() + "/" + capacidad + "): " + participantes);
        if (rutinaAsignada != null) System.out.println("Rutina: " + rutinaAsignada.getNombre());
    }

    private boolean textoValido(String s) {
        return s != null && !s.trim().isEmpty();
    }
}
