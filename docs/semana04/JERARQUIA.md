# Jerarquía de Clases - Semana 04

## Diagrama

            Persona
               |
        +------+------+
        |             |
    Miembro      Entrenador


## Justificación:
Se escogió la jerarquía expuesta ya que Miembro y Entrenador son clases que se pueden y se encapsulan dentro de la super clase Persona puesto que tienen características parecidas como nombre, edad y correo eléctronico.

## Atributos Heredados:
- nombre(String) — Nombre completo de la persona.
- edad(int) — Edad de la persona.
- email(String) — Dirección de correo electrónico.

## Métodos Sobrescritos:
- Miembro y Entrenador utilizan los métodos heredados de Persona, como imprimirDatosPersonales() y esMayorDeEdad().
- Cada subclase implementa métodos propios específicos (como calcularIMC() en Miembro y nivelEntrenador() en Entrenador), pero no reemplaza métodos de la clase padre en ninguno de los casos.