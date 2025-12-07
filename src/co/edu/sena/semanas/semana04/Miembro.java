package co.edu.sena.semanas.semana04;

public class Miembro extends Persona {
  private double peso;
  private boolean activo;
  private int sesionesRestantes;

  public Miembro(String nombre, int edad, String email, double peso, boolean activo, int sesionesRestantes) {
    super(nombre, edad, email);
    validarPeso(peso);
    validarSesiones(sesionesRestantes);

    this.peso = peso;
    this.activo = activo;
    this.sesionesRestantes = sesionesRestantes;
  }

  public Miembro(String nombre, int edad, String email) {
    super(nombre, edad, email);
    this.peso = 70.0;
    this.activo = true;
    this.sesionesRestantes = 0;
  }

  public double calcularIMC(double estaturaMetros) {
    if (estaturaMetros <= 0) {
      throw new IllegalArgumentException("La estatura debe ser mayor a 0.");
    }
    return peso / (estaturaMetros * estaturaMetros);
  }

  public void imprimirInfoMiembro() {
    imprimirDatosPersonales(); // heredado
    System.out.println("Peso: " + peso + " kg");
    System.out.println("Activo: " + (activo ? "Sí" : "No"));
    System.out.println("Sesiones restantes: " + sesionesRestantes);
  }

  public void setPeso(double peso) {
    validarPeso(peso);
    this.peso = peso;
  }

  public void setSesionesRestantes(int sesionesRestantes) {
    validarSesiones(sesionesRestantes);
    this.sesionesRestantes = sesionesRestantes;
  }

  private void validarPeso(double peso) {
    if (peso <= 0) {
      throw new IllegalArgumentException("El peso debe ser mayor a 0.");
    }
  }

  private void validarSesiones(int sesiones) {
    if (sesiones < 0) {
      throw new IllegalArgumentException("Las sesiones no pueden ser negativas.");
    }
  }
}