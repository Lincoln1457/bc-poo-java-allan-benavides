package co.edu.sena.semanas.semana07.com.fitzone.modelo;

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

    public Entrenador(String nombre, String especialidad) {
        setNombre(nombre);
        setEspecialidad(especialidad);
        this.experienciaAnios = 0;
        this.disponible = true;
    }

    public String getNombre() { return nombre; }
    public int getExperienciaAnios() { return experienciaAnios; }
    public String getEspecialidad() { return especialidad; }
    public boolean isDisponible() { return disponible; }

    public void setNombre(String nombre) {
        if (!textoValido(nombre)) {
            throw new IllegalArgumentException("El nombre del entrenador no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public void setExperienciaAnios(int experienciaAnios) {
        if (experienciaAnios < 0 || experienciaAnios > 60) {
            throw new IllegalArgumentException("La experiencia debe estar entre 0 y 60 años.");
        }
        this.experienciaAnios = experienciaAnios;
    }

    public void setEspecialidad(String especialidad) {
        if (!textoValido(especialidad)) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }
        this.especialidad = especialidad.trim();
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String nivelEntrenador() {
        if (experienciaAnios < 2) return "Junior";
        if (experienciaAnios < 5) return "Intermedio";
        return "Senior";
    }

    private boolean textoValido(String s) {
        return s != null && !s.trim().isEmpty();
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ", " + experienciaAnios + " años)";
    }
}
