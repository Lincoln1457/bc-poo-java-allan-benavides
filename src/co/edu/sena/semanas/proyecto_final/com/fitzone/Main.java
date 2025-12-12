package co.edu.sena.semanas.proyecto_final.com.fitzone;

import co.edu.sena.semanas.proyecto_final.com.fitzone.excepciones.ClaseLlenaException;
import co.edu.sena.semanas.proyecto_final.com.fitzone.excepciones.MiembroNoEncontradoException;
import co.edu.sena.semanas.proyecto_final.com.fitzone.modelo.*;
import co.edu.sena.semanas.proyecto_final.com.fitzone.servicio.GimnasioServicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GimnasioServicio servicio = new GimnasioServicio();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN FITZONE ===");
            System.out.println("1. Agregar miembro");
            System.out.println("2. Agregar clase grupal");
            System.out.println("3. Buscar miembro");
            System.out.println("4. Listar miembros");
            System.out.println("5. Reservar clase");
            System.out.println("6. Filtrar clases con cupos");
            System.out.println("7. Ver estadísticas");
            System.out.println("8. Listar reservas");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt(); sc.nextLine();
                    System.out.print("Documento: ");
                    String doc = sc.nextLine();
                    System.out.print("Plan: ");
                    String plan = sc.nextLine();

                    Miembro m = new Miembro(nombre, edad, doc, plan);
                    servicio.agregarMiembro(m);
                    System.out.println("Miembro agregado.");
                }

                case 2 -> {
                    System.out.print("Código clase: ");
                    String cod = sc.nextLine();
                    System.out.print("Nombre clase: ");
                    String nombre = sc.nextLine();
                    System.out.print("Capacidad: ");
                    int capacidad = sc.nextInt(); sc.nextLine();

                    servicio.agregarClase(new ClaseGrupal(cod, nombre, capacidad));
                    System.out.println("Clase agregada.");
                }

                case 3 -> {
                    System.out.print("Documento: ");
                    String d = sc.nextLine();
                    try {
                        System.out.println(servicio.buscarMiembro(d).getDescripcion());
                    } catch (MiembroNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 4 -> {
                    System.out.println("---- MIEMBROS ----");
                    for (Persona p : servicio.listarMiembros()) {
                        System.out.println(p.getDescripcion());
                    }
                }

                case 5 -> {
                    System.out.print("Código reserva: ");
                    String codR = sc.nextLine();
                    System.out.print("Documento miembro: ");
                    String docM = sc.nextLine();
                    System.out.print("Código clase: ");
                    String codC = sc.nextLine();

                    try {
                        servicio.reservar(codR, docM, codC);
                        System.out.println("Reserva realizada.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 6 -> {
                    System.out.println("---- CLASES CON CUPOS ----");
                    servicio.filtrarClasesConCupos().forEach(
                            c -> System.out.println(c.getNombre() + " - Cupos: " + c.getCapacidadDisponible())
                    );
                }

                case 7 -> {
                    System.out.println("Total reservas: " + servicio.totalReservas());
                    System.out.println("Promedio de inscritos por clase: " + servicio.promedioMiembrosPorClase());
                }

                case 8 -> {
                    System.out.println("---- RESERVAS ----");
                    servicio.listarReservas().forEach(
                            r -> System.out.println(r.getCodigo() + " - " + r.getMiembro().getNombre())
                    );
                }
            }

        } while (opcion != 0);

        System.out.println("Saliendo del sistema...");
    }
}
