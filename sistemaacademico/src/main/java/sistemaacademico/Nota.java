package sistemaacademico;

public class Nota {
    private Estudiante estudiante;
    private Materia materia;
    private double valor;

    public Nota(Estudiante estudiante, Materia materia,
                double valor) {
        if (estudiante == null || materia == null) {
            throw new IllegalArgumentException(
                "El estudiante y la materia son obligatorios"
            );
        }

        if (!Double.isFinite(valor) || valor < 0.0 || valor > 5.0) {
            throw new IllegalArgumentException(
                "La nota debe estar entre 0.0 y 5.0"
            );
        }

        this.estudiante = estudiante;
        this.materia = materia;
        this.valor = valor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getValor() {
        return valor;
    }
}