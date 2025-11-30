# Análisis Orientado a Objetos - Gimnacio FitZone

## 1. Identificación del Dominio

**Nombre del negocio:** FitZone
**Tipo:** Gimnacio para entrenar el físico.
**Descripción:** FitZone es un gimnasio moderno que ofrece entrenamiento personalizado, clases grupales (spinning, yoga, crossfit), área de musculación y cardio. Cuenta con 12 entrenadores certificados y atiende aproximadamente 200 miembros diarios.

## 2. Objetos Identificados

### Objeto Principal: Mienbro
**¿Qué es?:** Una persona inscrita en el gimnasio que utiliza este para entrenar y mejorar su figura y su estado de ánimo.
**Atributos identificados:**
- nombreCompleto: String – Nombre del miembro para identificación.
- edad: int – Edad del miembro, útil para planes de entrenamiento.
- email: String - - Correo electrónico de contacto del miembro, para notificar cualquier novedad.
- peso: double – Peso actual del miembro, usado para cálculo de IMC.
- membresiaActiva: boolean – Indica si el miembro tiene acceso vigente.
- sesionesRestantes: int – Número de sesiones disponibles de entrenamiento.

**Métodos identificados:**
- imprimirInfo(): Muestra toda la información del miembro en pantalla.
- calcularIMC(): Calcula y retorna el índice de masa corporal del miembro.
- getNombreCompleto(): Retorna el nombre del miembro.
- setPeso(): Actualiza el peso del miembro.

### Objeto Secundario: Entrenador
**¿Qué es?:** Persona experta tanto en las máquinas como en ejercicios varios que, dependiendo de lo que se le solicite, instruye con respecto a lo que se desee hacer.
**Atributos identificados:**
- nombre: String – Nombre del entrenador.
- experienciaAnios: int – Años de experiencia profesional.
- especialidad: String – Tipo de entrenamiento que domina (yoga, musculación, etc.)
- disponible: boolean – Estado de disponibilidad para atender miembros.

**Métodos identificados:**
- imprimirInfo(): Muestra la información relevante del entrenador.
- nivelEntrenador(): Retorna un nivel (Junior, Intermedio, Senior) basado en la experiencia.
- cambiarDisponibilidad(): Cambia el estado de disponibilidad del entrenador.

## 3. Relación entre Objetos

**Tipo de relación:** Asociación (conceptual)
**Descripción:** El Miembro interactúa con varios entrenadores para recibir asesoría y rutinas especializadas. Aunque en el código no se modeló una relación directa para mantener simpleza, en el dominio real un Miembro podría tener un Entrenador asignado.

Ejemplo: "Un Miembro puede recibir entrenamiento por parte de un Entrenador. El entrenador utiliza datos del miembro para planificar la rutina."

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**
Son dos cosas indispensables que debe de tener un gimnacio para funcionar porque sin una persona que se quiera ver mejor no va a haber una persona que desee explicar el cómo verse mejor para la vida e instruir al respecto.

**¿Por qué estos atributos son importantes?**
- Nombre, edad, peso y membresía permiten administrar la información del miembro.
- Especialidad, experiencia y disponibilidad permiten gestionar los servicios del entrenador.
- Las sesiones y el estado activo de la membresía permiten operatividad real del gimnasio.

**¿Por qué estos métodos son necesarios?**
- Los métodos de impresión permiten mostrar información al usuario.
- Los métodos para cálcular, como IMC o niveles de entrenador, pueden darnos datos útules.
- Getters y setters permiten manipular y consultar datos de forma controlada.

## 5. Comparación: POO vs Programación Estructurada

**Sin POO (Estructurado):**
Se podrían guardar todos los datos que se puedan utilizar más adelante en variables como nombre, edad, peso, etcétera, lo que conllevaría a más inconveniente, puesto que habría que guardar todo por medio de variables que haría más difícil el administrarlos y se podrían llamar adelante para ser usados según el contexto que sea necesario.

**Con POO:**
Como todo se basa en objetos de la vida real se pueden crear las clases y los datos se pueden registrar de manera más óptima que, también, se puede encapsular junto con los métodos para lograr el fin que se busca.

**Ventajas específicas en mi dominio:**
1. Permite gestionar cientos de miembros con objetos independientes.
2. acilita la asignación de entrenadores y rutinas personalizadas.
3. Provee estructura para crecer hacia un software completo (reservas, pagos, historial).

## 6. Diagrama de Clases
    +-------------------------------+    +-------------------------------+
    |         Miembro               |    |        Entrenador             |
    +-------------------------------+    +-------------------------------+
    | - nombreCompleto: String      |    | - nombre: String              |
    | - edad: int                   |    | - experienciaAnios: int       |
    | - peso: double                |    | - especialidad: String        |
    | - membresiaActiva: boolean    |    | - disponible: boolean         |
    | - sesionesRestantes: int      |    +-------------------------------+
    +-------------------------------+    | + imprimirInfo(): void        |
    | + imprimirInfo(): void        |    | + nivelEntrenador(): String   |
    | + calcularIMC: double         |    | + cambiarDisponibilidad: void |
    | + getNombreCompleto(): String |    | + getNombre(): String         |
    | + setPeso: void               |    | + setEspecialidad(): void     |
    +-------------------------------+    +-------------------------------+