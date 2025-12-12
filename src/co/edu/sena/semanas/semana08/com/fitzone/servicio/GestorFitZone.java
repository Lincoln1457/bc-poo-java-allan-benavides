package co.edu.sena.semanas.semana08.com.fitzone.servicio;

import java.util.*;
import co.edu.sena.semanas.semana08.com.fitzone.modelo.*;

public class GestorFitZone {

    private Map<String, Rutina> rutinasMap = new HashMap<>();

    private List<Rutina> rutinas = new ArrayList<>();

    private Map<String, List<Rutina>> rutinasPorMiembro = new HashMap<>();

    public void agregarRutina(Rutina r) {
        if (rutinasMap.containsKey(r.getCodigo())) {
            throw new IllegalArgumentException("Ya existe una rutina con código: " + r.getCodigo());
        }
        rutinasMap.put(r.getCodigo(), r);
        rutinas.add(r);

        if (r.getMiembro() != null) {
            rutinasPorMiembro.computeIfAbsent(r.getMiembro().getId(), k -> new ArrayList<>()).add(r);
        }
    }

    public Rutina buscarPorCodigo(String codigo) {
        return rutinasMap.get(codigo);
    }

    public boolean existe(String codigo) {
        return rutinasMap.containsKey(codigo);
    }

    public Rutina eliminar(String codigo) {
        Rutina r = rutinasMap.remove(codigo);
        if (r != null) rutinas.remove(r);
        return r;
    }

    public int cantidad() {
        return rutinas.size();
    }

    public List<Rutina> filtrarPorDuracion(int min, int max) {
        List<Rutina> res = new ArrayList<>();
        for (Rutina r : rutinas) {
            if (r.getDuracionMin() >= min && r.getDuracionMin() <= max) {
                res.add(r);
            }
        }
        return res;
    }

    public List<Rutina> obtenerPorMiembro(String idMiembro) {
        return rutinasPorMiembro.getOrDefault(idMiembro, new ArrayList<>());
    }

    public int totalMinutos() {
        int total = 0;
        for (Rutina r : rutinas) total += r.getDuracionMin();
        return total;
    }

    public double promedioDuracion() {
        if (rutinas.isEmpty()) return 0;
        return totalMinutos() / (double) rutinas.size();
    }

    public Rutina rutinaMasLarga() {
        if (rutinas.isEmpty()) return null;
        Rutina max = rutinas.get(0);
        for (Rutina r : rutinas)
            if (r.getDuracionMin() > max.getDuracionMin()) max = r;
        return max;
    }

    public Map<String, Integer> contarPorNivel() {
        Map<String, Integer> mapa = new HashMap<>();
        for (Rutina r : rutinas) {
            mapa.put(r.getNivel(), mapa.getOrDefault(r.getNivel(), 0) + 1);
        }
        return mapa;
    }
}
