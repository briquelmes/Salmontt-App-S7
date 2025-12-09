package model;

public class CentroCultivo extends UnidadOperativa {
    private double toneladas;

    public CentroCultivo(String nombre, String comuna, double toneladas) {
        super(nombre, comuna);
        this.toneladas = toneladas;
    }

    public double getToneladas() {
        return toneladas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Centro de Cultivo: " + nombre);
        System.out.println("Comuna: " + comuna);
        System.out.println("Producción anual (t): " + toneladas);
        System.out.println("-------------------------------");
    }
}
