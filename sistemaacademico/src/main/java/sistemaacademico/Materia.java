package sistemaacademico;

public class Materia {
    private String codigo;
    private String nombre;

    public Materia(String codigo, String nombre) {
        if (codigo == null || codigo.isBlank()
                || nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                "El codigo y el nombre son obligatorios"
            );
        }

        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}