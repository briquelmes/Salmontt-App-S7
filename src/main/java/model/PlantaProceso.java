package model;

public class PlantaProceso extends UnidadOperativa {
    private String tipoProceso;
    private double capacidadToneladas;

    public PlantaProceso(String nombre, String comuna, String tipoProceso, double capacidadToneladas) {
        super(nombre, comuna);
        this.tipoProceso = tipoProceso;
        this.capacidadToneladas = capacidadToneladas;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Planta de Proceso: " + nombre);
        System.out.println("Comuna: " + comuna);
        System.out.println("Tipo de proceso: " + tipoProceso);
        System.out.println("Capacidad (t): " + capacidadToneladas);
        System.out.println("-------------------------------");
    }
}
