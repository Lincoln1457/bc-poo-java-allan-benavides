package co.edu.sena.semanas.semana05;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Persona> personas = new ArrayList<>();

    personas.add(new Entrenador("Carlos Pérez", "E101", "Crossfit"));
    personas.add(new Miembro("Ana Torres", "M202", "Premium"));
    personas.add(new Entrenador("Luisa Gómez", "E303", "Yoga"));
    personas.add(new Miembro("Daniel Ruiz", "M404", "Básica"));

    System.out.println("\n~~~~~~~ MUESTRA DE POLIMORFISMO ~~~~~~~\n");

    for (Persona p : personas) {
      p.saludar();
      System.out.println(p.mostrarInfo());
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    ServicioGimnasio servicio = new ServicioGimnasio();

    System.out.println("\n~~~~~~~ REGISTRO DE INGRESOS ~~~~~~~\n");
    for (Persona p : personas) {
      servicio.registrarIngreso(p);  // polimórfico
    }

    System.out.println("\n~~~~~~~ FICHAS GENERALES ~~~~~~~\n");
    for (Persona p : personas) {
      servicio.mostrarFicha(p);       // polimórfico
    }
  }
}
