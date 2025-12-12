package co.edu.sena.semanas.proyecto_final.com.fitzone.servicio;

import co.edu.sena.semanas.proyecto_final.com.fitzone.modelo.ClaseGrupal;
import co.edu.sena.semanas.proyecto_final.com.fitzone.modelo.Reserva;

import java.util.List;

public class ReporteServicio {

    public void generarReporteClases(List<ClaseGrupal> clases) {
        System.out.println("----- REPORTE DE CLASES -----");
        for (ClaseGrupal c : clases) {
            System.out.println(c.getCodigo() + " - " + c.getNombre() +
                    " | Cupos restantes: " + c.getCapacidadDisponible());
        }
    }

    public void generarReporteReservas(List<Reserva> reservas) {
        System.out.println("----- REPORTE DE RESERVAS -----");
        for (Reserva r : reservas) {
            System.out.println(r.getCodigo() + " - " + r.getMiembro().getNombre() +
                    " -> Clase: " + r.getClase().getNombre());
        }
    }
}
