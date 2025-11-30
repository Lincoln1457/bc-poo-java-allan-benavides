public class Miembro {

  // Atributos
  private String nombreCompleto;   // String
  private int edad;                // int
  private double peso;             // double
  private boolean membresiaActiva; // boolean
  private int sesionesRestantes;   // int

  // Constructor
  public Miembro(String nombreCompleto, int edad, double peso, boolean membresiaActiva, int sesionesRestantes) {
    this.nombreCompleto = nombreCompleto;
    this.edad = edad;
    this.peso = peso;
    this.membresiaActiva = membresiaActiva;
    this.sesionesRestantes = sesionesRestantes;
  }

  // Método void que imprime información del miembro
  public void imprimirInfo() {
    System.out.println("~~~~ Información del miembro ~~~~");
    System.out.println("Nombre: " + nombreCompleto);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Peso: " + peso + " kg");
    System.out.println("Membresía activa: " + (membresiaActiva ? "Sí" : "No"));
    System.out.println("Sesiones restantes: " + sesionesRestantes);
  }

  // Método que retorna un valor calculado (IMC en este caso)
  public double calcularIMC(double estaturaMetros) {
    return peso / (estaturaMetros * estaturaMetros);
  }

  // Getter (ejemplo: obtener nombre)
  public String getNombreCompleto() {
    return nombreCompleto;
  }

  // Setter (ejemplo: modificar peso)
  public void setPeso(double peso) {
    this.peso = peso;
  }
}
