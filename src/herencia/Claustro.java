package herencia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Claustro {
    String nombreDeCentro;
    List<Profesor> profesores = new ArrayList<>();

    public Claustro(String nombreDeCentro) {
        this.nombreDeCentro = nombreDeCentro;
    }

    public void setNombreDeCentro(String nombreDeCentro) {
        this.nombreDeCentro = nombreDeCentro;
    }

    //metodos Crud
    private boolean añadirProfesor(Profesor profesor){
        return profesores.add(profesor);
    }
    public boolean eliminarProfesor(Profesor profesor) {
        return profesores.remove(profesor);
    }
    public Optional<Profesor> buscarProfesor(Profesor profesor){
        for (Profesor profesorBuscado : profesores)
            if (profesorBuscado.equals(profesor))
                return Optional.of(profesorBuscado);
        return Optional.empty();
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
    public double obtenerEdadMediaProfesores() {
        return profesores.stream()
                .mapToDouble(Helper::calcularAnnos)
                .average()
                .getAsDouble();
    }
    public Profesor obtenerProfesorTitularMasAntiguo () {
        return profesores.stream()
            .filter(profesor -> profesor instanceof ProfesorTitular)
            .min(Comparator.comparing(profesor -> ((ProfesorTitular) profesor).getFechaIncorporacion()))
            .get();
    }
    public long obtenerNumeroProfesoresPorEspecialidad (Especialidad especialidad){
        return profesores.stream()
            .filter(profesor -> profesor.getEspecialidad().equals(especialidad))
            .count();
    }
}
