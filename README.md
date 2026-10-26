# POO2
SISTEMA ACADEMICO ACT 06

## Descripción
Este proyecto consiste en un sistema académico básico desarrollado en Java, utilizando programación orientada a objetos. Permite representar estudiantes, profesores, materias, cursos, horarios y notas.

## Tecnologías utilizadas
- Java JDK 21
- Maven
- JUnit 5
- Visual Studio Code

## Clases principales
- `Persona`: clase abstracta con los datos comunes de las personas.
- `Estudiante`: representa a los estudiantes.
- `Profesor`: representa a los profesores.
- `Materia`: almacena la información de las materias.
- `Curso`: administra los cursos y sus estudiantes.
- `Horario`: valida y almacena los horarios.
- `Nota`: registra y valida las calificaciones.

## Ejecución del proyecto
1. Abrir el proyecto en Visual Studio Code.
2. Verificar que Java JDK 21 y Maven estén instalados.
3. Ejecutar la clase `Main.java` para observar el funcionamiento básico.

## Ejecución de pruebas
Desde la terminal, ubicada en la carpeta del proyecto, ejecutar:

```bash
mvn test
```

Las pruebas unitarias verifican la creación de personas, las validaciones de notas y horarios, los requisitos de los cursos, el polimorfismo y la prevención de estudiantes duplicados.

## Estado
El proyecto cuenta con ocho pruebas unitarias que se ejecutaron correctamente en el entorno de desarrollo.

