package sistemaacademico;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private Materia materia;
    private Profesor profesor;
    private List<Estudiante> estudiantes;
    private Horario horario;

    public Curso(String codigo, Materia materia,
                Profesor profesor, Horario horario) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException(
                "El codigo del curso es obligatorio"
            );
        }

        if (materia == null || profesor == null || horario == null) {
            throw new IllegalArgumentException(
                "El curso debe tener materia, profesor y horario"
            );
        }

        this.codigo = codigo;
        this.materia = materia;
        this.profesor = profesor;
        this.horario = horario;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
    if (estudiante == null) {
        throw new IllegalArgumentException(
            "El estudiante no puede ser nulo");
    }

    if (estudianteYaInscrito(estudiante)) {
        throw new IllegalArgumentException(
            "El estudiante ya esta inscrito");
    }

    estudiantes.add(estudiante);
}

private boolean estudianteYaInscrito(Estudiante estudiante) {
    for (Estudiante actual : estudiantes) {
        if (actual.getIdentificacion()
                .equals(estudiante.getIdentificacion())) {
            return true;
        }
    }

    return false;
}

    public String getCodigo() {
        return codigo;
    }

    public Materia getMateria() {
        return materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Horario getHorario() {
        return horario;
    }

    public List<Estudiante> getEstudiantes() {
        return List.copyOf(estudiantes);
    }
}