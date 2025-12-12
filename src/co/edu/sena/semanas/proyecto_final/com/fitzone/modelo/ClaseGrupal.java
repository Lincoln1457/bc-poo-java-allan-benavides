package co.edu.sena.semanas.proyecto_final.com.fitzone.modelo;

import java.util.ArrayList;
import java.util.List;

public class ClaseGrupal {

    private String codigo;
    private String nombre;
    private int capacidad;
    private List<Miembro> inscritos;

    public ClaseGrupal(String codigo, String nombre, int capacidad) {
        if (capacidad <= 0)
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero");

        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.inscritos = new ArrayList<>();
    }

    public boolean agregarMiembro(Miembro m) {
        if (inscritos.size() >= capacidad)
            return false;
        return inscritos.add(m);
    }

    public int getCapacidadDisponible() {
        return capacidad - inscritos.size();
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public List<Miembro> getInscritos() { return inscritos; }
}
