package co.edu.sena.semanas.semana06;

import co.edu.sena.semanas.semana06.abstractas.Actividad;
import co.edu.sena.semanas.semana06.implementaciones.ClaseGrupo;
import co.edu.sena.semanas.semana06.implementaciones.Rutina;
import co.edu.sena.semanas.semana06.interfaces.Calificable;
import co.edu.sena.semanas.semana06.interfaces.Reservable;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== FITZONE ===\n");

        Actividad[] actividades = new Actividad[3];
        actividades[0] = new ClaseGrupo("Spinning Intensivo", 50, "Intermedio", "Carlos Gómez", 25);
        actividades[1] = new Rutina("Full Body", 60, "Intermedio", "Laura Torres", "Andrés Ramírez");
        actividades[2] = new ClaseGrupo("Yoga Relax", 45, "Básico", "Laura Torres", 18);

        System.out.println("--- EJECUTANDO ACTIVIDADES (polimorfismo) ---");
        for (Actividad a : actividades) {
            a.mostrarResumen();
            a.ejecutar();
            System.out.println();
        }

        System.out.println("--- DEMOSTRACIÓN Reservable ---");
        Reservable claseReservable = (Reservable) actividades[0];
        String fecha = "2025-12-15";
        System.out.println("Disponibilidad en " + fecha + ": " + claseReservable.verificarDisponibilidad(fecha));
        boolean exitoReserva = claseReservable.realizarReserva("Camila López", fecha);
        System.out.println("Reserva realizada: " + exitoReserva);
        System.out.println("Código de reserva: " + claseReservable.obtenerCodigoReserva("Camila López", fecha));
        System.out.println();

        System.out.println("--- DEMOSTRACIÓN Calificable ---");
        Calificable cal1 = (Calificable) actividades[0];
        Calificable cal2 = (Calificable) actividades[1];

        cal1.agregarCalificacion(5, "Clase excelente, muy dinámica.");
        cal1.agregarCalificacion(4, "Buena intensidad.");
        cal2.agregarCalificacion(5, "Rutina muy completa.");

        cal1.mostrarCalificaciones();
        System.out.println();
        cal2.mostrarCalificaciones();
        System.out.println();

        System.out.println("--- PROMEDIOS ---");
        System.out.printf("Promedio '%s': %.2f%n", actividades[0].getNombre(), cal1.obtenerPromedioCalificaciones());
        System.out.printf("Promedio '%s': %.2f%n", actividades[1].getNombre(), cal2.obtenerPromedioCalificaciones());

        System.out.println("\n=== FIN DEMOSTRACIÓN ===");
    }
}
