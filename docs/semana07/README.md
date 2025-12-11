# Semana 07: Paquetes y Excepciones – FitZone

## 👤 Información del Estudiante
- **Nombre**: Allan Koll Benavides Lopez
- **Ficha**: 3228973B
- **Dominio**: FitZone – Sistema de Gestión de Gimnasio
- **Fecha**: 11/12/2025

---

## Descripción del proyecto

El sistema FitZone administra un gimnasio con sus **miembros**, **entrenadores**, **rutinas personalizadas**, **clases grupales** y un **gestor centralizado**.

En esta semana se implementó:

- Reorganización en paquetes  
- Encapsulación completa  
- Validaciones con excepciones estándar  
- Excepciones personalizadas  
- Main de demostración con manejo de errores

El sistema ahora es más profesional, modular y seguro ante datos inválidos.

---

## Estructura de Paquetes
```
src/
└── com/
└── fitzone/
├── modelo/
│ ├── Miembro.java
│ ├── Entrenador.java
│ ├── Rutina.java
│ └── ClaseGrupo.java
├── servicio/
│ └── GestorFitZone.java
├── excepciones/
│ ├── DatoInvalidoException.java
│ └── DisponibilidadException.java
└── Main.java
```

---

###  Descripción de cada paquete

#### modelo/
Contiene todas las entidades principales del gimnasio:
- Miembro
- Entrenador
- Rutina
- ClaseGrupo

Incluyen validaciones, encapsulación y sobrecarga de constructores.

#### servicio/
Contiene:
- `GestorFitZone`: administra miembros, rutinas, clases y entrenadores.  
  Incluye manejo de excepciones y validaciones en operaciones críticas.

#### excepciones/
Contiene excepciones personalizadas del sistema FitZone:
- `DatoInvalidoException`
- `DisponibilidadException`

#### Main.java
Demuestra el funcionamiento del sistema y cómo se manejan las excepciones.

---

## Excepciones personalizadas

### 1. DatoInvalidoException
- **Tipo:** Checked (extends Exception)
- **Cuándo se lanza:**
    - Strings vacíos
    - Valores numéricos negativos
    - Niveles no permitidos
- **Ejemplo:**
  ```
  throw new DatoInvalidoException("El nombre no puede estar vacío");
2. DisponibilidadException
   Tipo: Checked (extends Exception)

Cuándo se lanza:

Entrenador no disponible

Clase sin cupo

Rutina ya asignada

Ejemplo:

java
Copiar código
throw new DisponibilidadException("El entrenador no está disponible para esta clase");
Main – Casos Demostrados
El Main.java muestra diferentes escenarios:

### Casos exitosos:
Registro de miembros y entrenadores

Creación correcta de rutinas

Asignación válida de clases grupales

### Casos con error:
Nombre vacío → DatoInvalidoException

Duración negativa → DatoInvalidoException

Entrenador no disponible → DisponibilidadException

Clase llena → DisponibilidadException

El sistema continúa funcionando después de cada error gracias al manejo de excepciones.

### Cómo Ejecutar
Desde terminal:
bash
Copiar código
cd semana-07

javac -d bin \
src/com/fitzone/modelo/*.java \
src/com/fitzone/servicio/*.java \
src/com/fitzone/excepciones/*.java \
src/com/fitzone/Main.java

java -cp bin com.fitzone.Main

## Checklist de verificación ✅

### Estructura y Organización (25 pts)
1. [x] Estructura de carpetas coincide con la especificada
2. [x] Paquetes siguen convención (com.dominio.modulo)
3. [X] Todos los archivos tienen declaración package
4. [x] Imports organizados (específicos, no wildcards)
5. [x] Código compila sin errores
### Excepciones Personalizadas (25 pts)
1. [X] Mínimo 2 excepciones personalizadas creadas
2. [X] Nombres terminan en "Exception"
3. [x] Tipo checked (extend Exception)
4. [x] Constructores: mensaje y mensaje+causa
5. [ ] Documentadas con Javadoc
### Validaciones y Manejo (30 pts)
1. [X] Métodos críticos declaran excepciones con throws
2. [x] Se lanzan excepciones con throw cuando corresponde
3. [x] Main tiene try-catch para manejar excepciones
4. [x] Mensajes de error descriptivos
5. [x] Al menos 1 uso de finally
### Funcionalidad y Pruebas (20 pts)
1. [X] Main incluye mínimo 5 casos de prueba
2. [x] Casos cubren tanto éxitos como errores
3. [x] Programa ejecuta sin errores
4. [x] Salida es clara y comprensible
5. [x] README.md completo y detallado
