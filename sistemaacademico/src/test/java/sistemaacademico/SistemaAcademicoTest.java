
package sistemaacademico;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

public class SistemaAcademicoTest {

    // R1: Crear una persona con datos validos
    @Test
    void personaConDatosValidosSeCreaCorrectamente() {
        Estudiante estudiante = new Estudiante(
            "1001", "Carlos Perez", "EST01"
        );

        assertEquals("1001", estudiante.getIdentificacion());
        assertEquals("Carlos Perez", estudiante.getNombre());
    }

    // R1: No aceptar identificacion vacia
    @Test
    void identificacionVaciaGeneraError() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudiante("", "Carlos Perez", "EST01");
        });
    }

    // R2: Aceptar una nota valida
    @Test
    void notaValidaEsAceptada() {
        Estudiante estudiante = new Estudiante(
            "1001", "Carlos Perez", "EST01"
        );
        Materia materia = new Materia("M01", "Matematicas");

        Nota nota = new Nota(estudiante, materia, 4.0);

        assertEquals(4.0, nota.getValor());
    }

    // R2: Rechazar una nota superior a 5
    @Test
    void notaSuperiorAlLimiteGeneraError() {
        Estudiante estudiante = new Estudiante(
            "1001", "Carlos Perez", "EST01"
        );
        Materia materia = new Materia("M01", "Matematicas");

        assertThrows(IllegalArgumentException.class, () -> {
            new Nota(estudiante, materia, 5.5);
        });
    }

    // R3: Un curso necesita materia y profesor
    @Test
    void cursoSinProfesorGeneraError() {
        Materia materia = new Materia("M01", "Matematicas");
        Horario horario = new Horario(
            "Lunes",
            LocalTime.of(8, 0),
            LocalTime.of(10, 0)
        );

        assertThrows(IllegalArgumentException.class, () -> {
            new Curso("C01", materia, null, horario);
        });
    }

    // R4: Rechazar un horario con horas incorrectas
    @Test
    void horarioConHoraFinalAnteriorGeneraError() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Horario(
                "Lunes",
                LocalTime.of(10, 0),
                LocalTime.of(8, 0)
            );
        });
    }

    // R5: Comprobar el polimorfismo
    @Test
    void cadaPersonaMuestraSuInformacion() {
        Persona estudiante = new Estudiante(
            "1001", "Carlos Perez", "EST01"
        );

        Persona profesor = new Profesor(
            "2001", "Ana Gomez", "Programacion"
        );

        assertTrue(
            estudiante.mostrarInformacion().contains("Estudiante")
        );

        assertTrue(
            profesor.mostrarInformacion().contains("Profesor")
        );
    }

    // R6: No permitir inscribir al mismo estudiante dos veces
    @Test
    void estudianteDuplicadoGeneraError() {
        Estudiante estudiante = new Estudiante(
            "1001", "Carlos Perez", "EST01"
        );

        Materia materia = new Materia("M01", "Matematicas");

        Profesor profesor = new Profesor(
            "2001", "Ana Gomez", "Programacion"
        );

        Horario horario = new Horario(
            "Lunes",
            LocalTime.of(8, 0),
            LocalTime.of(10, 0)
        );

        Curso curso = new Curso(
            "C01", materia, profesor, horario
        );

        curso.agregarEstudiante(estudiante);

        assertThrows(
            IllegalArgumentException.class,
            () -> curso.agregarEstudiante(estudiante)
        );
    }
}
