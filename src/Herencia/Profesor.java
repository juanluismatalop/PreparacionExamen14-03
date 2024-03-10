package Herencia;

import java.time.LocalDate;

public class Profesor extends Persona{
    Especialidad especialidad;

    public Profesor(String nombreCompleto, LocalDate fechaNacimieto, String dni, Especialidad especialidad) {
        super(nombreCompleto, fechaNacimieto, dni);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
