package co.edu.sena.semanas.semana07.com.fitzone.excepciones;

public class ClaseLlenaException extends Exception {

    public ClaseLlenaException(String mensaje) {
        super(mensaje);
    }

    public ClaseLlenaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}