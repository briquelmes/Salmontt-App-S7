![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Semana 7 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Benjamin Antonio Riquelme Salgado
- **Sección:** 002A
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema


Este proyecto corresponde a una aplicación interna de la empresa **Salmontt**, dedicada a la producción, procesamiento y exportación de salmón en Chile.
Esta versión del sistema tiene agregada la funcionalidad de poder visualizar las unidades operativas de la empresa según la información que se tenga (almacenamiento en una colección dinámica del tipo ArrayList).

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── main/
    ├── java/
    │   ├── data/         # Lector de archivo txt y creación de objetos (GestorDatos), repositorio de personas (Persona Repositorio) y repositorio de unidades operativas (GestorUnidades)
    │   ├── model/        # Clases de dominio (Persona, Direccion, Empleado, Jefe, Empresa, CentroCultivo, Unidad Operativa, PlantaProceso)
    │   ├── service/      # Clase que gestiona la lógica de las personas/entidades (PersonaServicio)
    │   └── ui/           # Clase principal con el método main
    └── resources/
        └── centros.txt   # Archivo con datos de centros separados por ';'

````

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/briquelmes/Salmontt-App-S7.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica la estructura de paquetes.

4. Ejecuta el archivo `Main.java` desde el paquete `ui`.

5. La consola mostrará un menú para acceder a la gestión/visualización de los datos del sistema.


---

**Repositorio GitHub:** https://github.com/briquelmes/Salmontt-App-S7
**Fecha de entrega:** 08/12/2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Semana 7
