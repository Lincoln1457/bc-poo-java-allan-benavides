package co.edu.sena.semanas.semana03;

public class Main {
  public static void main(String[] args) {

    GestorFitZone gestor = new GestorFitZone();


    Entrenador ent1 = new Entrenador("Carlos Pérez", 5, "CrossFit", true);
    Entrenador ent2 = new Entrenador("Ana Torres", 2, "Yoga");

    gestor.agregarEntrenador(ent1);
    gestor.agregarEntrenador(ent2);


    Miembro m1 = new Miembro("Anderson Chala", 25, 55.2, "andylindo@gmail.com");
    Miembro m2 = new Miembro("Laura Ríos", 32, 65.0, "laura@gmail.com", true, 10);

    gestor.agregarMiembro(m1);
    gestor.agregarMiembro(m2);


    Rutina r1 = new Rutina("Quema Grasa", "Intermedio", 45, ent1, m1);
    Rutina r2 = new Rutina("Flexibilidad Total","Bajo", 30, ent2, m2);

    gestor.agregarRutina(r1);
    gestor.agregarRutina(r2);


    ClaseGrupo clase1 = new ClaseGrupo(
        "Cardio Extreme",
        "8:00 AM",
        ent1
    );

    clase1.setParticipante(m1);
    clase1.setRutinaAsignada(r1);

    gestor.agregarClaseGrupo(clase1);


    ClaseGrupo clase2 = new ClaseGrupo(
        "Yoga Avanzado",
        "10:00 AM",
        ent2
    );

    clase2.setParticipante(m2);
    clase2.setRutinaAsignada(r2);

    gestor.agregarClaseGrupo(clase2);


    System.out.println("\n<<<<<<<MOSTRANDO INFORMACIÓN DETALLADA>>>>>>>\n");


    r1.mostrarRutina();
    System.out.println();
    r2.mostrarRutina();
    System.out.println();

    clase1.mostrarClase();
    System.out.println();
    clase2.mostrarClase();


    gestor.mostrarResumenGeneral();
  }
}
