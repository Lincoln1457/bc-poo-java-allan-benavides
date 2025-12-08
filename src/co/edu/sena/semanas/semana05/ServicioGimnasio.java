package co.edu.sena.semanas.semana05;

public class ServicioGimnasio {

  public void registrarIngreso(Persona persona) {
    System.out.println("Registrando ingreso...");
    persona.saludar();
  }

  public void mostrarFicha(Persona persona) {
    System.out.println("~~~~~~~ Ficha de Registro ~~~~~~~");
    System.out.println(persona.mostrarInfo());
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

  public void realizarInteraccion(Persona persona) {
    System.out.println("\nInteracción con el usuario…");
    persona.saludar();
  }
}
