package co.edu.sena.semanas.semana06.interfaces;

public interface Reservable {
    boolean verificarDisponibilidad(String fecha);

    boolean realizarReserva(String nombre, String fecha);

    String obtenerCodigoReserva(String nombre, String fecha);
}
