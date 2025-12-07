package co.edu.sena.semanas.semana04;

public class Persona {
  protected String nombre;
  protected int edad;
  protected String email;

  public Persona(String nombre, int edad, String email) {
    validarString(nombre, "nombre");
    validarString(email, "email");
    validarEdad(edad);

    this.nombre = nombre;
    this.edad = edad;
    this.email = email;
  }

  public void imprimirDatosPersonales() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Email: " + email);
  }

  public boolean esMayorDeEdad() {
    return edad >= 18;
  }

  private void validarString(String valor, String campo) {
    if (valor == null || valor.trim().isEmpty()) {
      throw new IllegalArgumentException("El campo " + campo + " no puede estar vacío.");
    }
  }

  private void validarEdad(int edad) {
    if (edad <= 0) {
      throw new IllegalArgumentException("La edad debe ser mayor a 0.");
    }
  }
}