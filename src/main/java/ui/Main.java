package ui;

import data.GestorDatos;
import data.PersonaRepositorio;
import data.GestorUnidades;
import model.*;
import service.PersonaServicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion = 0;
        boolean salir = false;
        while(!salir) {
            System.out.println("--- SISTEMA SALMONTT ---");
            System.out.println("1) Gestión de personal y entidades");
            System.out.println("2) Gestión de datos");
            System.out.println("3) Gestión de unidades operativas");
            System.out.println("3) Salir");
            if(sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        cargaEntidades();
                        break;
                    case 2:
                        cargaDatos();
                        break;
                    case 3:
                        cargaUnidadesOperativas();
                    case 4:
                        System.out.println("Salida con éxito.");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } else {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                sc.nextLine(); // Consumir entrada invalida
            }
        }
    }

    public static void cargaUnidadesOperativas() {
        GestorUnidades gestor = new GestorUnidades();
        gestor.cargarUnidades();
        gestor.mostrarUnidades();
    }

    public static void cargaEntidades() {
        Direccion dir1 = new Direccion("Av. Los Salmones 501", "Puerto Montt", "Los Lagos");
        Direccion dir2 = new Direccion("Calle Mar Azul 103","Puerto Varas", "Los Lagos");
        Direccion dir3 = new Direccion("Pasaje Río Claro 51","Castro", "Chiloé");
        Direccion dir4 = new Direccion("Av. Pedro Aguirre Cerda 21","Puerto Montt", "Los Lagos");

        Empleado emp1 = new Empleado("Carlos", "22.333.444-5", 32, "Pérez", "Rojas",
                "987654321", "carlos@salmontt.cl", dir1, 1200000, "Operador", "Producción");
        Empleado emp2 = new Empleado("Lucía", "15.222.111-0", 29, "Fernández", "Díaz",
                "912345678", "lucia@salmontt.cl", dir2, 1150000, "Analista", "Calidad");

        Jefe jefe = new Jefe("María", "12.345.678-9", 45, "Gómez", "López",
                "987654321", "maria@salmontt.cl", dir3, 2500000, "Producción");

        Empresa salmontt = new Empresa("Salmontt", dir4);

        PersonaRepositorio personaRepositorio = new PersonaRepositorio();
        PersonaServicio personaServicio = new PersonaServicio(personaRepositorio);

        jefe.agregarSubordinado(emp1);
        jefe.agregarSubordinado(emp2);

        personaServicio.registrarPersona(emp1);
        personaServicio.registrarPersona(emp2);
        personaServicio.registrarPersona(jefe);

        personaServicio.listarPersonas();
    }

    public static void cargaDatos() {
        // CARGA DE DATOS
        String rutaArchivo = "src/main/resources/centros.txt";
        GestorDatos gestor = new GestorDatos();
        ArrayList<CentroCultivo> centros = gestor.leerCentrosCultivo(rutaArchivo);

        System.out.println("=== Centros de Cultivo cargados ===");
        for (CentroCultivo c : centros) {
            System.out.println(c);
        }

        double filtroToneladas = 1250.0;
        System.out.println("\n--- Centros con producción mayor a " + filtroToneladas + " toneladas ---");
        boolean encontrados = false;
        for (CentroCultivo c : centros) {
            if (c.getToneladas() > filtroToneladas) {
                System.out.println(c);
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron centros con producción mayor a " + filtroToneladas);
        }

        String comunaBuscar = "PuertoMontt";
        System.out.println("\n=== Buscando centros en comuna " + comunaBuscar + " ===");
        System.out.println("Encontrados:");
        CentroCultivo encontrado = null;
        for (CentroCultivo c : centros) {
            if (c.getComuna().equalsIgnoreCase(comunaBuscar)) {
                encontrado = c;
                break;
            }
        }
        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontraron centros en esa comuna.");
        }

    }


}