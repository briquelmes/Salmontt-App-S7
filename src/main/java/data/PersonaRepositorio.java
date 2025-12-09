package data;

import model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaRepositorio {
    private List<Persona> personas;

    public PersonaRepositorio() {
        personas = new ArrayList<>();
    }

    public void agregar(Persona persona) {
        personas.add(persona);
    }

    public List<Persona> obtenerTodas() {
        return personas;
    }


}
