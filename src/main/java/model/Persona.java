package model;

public class Persona {
    private String nombre;
    private String rut;
    private int edad;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private String correoElectronico;
    private Direccion direccion;
    private int salario;

    public Persona(String nombre, String rut, int edad, String apellidoPaterno, String apellidoMaterno, String telefono, String correoElectronico, Direccion direccion, int salario) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  "Nombre completo: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno +
                "\n  RUT: " + rut +
                "\n  Edad: " + edad + " años" +
                "\n  Teléfono: " + telefono +
                "\n  Correo electrónico: " + correoElectronico +
                "\n  Dirección: " + direccion.toString() +
                "\n  Salario: $" + salario;
    }
}
