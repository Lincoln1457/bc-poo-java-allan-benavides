package co.edu.sena.semanas.proyecto_final.com.fitzone.modelo;

public class Entrenador extends Persona {

    private String especialidad;

    public Entrenador(String nombre, int edad, String documento, String especialidad) {
        super(nombre, edad, documento);
        this.especialidad = especialidad;
    }

    @Override
    public String getDescripcion() {
        return "Entrenador: " + getNombre() + " | Especialidad: " + especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
