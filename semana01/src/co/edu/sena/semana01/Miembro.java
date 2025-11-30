package co.edu.sena.semana01;

public class Miembro {
  private String nombreCompleto;
  private int edad;
  private double peso;
  private String email;
  private boolean membresiaActiva;
  private int sesionesRestantes;

  public Miembro(String nombreCompleto, int edad, double peso, String email, boolean membresiaActiva, int sesionesRestantes) {
    this.nombreCompleto = nombreCompleto;
    this.edad = edad;
    this.email = email;
    this.peso = peso;
    this.membresiaActiva = membresiaActiva;
    this.sesionesRestantes = sesionesRestantes;
  }

  public void imprimirInfo() {
    System.out.println("~~~~~~ Información del miembro ~~~~~~");
    System.out.println("Nombre: " + nombreCompleto);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Correo electrónico: " + email);
    System.out.println("Peso: " + peso + " kg");
    System.out.println("Membresía activa: " + (membresiaActiva ? "Sí" : "No"));
    System.out.println("Sesiones restantes: " + sesionesRestantes);
  }

  public double calcularIMC(double estaturaMetros) {
    return peso / (estaturaMetros * estaturaMetros);
  }

  public String getNombreCompleto() {
    return nombreCompleto;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }
}