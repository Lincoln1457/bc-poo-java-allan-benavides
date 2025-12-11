package co.edu.sena.semanas.semana06.abstractas;

public abstract class Actividad {
    protected String nombre;
    protected int duracionMinutos;
    protected String nivel;

    public Actividad(String nombre, int duracionMinutos, String nivel) {
        setNombre(nombre);
        setDuracionMinutos(duracionMinutos);
        setNivel(nivel);
    }

    protected void validarTexto(String texto, String mensaje) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    protected void validarDuracion(int minutos) {
        if (minutos <= 0 || minutos > 300) {
            throw new IllegalArgumentException("La duración debe estar entre 1 y 300 minutos.");
        }
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        validarTexto(nombre, "El nombre de la actividad no puede estar vacío.");
        this.nombre = nombre.trim();
    }

    public int getDuracionMinutos() { return duracionMinutos; }

    public void setDuracionMinutos(int duracionMinutos) {
        validarDuracion(duracionMinutos);
        this.duracionMinutos = duracionMinutos;
    }

    public String getNivel() { return nivel; }

    public void setNivel(String nivel) {
        validarTexto(nivel, "El nivel de la actividad no puede estar vacío.");
        this.nivel = nivel.trim();
    }

    public void mostrarResumen() {
        System.out.println("Actividad: " + nombre + " | Duración: " + duracionMinutos +
                " min | Nivel: " + nivel);
    }

    public abstract void ejecutar();
}
