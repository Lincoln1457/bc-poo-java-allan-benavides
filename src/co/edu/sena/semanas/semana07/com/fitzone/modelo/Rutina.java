package co.edu.sena.semanas.semana07.com.fitzone.modelo;

public class Rutina {
    private String nombre;
    private int duracionMinutos;
    private String nivel;
    private String entrenadorAsignado;
    private String miembroAsignado;

    public Rutina(String nombre, int duracionMinutos, String nivel, String entrenadorAsignado, String miembroAsignado) {
        setNombre(nombre);
        setDuracionMinutos(duracionMinutos);
        setNivel(nivel);
        setEntrenadorAsignado(entrenadorAsignado);
        setMiembroAsignado(miembroAsignado);
    }

    public Rutina(String nombre, int duracionMinutos) {
        setNombre(nombre);
        setDuracionMinutos(duracionMinutos);
        this.nivel = "Básico";
        this.entrenadorAsignado = "Sin asignar";
        this.miembroAsignado = "Sin asignar";
    }

    public String getNombre() { return nombre; }
    public int getDuracionMinutos() { return duracionMinutos; }
    public String getNivel() { return nivel; }
    public String getEntrenadorAsignado() { return entrenadorAsignado; }
    public String getMiembroAsignado() { return miembroAsignado; }

    public void setNombre(String nombre) {
        if (!textoValido(nombre)) throw new IllegalArgumentException("El nombre de la rutina no puede estar vacío.");
        this.nombre = nombre.trim();
    }

    public void setDuracionMinutos(int duracionMinutos) {
        if (duracionMinutos <= 0 || duracionMinutos > 300) throw new IllegalArgumentException("Duración inválida (1..300).");
        this.duracionMinutos = duracionMinutos;
    }

    public void setNivel(String nivel) {
        if (!textoValido(nivel)) throw new IllegalArgumentException("El nivel no puede estar vacío.");
        this.nivel = nivel.trim();
    }

    public void setEntrenadorAsignado(String entrenadorAsignado) {
        if (!textoValido(entrenadorAsignado)) throw new IllegalArgumentException("Entrenador inválido.");
        this.entrenadorAsignado = entrenadorAsignado.trim();
    }

    public void setMiembroAsignado(String miembroAsignado) {
        if (!textoValido(miembroAsignado)) throw new IllegalArgumentException("Miembro inválido.");
        this.miembroAsignado = miembroAsignado.trim();
    }

    private boolean textoValido(String s) {
        return s != null && !s.trim().isEmpty();
    }

    @Override
    public String toString() {
        return nombre + " (" + duracionMinutos + " min, nivel " + nivel + ")";
    }
}
