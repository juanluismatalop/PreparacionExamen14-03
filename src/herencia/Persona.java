package herencia;

import java.time.LocalDate;

public class Persona {
    String nombreCompleto;
    LocalDate fechaNacimieto;
    String dni;

    public Persona(String nombreCompleto, LocalDate fechaNacimieto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimieto = fechaNacimieto;
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimieto() {
        return fechaNacimieto;
    }

    public void setFechaNacimieto(LocalDate fechaNacimieto) {
        this.fechaNacimieto = fechaNacimieto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
