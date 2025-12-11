# Análisis de Diseño - Semana 06: Dominio FitZone

## 1. Identificación de Abstracciones

### Clase Abstracta
**Nombre:** `Actividad`

**¿Por qué es abstracta?**
- `Actividad` representa el concepto general de una actividad en el gimnasio (rutinas, clases grupales, entrenamientos), que comparte atributos y comportamiento común (nombre, duración, nivel, mostrarResumen) pero cuya ejecución concreta varía según el tipo (por ejemplo, una clase grupal o una rutina individual).
- El comportamiento que varía (cómo se ejecuta la actividad) se declara como método abstracto `ejecutar()`.

**Jerarquía:**
Actividad (abstract)
├── ClaseGrupo
└── Rutina

## 2. Interfaces Implementadas

### Interface 1: `Reservable`
**Capacidad que define:** Permitir que una entidad sea reservada (verificar disponibilidad, realizar reserva, obtener código de reserva).

**Clases que la implementan:**
- `ClaseGrupo`: tiene sentido porque las clases grupales suelen reservarse para una fecha/hora específica. Implementa verificación de cupo y generación simple de código de reserva.

### Interface 2: `Calificable`
**Capacidad que define:** Permitir que usuarios califiquen/valoren servicios o actividades (agregar calificación, obtener promedio, mostrar calificaciones).

**Clases que la implementan:**
- `ClaseGrupo`: los asistentes pueden calificar la clase.
- `Rutina`: el miembro puede calificar la rutina personalizada.

> Observación: `ClaseGrupo` implementa **múltiples interfaces** (`Reservable` y `Calificable`), mostrando la utilidad de interfaces para capacidades transversales.

## 3. Decisiones de Diseño

### ¿Por qué clase abstracta vs interface?
- **Clase abstracta (`Actividad`)**: se eligió porque hay un lazo "es-un" claro entre `Rutina` y `ClaseGrupo` y además es útil compartir estado (atributos) y métodos concretos reutilizables (`mostrarResumen`).
- **Interface (`Reservable`, `Calificable`)**: porque definen capacidades independientes que pueden aplicarse a clases no relacionadas jerárquicamente y permiten múltiples implementaciones.

## 4. Principios SOLID Aplicados

### Single Responsibility Principle (SRP)
- Cada clase tiene una responsabilidad clara: `Actividad` modela la abstracción, `ClaseGrupo` gestiona reservas/participantes/calificaciones de una clase, `Rutina` gestiona la rutina y sus calificaciones.

### Open/Closed Principle (OCP)
- Nuevas subclases de `Actividad` pueden agregarse sin modificar `Actividad`. Nuevas interfaces pueden añadirse para capacidades adicionales.

### Liskov Substitution Principle (LSP)
- Las subclases (`Rutina`, `ClaseGrupo`) pueden sustituir a `Actividad` cuando se consumes a través del tipo `Actividad` (polimorfismo), ya que implementan `ejecutar()` de forma coherente.

### Interface Segregation Principle (ISP)
- Las interfaces son específicas (`Reservable`, `Calificable`) y no fuerzan a las clases a implementar métodos innecesarios.

### Dependency Inversion Principle (DIP)
- El código de alto nivel (por ejemplo `Main`) depende de abstracciones (`Actividad`, `Reservable`, `Calificable`) más que de implementaciones concretas, facilitando pruebas y extensiones.

## 5. Mejoras Logradas

**Antes (Semana 05):**
- Clases con atributos públicos/ mal encapsulados, validaciones dispersas, y escasa reutilización de lógica.

**Después (Semana 06):**
- Encapsulación consistente, validaciones centralizadas, abstracción de actividad reutilizable, uso de interfaces para capacidades transversales, ejemplos de polimorfismo y múltiples implementaciones.

**Ventajas:**
- Código más robusto y mantenible.
- Más fácil extender el dominio (nuevas actividades, nuevos comportamientos).
- Mejor separación de responsabilidades.

## 6. Diagrama de Clases (texto simple)

<<abstract>> Actividad

nombre

duracionMinutos

nivel

mostrarResumen()

ejecutar() : abstract

/
/
ClaseGrupo Rutina
implements Reservable,Calificable implements Calificable

entrenadorNombre - entrenadorNombre

capacidad - miembroNombre

reservas - calificaciones

participantes

## 7. Desafíos y Soluciones

**Desafío 1:** Modelar tanto clases grupales (reservables) como rutinas (individuales) manteniendo comportamiento común.  
**Solución:** Crear `Actividad` abstracta para compartir estado/comportamiento y declarar `ejecutar()` abstracto.

**Desafío 2:** Necesidad de capacidades transversales (reservas, calificaciones) sin forzar jerarquía.  
**Solución:** Definir interfaces `Reservable` y `Calificable` y hacer que las clases pertinentes las implementen.

## 8. Próximos Pasos
- Agregar validaciones más robustas en formato de fecha y manejo de colisiones en reservas.
- Implementar tests unitarios (JUnit) para validar comportamiento de reservas y calificaciones.
- Crear más subclases (p. ej. `SesionPersonal` para entrenamiento 1:1 que herede `Actividad`).