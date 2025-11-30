# Semana 01 - Introducción al Paradigma Orientado a Objetos

**Estudiante:** Allan Koll Benavides Lopez  
**Ficha:** 3228973B  
**Dominio Asignado:** Gimnasio "FitZone"

---

## 📋 Contexto del Dominio

**Tipo de Negocio:** Gimnasio y Centro de Acondicionamiento Físico  
**Nombre Comercial:** FitZone  
**Ubicación:** Bogotá, Localidad de Chapinero  
**Especialidad:** Entrenamiento personalizado, clases grupales, musculación y cardio

### Descripción Breve
FitZone es un gimnasio moderno que ofrece entrenamiento personalizado, clases grupales (spinning, yoga, crossfit), área de musculación y cardio. Cuenta con 12 entrenadores certificados y atiende aproximadamente 200 miembros diarios.

---

## 🎯 Objetivos de la Semana 01

Al finalizar esta semana, deberás ser capaz de:

1. Identificar objetos del mundo real en el contexto de un gimnasio
2. Comprender las diferencias entre programación estructurada y POO
3. Reconocer los conceptos fundamentales: clase, objeto, atributo, método
4. Crear tu primera clase simple en Java aplicada al dominio

---

## 📝 Actividades Obligatorias

### Actividad 1: Identificación de Objetos (Ejercicio 01)

**Instrucciones:**
- Lee el material teórico de la semana sobre conceptos fundamentales de POO
- Identifica **5 objetos principales** que existen en un gimnasio
- Para cada objeto, describe:
    - ¿Qué es? (definición)
    - ¿Qué características tiene? (atributos)
    - ¿Qué puede hacer? (comportamientos/métodos)

**Ejemplo:**
```
Objeto: Miembro
- ¿Qué es?: Una persona inscrita en el gimnasio
- Características: nombre, edad, tipo de membresía, fecha de inscripción
- Comportamientos: entrenar, renovar membresía, asistir a clases
```

**Entregable:** Documento con la identificación de 5 objetos del dominio del gimnasio.

---

### Actividad 2: Comparación de Paradigmas (Ejercicio 02)

**Instrucciones:**
- Investiga las diferencias entre programación estructurada y POO
- Escribe un ejemplo conceptual de cómo se manejaría la información de un miembro del gimnasio en:
    1. **Programación estructurada** (usando variables sueltas y funciones)
    2. **Programación orientada a objetos** (usando una clase)

**Entregable:** Documento comparativo con ejemplos explicados.

---

### Actividad 3: Primera Clase Simple (Ejercicio 03)

**Instrucciones:**
Crea tu primera clase en Java llamada `Member` (Miembro) con:
- **3 atributos** (ej: `name`, `age`, `membershipType`)
- **1 constructor** que inicialice los atributos
- **1 método** que muestre la información del miembro

**Código de ejemplo:**

```java
public class Member {
    // Atributos
    String name;
    int age;
    String membershipType;
    
    // Constructor
    public Member(String name, int age, String membershipType) {
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
    }
    
    // Método para mostrar información
    public void showInfo() {
        System.out.println("Miembro: " + name);
        System.out.println("Edad: " + age + " años");
        System.out.println("Membresía: " + membershipType);
    }
}
```

**Instrucciones adicionales:**
1. Crea una clase `Main` con el método `main`
2. Instancia **3 objetos diferentes** de tipo `Member`
3. Llama al método `showInfo()` para cada objeto

**Entregable:** Archivo `Member.java` y `Main.java` funcionando correctamente.

---

### Actividad 4: Múltiples Objetos (Ejercicio 04)

**Instrucciones:**
Amplía el ejercicio anterior:
- Crea al menos **5 objetos** de tipo `Member` con datos diferentes
- Cada miembro debe tener información coherente con un gimnasio real
- Muestra la información de todos los miembros

**Ejemplo de datos:**
- Carlos Pérez, 28 años, Premium
- Ana Rodríguez, 35 años, Basic
- Luis Gómez, 22 años, VIP
- María Silva, 40 años, Premium
- Pedro Martínez, 19 años, Basic

**Entregable:** Código Java con 5 instancias de `Member` y su salida en consola.

---

## 🎓 Criterios de Evaluación

| Criterio                      | Peso | Descripción                                                                   |
|-------------------------------|------|-------------------------------------------------------------------------------|
| **Identificación de objetos** | 25%  | Objetos identificados son relevantes al dominio del gimnasio                  |
| **Comprensión conceptual**    | 25%  | Demuestra entender diferencias entre paradigmas                               |
| **Implementación de clase**   | 30%  | Clase `Member` implementada correctamente con atributos, constructor y método |
| **Instanciación de objetos**  | 20%  | Crea múltiples objetos con datos coherentes                                   |

---

## 📚 Recursos de Apoyo

### Material Teórico (Carpeta `1-teoria/`)
- `01-historia-evolucion-poo.md`
- `02-paradigmas-programacion.md`
- `03-conceptos-fundamentales-poo.md`
- `04-primer-programa-poo.md`

### Ejercicios Guiados (Carpeta `2-practica/`)
- `ejercicio-01-comparacion-paradigmas/`
- `ejercicio-02-primera-clase/`
- `ejercicio-03-multiples-objetos/`
- `ejercicio-04-modelado-mundo-real/`

### Glosario
Revisa el archivo `3-recursos/glosario.md` para términos clave de esta semana.

---

## 💡 Consejos

1. **No te compliques:** Esta semana es sobre conceptos básicos, no sobre código complejo
2. **Piensa en objetos reales:** Visualiza cómo funciona un gimnasio real
3. **Pregunta:** Si tienes dudas sobre el dominio o los conceptos, consulta con el instructor
4. **Compila y prueba:** Asegúrate de que tu código compile antes de entregar

---

## 📅 Fecha de Entrega

**Entrega:** Según calendario definido por el instructor  
**Formato:** Código fuente (.java) y documentos en formato Markdown o PDF

---

**Nota Importante:** Este es tu dominio personal para todo el bootcamp. Todas las actividades futuras seguirán en el contexto del gimnasio FitZone. No compartas tu código directamente con otros estudiantes, ya que cada uno tiene un dominio diferente.

### 1. Member (Miembro)
- **Atributos:** `memberId`, `name`, `age`, `phone`, `email`, `membershipType`, `registrationDate`, `expirationDate`, `status`
- **Métodos:** `renewMembership()`, `upgradeSubscription()`, `checkInToGym()`, `isActive()`
- **Relaciones:** Tiene múltiples `WorkoutSession`, puede tener un `Trainer` asignado

### 2. Trainer (Entrenad)
- **Atributos:** `trainerId`, `name`, `specialty`, `certifications`, `schedule`, `maxClients`, `currentClients`
- **Métodos:** `assignClient()`, `createWorkoutPlan()`, `updateAvailability()`, `getClientList()`
- **Herencia:** `extends Employee`

### 3. MembershipPlan (Plan de Membresía)
- **Atributos:** `planId`, `name`, `duration`, `price`, `benefits`, `classLimit`
- **Métodos:** `calculatePrice()`, `applyDiscount()`, `checkBenefits()`
- **Tipos:** `BASIC`, `PREMIUM`, `VIP`, `DAY_PASS` (enum)

### 4. WorkoutSession (Sesión de Entrenamiento)
- **Atributos:** `sessionId`, `member`, `trainer`, `date`, `duration`, `exercisesCompleted`, `caloriesBurned`
- **Métodos:** `logWorkout()`, `calculateProgress()`, `generateReport()`
- **Relaciones:** Pertenece a un `Member`, supervisada por `Trainer`

### 5. GroupClass (Clase Grupal)
- **Atributos:** `classId`, `name`, `instructor`, `schedule`, `capacity`, `enrolledMembers`, `category`
- **Métodos:** `enrollMember()`, `cancelEnrollment()`, `checkAvailability()`, `isFull()`
- **Categorías:** `SPINNING`, `YOGA`, `CROSSFIT`, `ZUMBA`, `PILATES`, `BOXING` (enum)

### 6. Equipment (Equipo/Máquina)
- **Atributos:** `equipmentId`, `name`, `category`, `status`, `lastMaintenance`, `location`
- **Métodos:** `scheduleMaintenance()`, `reportIssue()`, `updateStatus()`
- **Estados:** `AVAILABLE`, `IN_USE`, `MAINTENANCE`, `OUT_OF_ORDER` (enum)

### 7. Payment (Pago)
- **Atributos:** `paymentId`, `member`, `amount`, `date`, `paymentMethod`, `concept`, `status`
- **Métodos:** `processPayment()`, `generateInvoice()`, `refund()`
- **Conceptos:** `MEMBERSHIP`, `PERSONAL_TRAINING`, `CLASS`, `PRODUCT` (enum)

---

## 💻 Ejemplos de Implementación

### Ejemplo 1: Clase Member con Encapsulación

```java
package com.fitzone.model;

import java.time.LocalDate;

public class Member {
    private int memberId;
    private String name;
    private int age;
    private String phone;
    private MembershipType membershipType;
    private LocalDate registrationDate;
    private LocalDate expirationDate;
    private boolean active;
    
    // Constructor
    public Member(String name, int age, String phone, MembershipType type) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.membershipType = type;
        this.registrationDate = LocalDate.now();
        this.active = true;
    }
    
    // Método de negocio
    public boolean isActive() {
        return active && LocalDate.now().isBefore(expirationDate);
    }
    
    public void renewMembership(int months) {
        this.expirationDate = this.expirationDate.plusMonths(months);
    }
    
    public String getMemberInfo() {
        return name + " - " + membershipType + " (Vence: " + expirationDate + ")";
    }
    
    // Getters y Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public MembershipType getMembershipType() { return membershipType; }
}

enum MembershipType {
    BASIC, PREMIUM, VIP, DAY_PASS
}
```

### Ejemplo 2: Herencia de Empleados

```java
// Clase abstracta base
public abstract class Employee {
    protected String name;
    protected String employeeId;
    protected double salary;
    protected String schedule;
    
    public abstract double calculateSalary();
    public abstract String getRole();
}

// Clase derivada
public class Trainer extends Employee {
    private String specialty;
    private int maxClients;
    private List<Member> assignedClients;
    
    @Override
    public double calculateSalary() {
        // Salario base + bono por cliente
        return salary + (assignedClients.size() * 50000);
    }
    
    @Override
    public String getRole() {
        return "Entrenad Personal - " + specialty;
    }
    
    public void assignClient(Member member) {
        if (assignedClients.size() < maxClients) {
            assignedClients.add(member);
        }
    }
}
```

---

## 📊 Datos de Ejemplo

### Miembros Registrados

```java
Member member1 = new Member("Carlos Pérez", 28, "3101234567", MembershipType.PREMIUM);
Member member2 = new Member("Ana Rodríguez", 35, "3209876543", MembershipType.BASIC);
Member member3 = new Member("Luis Gómez", 22, "3156789012", MembershipType.VIP);
Member member4 = new Member("María Silva", 40, "3187654321", MembershipType.PREMIUM);
Member member5 = new Member("Pedro Martínez", 19, "3145678901", MembershipType.BASIC);
```

### Entrenadores

```java
Trainer trainer1 = new Trainer("Juan Ramírez", "Musculación y Fuerza", 3000000);
Trainer trainer2 = new Trainer("Laura Sánchez", "Pérdida de Peso", 2800000);
Trainer trainer3 = new Trainer("Diego Torres", "CrossFit y Funcional", 3200000);
```

### Clases Grupales

```java
GroupClass class1 = new GroupClass("Spinning Matutino", ClassCategory.SPINNING, 25);
GroupClass class2 = new GroupClass("Yoga Relax", ClassCategory.YOGA, 20);
GroupClass class3 = new GroupClass("CrossFit Intenso", ClassCategory.CROSSFIT, 15);
GroupClass class4 = new GroupClass("Zumba Party", ClassCategory.ZUMBA, 30);
```

---

## ✅ Actividades por Semana

### Semana 1: Introducción a POO
- Identificar objetos del mundo real en FitZone
- Crear la clase `Member` con atributos básicos
- Instanciar diferentes tipos de miembros

### Semana 2: Clases y Objetos
- Modelar `Trainer`, `GroupClass`, `Equipment`
- Crear constructores y métodos básicos
- Instanciar objetos y mostrar información

### Semana 3: Encapsulación
- Aplicar modificadores `private` a todos los atributos
- Implementar getters/setters con validaciones
- Crear métodos de negocio (renovar membresía, asignar entrenador)

### Semana 4: Herencia
- Jerarquía: `Employee` → `Trainer`, `Instructor`, `Receptionist`
- Implementar herencia y reutilización de código
- Usar `super` para llamar constructores padre

### Semana 5: Polimorfismo
- Sobrecarga: métodos `calculatePrice()` con diferentes parámetros
- Sobrescritura: `calculateSalary()` por tipo de empleado
- Colecciones polimórficas de empleados

### Semana 6: Abstracción e Interfaces
- Clase abstracta `Employee`
- Interfaces: `Schedulable`, `Payable`, `Maintainable`
- Implementación en clases concretas

### Semana 7: Paquetes y Excepciones
- Paquetes: `com.fitzone.model`, `com.fitzone.service`, `com.fitzone.exception`
- Excepciones: `MembershipExpiredException`, `ClassFullException`
- Manejo de errores

### Semana 8: Colecciones
- `ArrayList<Member>` para gestión de miembros
- `HashMap<String, GroupClass>` para clases
- Operaciones CRUD

### Semana 9: Proyecto Final
- Sistema completo de gestión de gimnasio
- Integración de todos los conceptos POO
- Documentación y diagramas UML

---

## 🎓 Criterios de Evaluación

1. **Adaptación al Dominio (30%):** Coherencia con el contexto de un gimnasio
2. **Aplicación de Conceptos POO (40%):** Correcta implementación de principios
3. **Funcionalidad (20%):** Código funcional y sin errores
4. **Documentación (10%):** Comentarios claros y concisos

---

**Nota:** Este dominio es único y personal. Todas las implementaciones deben reflejar el contexto de un gimnasio.
