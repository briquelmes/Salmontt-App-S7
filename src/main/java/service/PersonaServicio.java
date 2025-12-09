package service;

import data.PersonaRepositorio;
import model.Persona;

import java.util.Objects;

public class PersonaServicio {
    private final PersonaRepositorio repositorioPersonas;

    public PersonaServicio(PersonaRepositorio repositorioPersonas) {
        this.repositorioPersonas = repositorioPersonas;
    }

    public boolean registrarPersona(Persona persona) {
        if (Objects.isNull(persona)) {
            throw new IllegalArgumentException("La persona no puede ser nula");
        }

        // Comprobar duplicados
        for (Persona existente : repositorioPersonas.obtenerTodas()) {
            if (existente.equals(persona)) {
                System.out.println("Registro NO creado: la persona ya existe -> " + persona);
                return false;
            }
        }

        // Lógica adicional posible: validaciones de campos (nombre, documento, etc.)
        // Si se necesita validar campos específicos, añadir comprobaciones aquí.

        repositorioPersonas.agregar(persona);
        System.out.println("Persona registrada correctamente: ");
        System.out.println(persona + "\n");
        return true;
    }

    public void listarPersonas() {
        System.out.println("Personas registradas en el sistema:");
        for (Persona p : repositorioPersonas.obtenerTodas()) {
            System.out.println("- " + p + "\n");
        }
    }
}
