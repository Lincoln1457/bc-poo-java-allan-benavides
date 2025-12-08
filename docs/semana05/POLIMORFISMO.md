# Análisis de polimorfismo - FitZone
Explicación de todos los puntos de los que se desea que queden claros ante el espectador.

## 1. Sobrecarga (Overloading)
En la clase Persona se implementó sobrecarga del método actualizarContactos:

- actualizarContacto(String nuevoEmail)
- actualizarContacto(String nuevoEmail, String nuevoTelefono)

En FitZone tiene sentido permitir múltiples formas de actualizar los datos de contacto de un usuario; a veces solo cambia el **correo** y otras veces se actualiza **correo** y **teléfono** que lo se utiliza para promocionar, informar, notificar, etcétera, a la `persona` sea al `miembro` o `entrenador`.

---
## 2. Sobrescritura (Overriding)
### Métodos Sobrescritos con @Override
En las subclases `Miembro` y `Entrenador` se sobrescribieron los siguientes métodos heredados de `Persona`:

- saludar()
- mostrarInfo()
### Tabla Comparativa
| Método        | Clase Padre (Persona)                | Miembro                            | Entrenador                            |
|---------------|--------------------------------------|------------------------------------|---------------------------------------|
| saludar()     | "Hola, soy una persona del sistema." | "Hola, soy un miembro de FitZone." | "Hola, soy un entrenador de FitZone." |
| mostrarInfo() | Muestra nombre y edad                | Agrega tipo de membresía           | Agrega especialidad                   |
```
@Override
public String mostrarInfo() {
    return "Miembro: " + nombre + " | Membresía: " + tipoMembresia;
}
```

```
@Override
public String mostrarInfo() {
    return "Entrenador: " + nombre + " | Especialidad: " + especialidad;
}
```

---
## 3. Polimorfismo Dinámico
```
ArrayList<Persona> personas = new ArrayList<>();
personas.add(new Entrenador("Carlos Pérez", "E101", "Crossfit"));
personas.add(new Miembro("Ana Torres", "M202", "Premium"));

for (Persona p : personas) {
p.saludar();
System.out.println(p.mostrarInfo());
} 
```
El ArrayList es de tipo `Persona` y en tiempo de ejecución Java determina qué método llamar según el tipo real del objeto:
- Si el objeto es un `Miembro`, ejecuta la versión de `Miembro`.
- Si es un `Entrenador`, ejecuta la versión de `Entrenador`.

---
## 4. Beneficios
| Ventajas                                                              | Desventajas                                    |
|:----------------------------------------------------------------------|------------------------------------------------|
| Permite escribir código genérico que funciona con cualquier subclase. | Habría que usar `instanceof` por todas partes. |
| Reduce duplicación.                                                   | El sistema sería rígido y difícil de extender. |
| Facilita mantenimiento y escalabilidad.                               | Se duplicaría lógica en múltiples lugares.     |
| Permite agregar nuevas subclases sin modificar el código existente.   |