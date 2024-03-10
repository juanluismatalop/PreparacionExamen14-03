package Herencia;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor{
    LocalDate fechaIncorporacion;

    public ProfesorTitular(String nombreCompleto, LocalDate fechaNacimieto, String dni, Especialidad especialidad, LocalDate añoIncorporacion) {
        super(nombreCompleto, fechaNacimieto, dni, especialidad);
        this.fechaIncorporacion = añoIncorporacion;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
}
