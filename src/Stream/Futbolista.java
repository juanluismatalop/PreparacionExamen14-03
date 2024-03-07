package Stream;

import java.time.LocalDate;
import java.time.Period;

public class Futbolista {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Puesto puesto;
    private String dni;

    public Futbolista(String nombre, LocalDate fechaNacimiento, Puesto puesto, String dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.puesto = puesto;
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    int calcularEdad() {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        int annos = periodo.getYears();
        return annos;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s",nombre, calcularEdad(),puesto,dni);
    }


}
