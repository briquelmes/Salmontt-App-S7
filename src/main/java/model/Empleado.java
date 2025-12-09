package model;

public class Empleado extends Persona {

    private String cargo;
    private String departamento;

    public Empleado(String nombre, String rut, int edad, String apellidoPaterno, String apellidoMaterno,
                    String telefono, String correoElectronico, Direccion direccion, int salario,
                    String cargo, String departamento) {
        super(nombre, rut, edad, apellidoPaterno, apellidoMaterno, telefono, correoElectronico, direccion, salario);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n  Rol: Empleado" +
                "\n  Cargo: " + cargo +
                "\n  Departamento: " + departamento;
    }
}
