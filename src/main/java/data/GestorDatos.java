package data;

import model.CentroCultivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<CentroCultivo> leerCentrosCultivo(String ruta) {
        ArrayList<CentroCultivo> centros = new ArrayList<>();
        File archivo = new File(ruta);

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int lineaNumero = 0;
            while ((linea = br.readLine()) != null) {
                lineaNumero++;

                String[] partes = linea.split(";");
                if (partes.length < 3) {
                    System.out.println("Linea " + lineaNumero + " con formato inválido: " + linea);
                    continue; // salta línea con formato inválido
                }

                String nombre = partes[0].trim();
                String comuna = partes[1].trim();
                double toneladas = Double.parseDouble(partes[2].trim());

                CentroCultivo centro = new CentroCultivo(nombre, comuna, toneladas);
                centros.add(centro);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }

        return centros;
    }
}
