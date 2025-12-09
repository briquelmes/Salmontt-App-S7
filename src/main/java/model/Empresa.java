package model;

import data.PersonaRepositorio;

public class Empresa {
    private String nombre;
    private Direccion direccion;
    private PersonaRepositorio personaRepositorio;

    public Empresa(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public PersonaRepositorio getPersonaRepositorio() {
        return personaRepositorio;
    }

    @Override
    public String toString() {
        return "Empresa: " + nombre + "\n Dirección:" + direccion.toString() + "\n - Total personas: " + personaRepositorio.obtenerTodas().size();
    }
}
