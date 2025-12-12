package co.edu.sena.semanas.semana08.com.fitzone;

import co.edu.sena.semanas.semana08.com.fitzone.servicio.GestorFitZone;
import co.edu.sena.semanas.semana08.com.fitzone.modelo.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorFitZone gestor = new GestorFitZone();

        int opcion;

        do {
            System.out.println("\n=== FITZONE ===");
            System.out.println("1. Agregar rutina");
            System.out.println("2. Buscar por código");
            System.out.println("3. Listar todas");
            System.out.println("4. Filtrar por duración");
            System.out.println("5. Estadísticas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregar(gestor, sc);
                case 2 -> buscar(gestor, sc);
                case 3 -> listar(gestor);
                case 4 -> filtrar(gestor, sc);
                case 5 -> estadisticas(gestor);
                case 0 -> System.out.println("Hasta luego");
            }

        } while (opcion != 0);
    }

    private static void agregar(GestorFitZone gestor, Scanner sc) {
        System.out.print("Código: ");
        String c = sc.nextLine();
        System.out.print("Nombre: ");
        String n = sc.nextLine();
        System.out.print("Duración (min): ");
        int d = sc.nextInt();
        sc.nextLine();

        Rutina r = new Rutina(c, n, d);
        gestor.agregarRutina(r);

        System.out.println("✔ Rutina agregada.");
    }

    private static void buscar(GestorFitZone gestor, Scanner sc) {
        System.out.print("Código: ");
        String c = sc.nextLine();

        Rutina r = gestor.buscarPorCodigo(c);
        System.out.println(r != null ? r : "No encontrada.");
    }

    private static void listar(GestorFitZone gestor) {
        System.out.println("\n--- Rutinas ---");
        System.out.println("Total: " + gestor.cantidad());
    }

    private static void filtrar(GestorFitZone gestor, Scanner sc) {
        System.out.print("Mínimo: ");
        int min = sc.nextInt();
        System.out.print("Máximo: ");
        int max = sc.nextInt();
        sc.nextLine();

        List<Rutina> res = gestor.filtrarPorDuracion(min, max);

        System.out.println("\n--- Resultados ---");
        res.forEach(System.out::println);
    }

    private static void estadisticas(GestorFitZone gestor) {
        System.out.println("\nTotal minutos: " + gestor.totalMinutos());
        System.out.println("Promedio duración: " + gestor.promedioDuracion());
        System.out.println("Rutina más larga: " + gestor.rutinaMasLarga());

        System.out.println("\nConteo por nivel:");
        gestor.contarPorNivel().forEach((k,v)-> System.out.println(k + ": " + v));
    }
}