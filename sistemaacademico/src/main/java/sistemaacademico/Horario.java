package sistemaacademico;

import java.time.LocalTime;

public class Horario {
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Horario(String dia, LocalTime horaInicio,
                LocalTime horaFin) {
        if (dia == null || dia.isBlank()) {
            throw new IllegalArgumentException(
                "El dia es obligatorio"
            );
        }

        if (horaInicio == null || horaFin == null
                || !horaInicio.isBefore(horaFin)) {
            throw new IllegalArgumentException(
                "El horario no es valido"
            );
        }

        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }
}