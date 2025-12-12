package co.edu.sena.semanas.semana08.com.fitzone.modelo;

public class Miembro {
    private String id;
    private String nombre;
    private String email;
    private String telefono;

    public Miembro(String id, String nombre, String email, String telefono) {
        validarString(id, "ID");
        validarString(nombre, "Nombre");
        validarEmail(email);
        validarTelefono(telefono);

        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public Miembro(String id, String nombre) {
        this(id, nombre, "correo@ejemplo.com", "0000000000");
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }

    public void setEmail(String email) {
        validarEmail(email);
        this.email = email;
    }

    public void setTelefono(String telefono) {
        validarTelefono(telefono);
        this.telefono = telefono;
    }

    private void validarString(String v, String campo) {
        if (v == null || v.isBlank()) throw new IllegalArgumentException(campo + " no puede ser vacío.");
    }

    private void validarEmail(String email) {
        if (!email.contains("@")) throw new IllegalArgumentException("Email inválido.");
    }

    private void validarTelefono(String tel) {
        if (tel.length() < 7) throw new IllegalArgumentException("Teléfono inválido.");
    }

    @Override
    public String toString() {
        return nombre + " (" + id + ")";
    }
}
