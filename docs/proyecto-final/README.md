# Proyecto final: Sistema de Gestión de FitZone

## Información del estudiante

| Campo       | Valor                       |
|-------------|-----------------------------|
| **Nombre**  | Allan Koll Benavides Lopez  |
| **Ficha**   | 3228973B                    |
| **Dominio** | FitZone                     |
| **Fecha**   | 12/12/2025                  |

---

## Descripción del sistema

FitZone es un sistema de gestión para un gimnasio moderno ubicado en Bogotá, especializado en entrenamiento personalizado, clases grupales (spinning, yoga, crossfit), musculación y cardio. El sistema facilita la gestión de reservas de clases, registro de miembros y seguimiento de los entrenadores. Además, ofrece una visión clara sobre las estadísticas del gimnasio, como las clases más populares, total de reservas y promedio de miembros por clase.

El sistema está diseñado para ser utilizado por entrenadores, personal administrativo y miembros del gimnasio. Los entrenadores pueden gestionar sus clases y los miembros pueden reservar las clases grupales disponibles. Los administradores pueden generar estadísticas y manejar la base de datos de miembros y clases.

---

## Arquitectura del proyecto

### Diagrama de Clases

![Diagrama de Clases](docs/proyecto-final/diagrama-clases.png)

### Estructura de Paquetes

| Paquete       | Contenido                  | Clases                                             |
|---------------|----------------------------|----------------------------------------------------|
| `modelo`      | Entidades del negocio      | Persona, Miembro, Entrenador, ClaseGrupal, Reserva |
| `servicio`    | Lógica de negocio          | GimnasioServicio, ReporteServicio                  |
| `excepciones` | Excepciones personalizadas | MiembroNoEncontradoException, ClaseLlenaException  |
| `util`        | Utilidades                 | (Opcional)                                         |

---

## Aplicación de conceptos POO

### Encapsulación
- Todos los atributos son `private`
- Validaciones implementadas:
    1. El nombre no puede ser vacío ni nulo.
    2. La edad mínima para ser miembro es 12 años.
    3. Los documentos de los miembros deben ser válidos (no vacíos ni nulos).
    4. La capacidad de las clases debe ser mayor a cero.

### Herencia

| Clase Padre  | Clases Hijas            | Atributos Heredados           |
|--------------|-------------------------|-------------------------------|
| `Persona`    | `Miembro`, `Entrenador` | `nombre`, `edad`, `documento` |

### Polimorfismo

**Sobrescritura (@Override):**
- `getDescripcion()` en `Miembro` y `Entrenador`.

**Sobrecarga (Overload):**
- Métodos de `agregarMiembro()` y `agregarClase()` en `GimnasioServicio`.

**Colecciones polimórficas:**
- `List<Persona>` contiene objetos de tipo `Miembro` y `Entrenador`.

### Abstracción

| Tipo            | Nombre                             | Implementaciones                      |
|-----------------|------------------------------------|---------------------------------------|
| Clase abstracta | `Persona`                          | `Miembro`, `Entrenador`               |
| Interface       | (Si se aplica, ejemplo: `Reserva`) | `GimnasioServicio`, `ReporteServicio` |

### Excepciones Personalizadas

| Excepción                      | Tipo    | Cuándo se lanza                                       |
|--------------------------------|---------|-------------------------------------------------------|
| `MiembroNoEncontradoException` | Checked | Cuando no se encuentra un miembro en el sistema       |
| `ClaseLlenaException`          | Checked | Cuando una clase grupal ya no tiene cupos disponibles |

### Colecciones

| Colección           | Tipo                   | Propósito                                              |
|---------------------|------------------------|--------------------------------------------------------|
| `reservasPorCodigo` | `Map<String, Reserva>` | Búsqueda O(1) por códgo de reserva                     |
| `historialReservas` | `List<Reserva>`        | Mantener las reservas realizadas en orden cronológico  |
| `clientesPorId`     | `Map<String, Cliente>` | Búsqueda O(1) por ID de cliente                        |

---

## Funcionalidades del sistema

### Menú principal
=== SISTEMA DE GESTIÓN FITZONE ===

1. Agregar miembro
2. Agregar clase grupal
3. Buscar miembro
4. Listar miembros
5. Reservar clase
6. Filtrar clases con cupos
7. Ver estadísticas
8. Listar reservas
0. Salir

### Operaciones implementadas

| Operación            | Descripción                                                  | Estado  |
|----------------------|--------------------------------------------------------------|---------|
| Agregar miembro      | Registra un nuevo miembro en el sistema                      | ✅       |
| Buscar por código    | Permite buscar miembros y clases por código único            | ✅       |
| Listar todos         | Muestra todos los miembros y clases disponibles              | ✅       |
| Actualizar           | Permite modificar información de miembros y clases           | ✅       |
| Eliminar             | Elimina miembros o clases del sistema con confirmación       | ✅       |
| Filtrar por criterio | Filtra las clases por cupos disponibles o reservas por fecha | ✅       |
| Estadísticas         | Calcula y muestra estadísticas de clases y reservas          | ✅       |

---

## Cómo ejecutar

### Requisitos
- Java JDK 11 o superior
- IDE: IntelliJ IDEA (recomendado) o VS Code

### Compilación (Terminal)

```bash
cd proyecto-final
javac -d bin src/com/fitzone/*/*.java src/com/fitzone/*.java
```

### Ejecución (Terminal)
```
java -cp bin com.fitzone.Main
```

## Checklist de verificación ✅

### Estructura
- [x] Carpeta `proyecto-final/` creada
- [x] Estructura de paquetes correcta
- [x] Archivo `Main.java` en la raíz del paquete
- [x] Carpeta `docs/` con diagrama UML

### Código
- [x] Compila sin errores
- [x] Se ejecuta correctamente
- [x] Todas las funcionalidades funcionan
- [x] Sin warnings de tipos raw

### POO (verificar presencia)
- [x] Encapsulación con validaciones
- [x] Herencia (1 padre + 2 hijos mínimo)
- [x] Polimorfismo (@Override + sobrecarga)
- [x] Abstracción (clase abstracta O interface)
- [x] Excepciones personalizadas (mínimo 2)
- [x] Colecciones (HashMap + ArrayList)

### Documentación
- [x] README.md completo
- [x] Diagrama de clases UML
- [ ] Comentarios Javadoc en clases principales

### Git
- [x] Commit con mensaje descriptivo
- [x] Push al repositorio remoto

---

## Comandos para entregar

```bash
# Navegar al repositorio
cd bc-oop-java-[ficha]-[apellido]

# Agregar proyecto final
git add proyecto-final/

# Commit
git commit -m "Proyecto Final: [Tu Dominio] - Integración completa de POO"

# Push
git push origin main
```