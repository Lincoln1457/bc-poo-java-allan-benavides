package co.edu.sena.semanas.semana07.com.fitzone.excepciones;

public class MembresiaVencidaException extends Exception {

    public MembresiaVencidaException(String mensaje) {
        super(mensaje);
    }

    public MembresiaVencidaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
