package co.edu.sena.semanas.semana03;

public class Miembro {
  private String nombreCompleto;
  private int edad;
  private double peso;
  private String email;
  private boolean membresiaActiva;
  private int sesionesRestantes;

  public Miembro(String nombreCompleto, int edad, double peso, String email,
                 boolean membresiaActiva, int sesionesRestantes) {

    setNombreCompleto(nombreCompleto);
    setEdad(edad);
    setPeso(peso);
    setEmail(email);
    setMembresiaActiva(membresiaActiva);
    setSesionesRestantes(sesionesRestantes);
  }

  public Miembro(String nombreCompleto, int edad, double peso, String email) {
    setNombreCompleto(nombreCompleto);
    setEdad(edad);
    setPeso(peso);
    setEmail(email);
    this.membresiaActiva = false;
    this.sesionesRestantes = 0;
  }

  public void imprimirInfo() {
    System.out.println("~~~~ Información del co.edu.sena.semanas.semana03.Miembro ~~~~");
    System.out.println("Nombre: " + nombreCompleto);
    System.out.println("Edad: " + edad);
    System.out.println("Peso: " + peso + " kg");
    System.out.println("Email: " + email);
    System.out.println("Membresía activa: " + (membresiaActiva ? "Sí" : "No"));
    System.out.println("Sesiones restantes: " + sesionesRestantes);
  }

  public double calcularIMC(double estaturaMetros) {
    if (estaturaMetros <= 0 || estaturaMetros > 2.7) {
      throw new IllegalArgumentException("La estatura debe estar entre 0 y 2.7 metros.");
    }
    return peso / (estaturaMetros * estaturaMetros);
  }

  // Getters
  public String getNombreCompleto() { return nombreCompleto; }
  public int getEdad() { return edad; }
  public double getPeso() { return peso; }
  public String getEmail() { return email; }
  public boolean isMembresiaActiva() { return membresiaActiva; }
  public int getSesionesRestantes() { return sesionesRestantes; }

  // Setters con validaciones
  public void setNombreCompleto(String nombreCompleto) {
    validarString(nombreCompleto, "Nombre completo");
    this.nombreCompleto = nombreCompleto;
  }

  public void setEdad(int edad) {
    validarPositivo(edad, "Edad");
    if (edad > 120) throw new IllegalArgumentException("Edad no puede ser mayor a 120.");
    this.edad = edad;
  }

  public void setPeso(double peso) {
    validarPositivo(peso, "Peso");
    if (peso > 500) throw new IllegalArgumentException("Peso no puede superar los 500 kg.");
    this.peso = peso;
  }

  public void setEmail(String email) {
    validarString(email, "Email");
    if (!email.contains("@") || !email.contains(".")) {
      throw new IllegalArgumentException("Formato de correo inválido.");
    }
    this.email = email;
  }

  public void setMembresiaActiva(boolean membresiaActiva) {
    this.membresiaActiva = membresiaActiva;
  }

  public void setSesionesRestantes(int sesionesRestantes) {
    if (sesionesRestantes < 0 || sesionesRestantes > 999) {
      throw new IllegalArgumentException("Las sesiones deben estar entre 0 y 999.");
    }
    this.sesionesRestantes = sesionesRestantes;
  }

  private void validarString(String texto, String campo) {
    if (texto == null || texto.isBlank()) {
      throw new IllegalArgumentException(campo + " no puede estar vacío.");
    }
  }

  private void validarPositivo(double numero, String campo) {
    if (numero <= 0) {
      throw new IllegalArgumentException(campo + " debe ser un número positivo.");
    }
  }

  public String getNombre() {
    return nombreCompleto;
  }
}
