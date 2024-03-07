package herencia;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
    int mesesDContratacion;

    public ProfesorInterino(String nombreCompleto, LocalDate fechaNacimieto, String dni, Especialidad especialidad, int mesesDContratacion) {
        super(nombreCompleto, fechaNacimieto, dni, especialidad);
        this.mesesDContratacion = mesesDContratacion;
    }

    public int getMesesDContratacion() {
        return mesesDContratacion;
    }

    public void setMesesDContratacion(int mesesDContratacion) {
        this.mesesDContratacion = mesesDContratacion;
    }
}
