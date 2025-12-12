package co.edu.sena.semanas.semana08.com.fitzone.modelo;

public class Entrenador {
    private String id;
    private String nombre;
    private String especialidad;

    public Entrenador(String id, String nombre, String especialidad) {
        validarString(id, "ID");
        validarString(nombre, "Nombre");
        validarString(especialidad, "Especialidad");

        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public Entrenador(String id, String nombre) {
        this(id, nombre, "General");
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    public void setNombre(String nombre) {
        validarString(nombre, "Nombre");
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        validarString(especialidad, "Especialidad");
        this.especialidad = especialidad;
    }

    private void validarString(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(campo + " no puede estar vacío.");
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}
