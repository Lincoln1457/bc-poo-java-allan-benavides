# Semana 08: Colecciones y Generics - FitZone

## Información del estudiante
- **Nombre**: Allan Koll Benavides Lopez
- **Ficha**: 3228973B
- **Dominio**: Gimnasio FitZone (Centro de Acondicionamiento Físico)
- **Fecha**: 11/12/2025

## Descripción del proyecto

El proyecto corresponde al sistema de gestión del gimnasio **FitZone**, ubicado en Bogotá (Chapinero).  
El sistema administra rutinas, entrenadores, miembros y clases grupales.

**Esta semana**, el sistema fue refactorizado para reemplazar arrays por colecciones modernas de Java, implementando:
- `ArrayList<E>` para mantener listas dinámicas.
- `HashMap<K, V>` para búsquedas rápidas y eficientes.
- Métodos de filtrado y estadísticas utilizando colecciones.
- Operaciones CRUD optimizadas.

Esto permite un manejo más profesional de los datos y un mejor rendimiento general del sistema.

---

## Colecciones utilizadas

### **HashMap**
| Colección                   | Propósito                                |
|-----------------------------|------------------------------------------|
| `Map<String, Rutina>`       | Búsqueda eficiente de rutinas por código |
| `Map<String, List<Rutina>>` | Agrupar rutinas por miembro del gimnasio |

### **ArrayList**
| Colección                       | Contenido                                 |
|---------------------------------|-------------------------------------------|
| `List<Rutina>`                  | Historial completo de rutinas registradas |
| `List<Entrenador>` *(opcional)* | Lista dinámica de entrenadores            |
| `List<Miembro>` *(opcional)*    | Lista de miembros del gimnasio            |

---

## Operaciones iImplementadas

### **CRUD con Colecciones**
- Agregar rutina con validación de código único
- Buscar rutina por código en **O(1)** con `HashMap`
- Listar todas las rutinas registradas
- Eliminar rutina por código
- Actualizar información de rutina (si se requiere)

---

### **Filtrado**
- Filtrar rutinas por rango de duración (min – max)
- Filtrar por nivel de dificultad
- Filtrar por miembro asignado
- *(Opcional)* Filtrar por entrenador responsable

---

### **Estadísticas**
- Total de minutos de entrenamiento registrados
- Promedio de duración de rutinas
- Rutina más larga (máximo)
- Conteo de rutinas por nivel (`Básico`, `Intermedio`, `Avanzado`)

---

## 🚀 Cómo Ejecutar

### **Desde terminal:**
```bash
cd semana-08
javac -d bin src/com/fitzone/*/*.java src/com/fitzone/*.java
java -cp bin com.fitzone.Main
```

## Checklist de verificación ✅

### Código

1. [x] No hay arrays de objetos (usa ArrayList)
2. [x] Al menos un HashMap para búsqueda por clave
3. [x] Generics en todas las colecciones
4. [x] Sin warnings de tipos raw
5. [x] Código compila sin errores

### Funcionalidades

1. [x] CRUD completo funciona
2. [x] Búsqueda O(1) con HashMap demostrada
3. [x] Al menos 2 filtrados implementados
4. [x] Estadísticas funcionando
5. [x] Menú interactivo completo

### Documentación

1. [x] README.md completo con plantilla
2. [ ] Comentarios Javadoc en clase gestora
3. [x] Estructura de carpetas correcta

### Git

1. [x] Commit con mensaje descriptivo
2. [X] Push al repositorio remoto

