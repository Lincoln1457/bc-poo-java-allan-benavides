# Mejoras del sistema FItZone- Semana 03

## Encapsulación Aplicada

### Clase: Miembro
- Atributos encapsulados:
  - edad
  - peso
  - activo
  - nombreCompleto
- Validaciones agregadas:
  - Edad mayor a 15.
  - Nivel válido para el gimnacio.
  - Verificadores provados de textod, número y email y email.

### Clase: Entrenador 
- Atributos encapsulados:
  - nombre
  - dispoible
  - especialidad
  - experienciaAnios
- Validaciones agregadas:
  - Años de experiencia ≥ 0.
  - Strings no nulos ni vacíos.
  - Validación en especialidad.
  - Control seguro de cambio de disponibilidad.

## Constructores Sobrecargados

### Clase: Miembro
- **Constructor 1:** Todos los atributos completos.
- **Constructor 2:** Solo nombre y edad.

### Clase: Entrenador
- **Constructor 1:** Todos los atributos completos.
- **Constructor 2:** Solo nombre y especialidad.

## Beneficios Logrados
* Mayor seguridad de los datos dispuestos.
* Fácil integración de objetos en el sistema.
* Encapsulación efectiva.
* Nada de errores en los datos.