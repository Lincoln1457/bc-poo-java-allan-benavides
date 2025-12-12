package co.edu.sena.semanas.proyecto_final.com.fitzone.modelo;

public class Miembro extends Persona {

    private String plan;

    public Miembro(String nombre, int edad, String documento, String plan) {
        super(nombre, edad, documento);
        this.plan = plan;
    }

    @Override
    public String getDescripcion() {
        return "Miembro: " + getNombre() + " | Plan: " + plan;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}
