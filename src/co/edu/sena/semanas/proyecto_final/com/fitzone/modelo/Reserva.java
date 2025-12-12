package co.edu.sena.semanas.proyecto_final.com.fitzone.modelo;

import java.time.LocalDate;

public class Reserva {

    private String codigo;
    private Miembro miembro;
    private ClaseGrupal clase;
    private LocalDate fecha;

    public Reserva(String codigo, Miembro miembro, ClaseGrupal clase, LocalDate fecha) {
        this.codigo = codigo;
        this.miembro = miembro;
        this.clase = clase;
        this.fecha = fecha;
    }

    public String getCodigo() { return codigo; }
    public Miembro getMiembro() { return miembro; }
    public ClaseGrupal getClase() { return clase; }
    public LocalDate getFecha() { return fecha; }
}
