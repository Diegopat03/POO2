package sistemaacademico;

public abstract class Persona {
    private String identificacion;
    private String nombre;

    public Persona(String identificacion, String nombre) {
        if (identificacion == null || identificacion.isBlank()) {
            throw new IllegalArgumentException(
                "La identificacion es obligatoria"
            );
        }

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                "El nombre es obligatorio"
            );
        }

        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String mostrarInformacion();
}