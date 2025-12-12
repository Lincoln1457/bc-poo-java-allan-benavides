package co.edu.sena.semanas.semana08.com.fitzone.modelo;

public class Rutina {
    private String codigo;
    private String nombre;
    private int duracionMin;
    private String nivel;
    private Entrenador entrenador;
    private Miembro miembro;

    public Rutina(String codigo, String nombre, int duracionMin, String nivel,
                  Entrenador entrenador, Miembro miembro) {
        validarString(codigo, "Código");
        validarString(nombre, "Nombre");
        validarString(nivel, "Nivel");
        validarPositivo(duracionMin, "Duración");

        this.codigo = codigo;
        this.nombre = nombre;
        this.duracionMin = duracionMin;
        this.nivel = nivel;
        this.entrenador = entrenador;
        this.miembro = miembro;
    }

    public Rutina(String codigo, String nombre, int duracionMin) {
        this(codigo, nombre, duracionMin, "Básico", null, null);
    }

    private void validarString(String v, String campo) {
        if (v == null || v.isBlank()) throw new IllegalArgumentException(campo + " no puede ser vacío.");
    }

    private void validarPositivo(int n, String campo) {
        if (n <= 0) throw new IllegalArgumentException(campo + " debe ser positivo.");
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getDuracionMin() { return duracionMin; }
    public String getNivel() { return nivel; }
    public Entrenador getEntrenador() { return entrenador; }
    public Miembro getMiembro() { return miembro; }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nombre + " - " + nivel + " (" + duracionMin + " min)";
    }
}
