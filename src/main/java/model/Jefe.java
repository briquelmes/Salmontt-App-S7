package model;

import java.util.ArrayList;
import java.util.List;

public class Jefe extends Persona {
    private String areaSupervision;
    private List<Empleado> subordinados;

    public Jefe(String nombre, String rut, int edad, String apellidoPaterno, String apellidoMaterno,
                String telefono, String correoElectronico, Direccion direccion, int salario,
                String areaSupervision) {
        super(nombre, rut, edad, apellidoPaterno, apellidoMaterno, telefono, correoElectronico, direccion, salario);
        this.areaSupervision = areaSupervision;
        this.subordinados = new ArrayList<>();
    }

    public String getAreaSupervision() {
        return areaSupervision;
    }

    public void setAreaSupervision(String areaSupervision) {
        this.areaSupervision = areaSupervision;
    }

    public List<Empleado> getSubordinados() {
        return subordinados;
    }

    public void agregarSubordinado(Empleado empleado) {
        if (empleado != null && !subordinados.contains(empleado)) {
            subordinados.add(empleado);
        }
    }

    public void eliminarSubordinado(Empleado empleado) {
        subordinados.remove(empleado);
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "\n  Rol: Jefe";
        texto += "\n  Área de supervisión: " + areaSupervision;
        texto += "\n  Subordinados:\n";

        if (subordinados.isEmpty()) {
            texto += "    No tiene subordinados\n";
        } else {
            for (Empleado e : subordinados) {
                texto += "    - " + e.getNombre() + " " + e.getApellidoPaterno() +
                        " (Cargo: " + e.getCargo() + ")\n";
            }
        }
        return texto;
    }
}
