package co.edu.sena.semanas.proyecto_final.com.fitzone.modelo;

public abstract class Persona {
    private String nombre;
    private int edad;
    private String documento;

    public Persona(String nombre, int edad, String documento) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre no puede estar vacío");

        if (edad < 12)
            throw new IllegalArgumentException("La edad mínima es 12 años");

        if (documento == null || documento.isBlank())
            throw new IllegalArgumentException("Documento inválido");

        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getDocumento() { return documento; }

    public abstract String getDescripcion();
}
