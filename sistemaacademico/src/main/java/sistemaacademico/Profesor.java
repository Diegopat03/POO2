package sistemaacademico;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String identificacion, String nombre,
                    String especialidad) {
        super(identificacion, nombre);

        if (especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException(
                "La especialidad es obligatoria"
            );
        }

        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String mostrarInformacion() {
        return "Profesor: " + getNombre()
            + " - Especialidad: " + especialidad;
    }
}