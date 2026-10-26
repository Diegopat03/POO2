package sistemaacademico;
public class Estudiante extends Persona {
    private String codigoEstudiantil;

    public Estudiante(String identificacion, String nombre,
                    String codigoEstudiantil) {
        super(identificacion, nombre);

        if (codigoEstudiantil == null ||
            codigoEstudiantil.isBlank()) {
            throw new IllegalArgumentException(
                "El codigo estudiantil es obligatorio"
            );
        }

        this.codigoEstudiantil = codigoEstudiantil;
    }

    public String getCodigoEstudiantil() {
        return codigoEstudiantil;
    }

    @Override
    public String mostrarInformacion() {
        return "Estudiante: " + getNombre()
            + " - Codigo: " + codigoEstudiantil;
    }
}