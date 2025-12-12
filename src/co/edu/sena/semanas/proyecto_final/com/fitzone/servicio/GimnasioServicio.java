package co.edu.sena.semanas.proyecto_final.com.fitzone.servicio;

import co.edu.sena.semanas.proyecto_final.com.fitzone.excepciones.ClaseLlenaException;
import co.edu.sena.semanas.proyecto_final.com.fitzone.excepciones.MiembroNoEncontradoException;
import co.edu.sena.semanas.proyecto_final.com.fitzone.modelo.*;

import java.time.LocalDate;
import java.util.*;

public class GimnasioServicio {
    private Map<String, Miembro> miembros = new HashMap<>();
    private Map<String, ClaseGrupal> clases = new HashMap<>();
    private List<Reserva> reservas = new ArrayList<>();

    public void agregarMiembro(Miembro m) {
        miembros.put(m.getDocumento(), m);
    }

    public Miembro buscarMiembro(String documento) throws MiembroNoEncontradoException {
        Miembro m = miembros.get(documento);
        if (m == null)
            throw new MiembroNoEncontradoException("Miembro no encontrado: " + documento);
        return m;
    }

    public void eliminarMiembro(String documento) throws MiembroNoEncontradoException {
        if (!miembros.containsKey(documento))
            throw new MiembroNoEncontradoException("No existe el miembro");
        miembros.remove(documento);
    }

    public Collection<Miembro> listarMiembros() {
        return miembros.values();
    }

    public void agregarClase(ClaseGrupal c) {
        clases.put(c.getCodigo(), c);
    }

    public ClaseGrupal buscarClase(String codigo) {
        return clases.get(codigo);
    }

    public Collection<ClaseGrupal> listarClases() {
        return clases.values();
    }

    public void reservar(String codigoReserva, String docMiembro, String codClase)
            throws MiembroNoEncontradoException, ClaseLlenaException {

        Miembro m = buscarMiembro(docMiembro);
        ClaseGrupal clase = buscarClase(codClase);

        if (clase.getCapacidadDisponible() == 0)
            throw new ClaseLlenaException("La clase no tiene cupos disponibles");

        clase.agregarMiembro(m);

        reservas.add(new Reserva(codigoReserva, m, clase, LocalDate.now()));
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }

    public List<Reserva> filtrarReservasPorFecha(LocalDate fecha) {
        List<Reserva> lista = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getFecha().equals(fecha))
                lista.add(r);
        }
        return lista;
    }

    public List<ClaseGrupal> filtrarClasesConCupos() {
        List<ClaseGrupal> lista = new ArrayList<>();
        for (ClaseGrupal c : clases.values()) {
            if (c.getCapacidadDisponible() > 0)
                lista.add(c);
        }
        return lista;
    }

    public int totalReservas() {
        return reservas.size();
    }

    public double promedioMiembrosPorClase() {
        if (clases.isEmpty()) return 0;

        double total = 0;
        for (ClaseGrupal c : clases.values()) {
            total += c.getInscritos().size();
        }
        return total / clases.size();
    }
}
