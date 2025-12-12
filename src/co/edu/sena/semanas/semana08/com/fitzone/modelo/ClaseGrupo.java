package co.edu.sena.semanas.semana08.com.fitzone.modelo;

public class ClaseGrupo {

    private String codigo;
    private String nombre;
    private String horario;
    private Entrenador entrenador;

    public ClaseGrupo(String codigo, String nombre, String horario, Entrenador entrenador) {
        validarString(codigo, "Código");
        validarString(nombre, "Nombre");
        validarString(horario, "Horario");

        this.codigo = codigo;
        this.nombre = nombre;
        this.horario = horario;
        this.entrenador = entrenador;
    }

    public ClaseGrupo(String codigo, String nombre) {
        this(codigo, nombre, "Sin horario", null);
    }

    private void validarString(String v, String campo) {
        if (v == null || v.isBlank()) throw new IllegalArgumentException(campo + " inválido.");
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getHorario() { return horario; }
    public Entrenador getEntrenador() { return entrenador; }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nombre + " - " + horario;
    }
}
