# Práctica 4.1: Programación orientada a objetos

## Identificación de la Actividad

- **Módulo:** PROG
- **Unidad de Trabajo:** U4: Kotlin: POO y estructuras de datos
- **Fecha de Creación:** 15/01/2026
- **Fecha de Entrega:**  16/01/2026
- **Alumno(s):**
  - **Nombre y Apellidos:** Irene Foncubierta Lobatón
  - **Correo electrónico:** ifonlob1108@g.educaand.es
  - **Iniciales del Alumno/Grupo:** IFL

## Descripción de la Actividad

La actividad consiste en implementar varias clases sencillas en Kotlin para practicar los conceptos básicos de la programación orientada a objetos aplicando encapsulación, constructores, propiedades, métodos y validación de datos mediante excepciones.  
Se desarrollan cinco ejercicios: una cuenta bancaria, un vehículo, un libro, un estudiante y un producto de inventario, y se prueba su comportamiento desde la función principal del programa.

## Instrucciones de Compilación y Ejecución

1. **Requisitos Previos:**
   - Kotlin 1.9.x o superior
   - JDK 17
   - IntelliJ IDEA / Kotlin CLI instalado

2. **Pasos para Compilar el Código (Kotlin CLI):**
   ```bash
   kotlinc src/main/kotlin/org/iesra/*.kt -include-runtime -d practica4_1.jar
```

3. **Pasos para Ejecutar la Aplicación:**

```bash
java -jar practica4_1.jar
```

4. **Ejecución de Pruebas:**
    - No se han definido tests automatizados; las pruebas se realizan desde `main` con distintos casos de uso y manejo de excepciones.

## Desarrollo de la Actividad

### Descripción del Desarrollo

Se ha creado un paquete `org.iesra` que contiene una clase por ejercicio (`CuentaBancaria`, `Vehiculo`, `Libro`, `Estudiante` y `Producto`) y un `main` donde se instancian los objetos y se prueban sus métodos.
En todas las clases se valida la entrada mediante excepciones (`IllegalArgumentException`) para asegurar que los datos sean coherentes (por ejemplo, no permitir precios negativos, notas fuera de rango o retiradas superiores al saldo).

### Código Fuente

- [CuentaBancaria](https://github.com/IES-Rafael-Alberti/2425-u4-4-2-poo-basico-ifonlob/blob/2f1828129870d92aedd374f933f5b4139cfef16d/src/main/kotlin/org/iesra/CuentaBancaria.kt)
- [Vehiculo](https://github.com/IES-Rafael-Alberti/2425-u4-4-2-poo-basico-ifonlob/blob/2f1828129870d92aedd374f933f5b4139cfef16d/src/main/kotlin/org/iesra/Vehiculo.kt)
- [Estudiante](https://github.com/IES-Rafael-Alberti/2425-u4-4-2-poo-basico-ifonlob/blob/2f1828129870d92aedd374f933f5b4139cfef16d/src/main/kotlin/org/iesra/Estudiante.kt)
- [Producto](https://github.com/IES-Rafael-Alberti/2425-u4-4-2-poo-basico-ifonlob/blob/2f1828129870d92aedd374f933f5b4139cfef16d/src/main/kotlin/org/iesra/Producto.kt)
-[Libro](https://github.com/IES-Rafael-Alberti/2425-u4-4-2-poo-basico-ifonlob/blob/2f1828129870d92aedd374f933f5b4139cfef16d/src/main/kotlin/org/iesra/Libro.kt)
- [Main](https://github.com/IES-Rafael-Alberti/2425-u4-4-2-poo-basico-ifonlob/blob/2f1828129870d92aedd374f933f5b4139cfef16d/src/main/kotlin/org/iesra/Main.kt)

### Ejemplos de Ejecución

1. **Ejercicio 1 – CuentaBancaria**
    - Entrada (en `main`):

```kotlin
val cuenta = CuentaBancaria("Juan")
cuenta.ingresar(100.0)
cuenta.retirar(50.0)
try {
    cuenta.retirar(400.0)
} catch (e: IllegalArgumentException) {
    println("La cantidad a retirar no puede ser mayor que el saldo actual.")
}
```

    - Salida esperada:
        - Mensaje de saldo tras ingresar 100.
        - Mensaje de saldo tras retirar 50.
        - Mensaje de error al intentar retirar más saldo del disponible.
2. **Ejercicio 2 – Vehiculo**
    - Entrada:

```kotlin
val vehiculo = Vehiculo("Toyota", "Hybrid")
vehiculo.registrarViaje(100.0)
println(vehiculo.detalles())
```

    - Salida esperada:
        - Texto con la marca, modelo y kilometraje acumulado (100.0 km).
3. **Ejercicio 3 – Libro**
    - Entrada:

```kotlin
val libro1 = Libro("Libro 1","Joe Flows",150,true)
val libro2 = Libro("Libro 2","David Flores",236,false)
println(libro1)
println(libro2)
try {
    val libro3 = Libro("","María Olivares",260,false)
} catch (e: IllegalArgumentException) {
    println("El título o el autor del libro no pueden estar vacíos.")
}
```

    - Salida esperada:
        - Información de los libros 1 y 2.
        - Mensaje de error por intentar crear un libro con título vacío.
4. **Ejercicio 4 – Estudiante**
    - Entrada:

```kotlin
val estudiante1 = Estudiante("Ana")
val estudiante2 = Estudiante("Luis")
val estudiante3 = Estudiante("María")

estudiante1.setNota(8.5)
estudiante2.setNota(6.0)

try {
    estudiante3.setNota(11.0)
} catch (e: IllegalArgumentException) {
    println("La nota debe estar entre 0 y 10.")
}

try {
    estudiante2.setNota(-1.0)
} catch (e: IllegalArgumentException) {
    println("La nota debe estar entre 0 y 10.")
}

println(estudiante1)
println(estudiante2)
println(estudiante3)
```

    - Salida esperada:
        - Mensajes de error para notas fuera de rango.
        - Información de cada estudiante con su nota actual.
5. **Ejercicio 5 – Producto**
    - Entrada:

```kotlin
val producto1 = Producto("Teclado", 29.99, 10)
val producto2 = Producto("Ratón", 59.99, 5)

println(producto1)
println(producto2)

producto1.vender(3)
producto2.vender(2)

producto2.reabastecer(10)

try {
    producto1.vender(100)
} catch (e: IllegalArgumentException) {
    println("La cantidad que se quiere vender tiene que ser menor que el stock disponible.")
}

println(producto1)
println(producto2)
```

    - Salida esperada:
        - Información inicial de productos.
        - Actualización del stock tras ventas y reabastecimiento.
        - Mensaje de error al intentar vender más unidades de las disponibles.
        - Información final de productos con el stock actualizado.

### Resultados de Pruebas

- Se han probado manualmente las rutas principales de cada clase desde `main`, incluyendo:
    - Casos válidos (operaciones normales).
    - Casos inválidos que disparan `IllegalArgumentException` (saldo insuficiente, notas fuera de rango, stock insuficiente, etc.).
- No se han detectado errores de ejecución tras corregir la lógica de `Producto.vender`. [web:8]


## Documentación Adicional

- **Manual de Usuario:** No aplica en esta práctica, ya que es una aplicación de consola orientada a pruebas de POO.
- **Autorización de Permisos:** El profesor tiene permisos de lectura en el repositorio de GitHub (invitar como colaborador o usar Classroom).


## Conclusiones

En esta práctica se ha trabajado con clases simples en Kotlin para afianzar los fundamentos de **POO**: creación de objetos, encapsulación de datos y validación de entradas.
Se ha visto la importancia de manejar errores con excepciones y de diseñar métodos que mantengan el estado coherente de los objetos (por ejemplo, controlando el saldo o el stock).