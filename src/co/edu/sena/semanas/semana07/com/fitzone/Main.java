package co.edu.sena.semanas.semana07.com.fitzone;

import co.edu.sena.semanas.semana07.com.fitzone.modelo.*;
import co.edu.sena.semanas.semana07.com.fitzone.servicio.GestorFitZone;
import co.edu.sena.semanas.semana07.com.fitzone.excepciones.MembresiaVencidaException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== FITZONE - Demo Paquetes y Excepciones ===\n");

        GestorFitZone gestor = new GestorFitZone();

        Entrenador e1 = new Entrenador("Carlos Gómez", 6, "Musculación", true);
        gestor.agregarEntrenador(e1);

        System.out.println("\n--- Caso 1: Agregar miembro válido (éxito) ---");
        Miembro m1 = new Miembro("Andrés Ramírez", 28, 78.5, "andres.ramirez@example.com", true, 10);
        gestor.agregarMiembro(m1);

        System.out.println("\n--- Caso 2: Agregar miembro con email inválido (IllegalArgumentException) ---");
        try {
            Miembro mInvalido = new Miembro("Usuario X", 25, 70, "correo-invalido", true, 5);
            gestor.agregarMiembro(mInvalido);
        } catch (IllegalArgumentException ex) {
            System.err.println("❌ Excepción capturada al crear miembro: " + ex.getMessage());
        }

        System.out.println("\n--- Caso 3: Usar sesión con membresía vencida (MembresiaVencidaException) ---");
        Miembro m2 = new Miembro("Camila López", 22, 60, "camila.lopez@example.com", false, 0);
        gestor.agregarMiembro(m2);
        try {
            m2.usarSesion();
        } catch (MembresiaVencidaException ex) {
            System.err.println("❌ Membresía inválida: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("❌ Otro error: " + ex.getMessage());
        }

        System.out.println("\n--- Caso 4: Reservar en clase hasta llenarla ---");
        ClaseGrupo spinning = new ClaseGrupo("Spinning Intensivo", "07:00 AM", e1, 2); // capacidad 2
        gestor.agregarClaseGrupo(spinning);

        gestor.reservarEnClase("Spinning Intensivo", "Persona A"); // ok
        gestor.reservarEnClase("Spinning Intensivo", "Persona B"); // ok
        gestor.reservarEnClase("Spinning Intensivo", "Persona C"); // debe fallar (ClaseLlenaException)

        System.out.println("\n--- Caso 5: Recuperación después de error ---");
        try {
            Rutina rInvalida = new Rutina("Rutina Rápida", -10);
            gestor.agregarRutina(rInvalida);
        } catch (IllegalArgumentException ex) {
            System.err.println("❌ Error creando rutina: " + ex.getMessage());
            Rutina rValida = new Rutina("Rutina Express", 20);
            gestor.agregarRutina(rValida);
            System.out.println("✅ Rutina válida creada tras recuperación.");
        }

        System.out.println("\n--- Resumen final ---");
        gestor.listarEntrenadores();
        gestor.listarMiembros();
        gestor.listarRutinas();
        gestor.listarClasesGrupo();

        System.out.println("\n--- Ejemplo finally: intento leer archivo de configuración ---");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("config.txt"));
            String linea = reader.readLine();
            System.out.println("Primera línea del archivo: " + linea);
        } catch (IOException e) {
            System.err.println("⚠️  Error leyendo config.txt (archivo no encontrado u otro). Mensaje: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error cerrando reader: " + e.getMessage());
                }
            } else {
                System.out.println("No se abrió config.txt, nothing to close.");
            }
        }

        System.out.println("\n=== FIN DEMOSTRACIÓN ===");
    }
}
