package co.edu.sena.semanas.semana07.com.fitzone.modelo;

import co.edu.sena.semanas.semana07.com.fitzone.excepciones.MembresiaVencidaException;

public class Miembro {

    private String nombreCompleto;
    private int edad;
    private double peso;
    private String email;
    private boolean membresiaActiva;
    private int sesionesRestantes;

    public Miembro(String nombreCompleto, int edad, double peso, String email, boolean membresiaActiva, int sesionesRestantes) {
        setNombreCompleto(nombreCompleto);
        setEdad(edad);
        setPeso(peso);
        setEmail(email);
        setMembresiaActiva(membresiaActiva);
        setSesionesRestantes(sesionesRestantes);
    }

    public Miembro(String nombreCompleto, String email) {
        setNombreCompleto(nombreCompleto);
        setEmail(email);
        this.edad = 18;
        this.peso = 70;
        this.membresiaActiva = true;
        this.sesionesRestantes = 5;
    }
    public String getNombreCompleto() { return nombreCompleto; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public String getEmail() { return email; }
    public boolean isMembresiaActiva() { return membresiaActiva; }
    public int getSesionesRestantes() { return sesionesRestantes; }

    public void setNombreCompleto(String nombreCompleto) {
        if (!textoValido(nombreCompleto)) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombreCompleto = nombreCompleto.trim();
    }

    public void setEdad(int edad) {
        if (edad < 12 || edad > 100) {
            throw new IllegalArgumentException("La edad debe estar entre 12 y 100 años.");
        }
        this.edad = edad;
    }

    public void setPeso(double peso) {
        if (peso < 20 || peso > 500) {
            throw new IllegalArgumentException("El peso debe estar entre 20 y 500 kg.");
        }
        this.peso = peso;
    }

    public void setEmail(String email) {
        if (!emailValido(email)) {
            throw new IllegalArgumentException("El email tiene formato inválido.");
        }
        this.email = email.trim().toLowerCase();
    }

    public void setMembresiaActiva(boolean membresiaActiva) {
        this.membresiaActiva = membresiaActiva;
    }

    public void setSesionesRestantes(int sesionesRestantes) {
        if (sesionesRestantes < 0) {
            throw new IllegalArgumentException("Las sesiones restantes no pueden ser negativas.");
        }
        this.sesionesRestantes = sesionesRestantes;
    }

    public void usarSesion() throws MembresiaVencidaException {
        if (!membresiaActiva) {
            throw new MembresiaVencidaException("Membresía vencida para: " + nombreCompleto);
        }
        if (sesionesRestantes <= 0) {
            throw new IllegalStateException("No hay sesiones restantes.");
        }
        sesionesRestantes--;
    }

    private boolean textoValido(String s) {
        return s != null && !s.trim().isEmpty();
    }

    private boolean emailValido(String email) {
        if (email == null) return false;
        return email.matches("^[\\w\\.-]+@[\\w\\.-]+\\.\\w+$");
    }

    @Override
    public String toString() {
        return nombreCompleto + " (edad: " + edad + ", email: " + email + ", membresía: " + (membresiaActiva ? "activa" : "inactiva") + ")";
    }
}
