package data;

import java.util.ArrayList;
import java.util.List;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

public class GestorUnidades {
    private final List<UnidadOperativa> unidades;

    public GestorUnidades() {
        this.unidades = new ArrayList<>();
    }

    public void cargarUnidades() {
        unidades.add(new CentroCultivo("Centro Norte 1", "Valparaíso", 1200.5));
        unidades.add(new PlantaProceso("Planta A01", "San Antonio", "Empaque", 300.0));
        unidades.add(new CentroCultivo("Centro Sur 1", "Puerto Montt", 850.0));
        unidades.add(new PlantaProceso("Planta B02", "Chiloe", "Empaque", 220.0));
        unidades.add(new PlantaProceso("Planta C06", "Talcahuano", "Congelado", 450.0));
    }

    public List<UnidadOperativa> obtenerUnidades() {
        return this.unidades;
    }

    public void mostrarUnidades() {
        for (UnidadOperativa u : unidades) {
            u.mostrarInformacion();
        }
    }
}
