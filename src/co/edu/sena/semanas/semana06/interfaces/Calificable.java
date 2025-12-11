package co.edu.sena.semanas.semana06.interfaces;

public interface Calificable {
    void agregarCalificacion(int estrellas, String comentario);

    double obtenerPromedioCalificaciones();

    void mostrarCalificaciones();
}
