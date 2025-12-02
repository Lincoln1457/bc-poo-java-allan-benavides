package co.edu.sena.semana02;

public class Main {
  public static void main(String[] args) {
    Miembro miembro1 = new Miembro("Anderson Chala", 25, 75.5, "andylindo@gmail.com", false, 2);
    Miembro miembro2 = new Miembro("Ana Torres", 34, 62.0, "anrrez@gmail.com", true, 27);

    Entrenador entrenador1 = new Entrenador("Laura Gómez", 6, "Musculación", true);
    Entrenador entrenador2 = new Entrenador("Julián Rojas", 1, "Yoga", false);

    System.out.println("\n~~~~~~~~ INFORMACIÓN DE MIEMBROS ~~~~~~~~");
    System.out.println("Primer miembro:");
    miembro1.imprimirInfo();

    System.out.println("\nSegundo miembro:");
    miembro2.imprimirInfo();

    System.out.println("\nIMC de " + miembro1.getNombreCompleto() + ": " + miembro1.calcularIMC(1.73));
    System.out.println("IMC de " + miembro2.getNombreCompleto() + ": " + miembro2.calcularIMC(1.61));

    miembro1.setPeso(78.0);
    System.out.println("\nNuevo IMC de " + miembro1.getNombreCompleto() + " tras actualizar el peso: " + miembro1.calcularIMC(1.73));

    System.out.println("\n~~~~~~~~ INFORMACIÓN DE ENTRENADORES ~~~~~~~~");
    entrenador1.imprimirInfo();
    entrenador2.imprimirInfo();

    System.out.println("\nNivel de entrenador " + entrenador1.getNombre() + ": " + entrenador1.nivelEntrenador());
    System.out.println("Nivel de entrenador " + entrenador2.getNombre() + ": " + entrenador2.nivelEntrenador());

    entrenador2.setEspecialidad("Entrenamiento Funcional");
    entrenador2.cambiarDisponibilidad(true);

    System.out.println("\nInformación actualizada del entrenador 2:");
    entrenador2.imprimirInfo();

    Rutina rutina1 = new Rutina("Rutina de Fuerza", 45, "Intermedio", entrenador1, miembro1);
    Rutina rutina2 = new Rutina("Yoga Relajante", 30, "Básico", entrenador2, miembro2);

    rutina1.mostrarRutina();
    rutina2.mostrarRutina();

    ClaseGrupo clase1 = new ClaseGrupo("Spinning", "6:00 AM", entrenador1);
    clase1.setParticipante(miembro1);
    clase1.setRutinaAsignada(rutina1);

    ClaseGrupo clase2 = new ClaseGrupo("CrossFit", "7:00 AM", entrenador2);
    clase2.setParticipante(miembro2);
    clase2.setRutinaAsignada(rutina2);

    System.out.println("\n~~~~~~~~ INFORMACIÓN DE CLASES GRUPALES ~~~~~~~~");
    clase1.mostrarClase();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    clase2.mostrarClase();

    GestorFitZone gestor = new GestorFitZone();

    gestor.agregarMiembro(miembro1);
    gestor.agregarMiembro(miembro2);

    gestor.agregarEntrenador(entrenador1);
    gestor.agregarEntrenador(entrenador2);

    gestor.agregarRutina(rutina1);
    gestor.agregarRutina(rutina2);

    gestor.agregarClaseGrupo(clase1);
    gestor.agregarClaseGrupo(clase2);

    System.out.println("\n~~~~~~~~ RESUMEN GENERAL DEL GIMNASIO ~~~~~~~~");
    gestor.mostrarResumenGeneral();
  }
}
