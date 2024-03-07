package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class EquipoFutbol {
    private String nombreDelEquipo;
    private List<Futbolista> futbolistas;

    public EquipoFutbol(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
        this.futbolistas = new ArrayList<>();
    }
    public boolean ficharJugador(Futbolista futbolista){
        return futbolistas.add(futbolista);
    }
    public boolean darDeBaja(String dni){
        for (Futbolista futbolista: futbolistas)
            if(futbolista.getDni().equalsIgnoreCase(dni))
                return futbolistas.remove(futbolista);
        return false;
    }
    public boolean actualizarPuesoJugador(String dni, Puesto nuevoPuesto){
        for(Futbolista futbolista:futbolistas)
            if (futbolista.getDni().equalsIgnoreCase(dni)) {
                futbolista.setPuesto(nuevoPuesto);
                return true;
            }
        return false;
    }
    public List<String> listaNombreJugadores(){
        return futbolistas.stream().map(Futbolista::getNombre).sorted().toList();
    }
    public List<String> listaJugadoresSub21(){
        return futbolistas.stream().filter(futbolista -> futbolista.calcularEdad() <=21).map(Futbolista::getNombre).sorted().toList();
    }
    public List<Futbolista> listaJugadoresPosicion(Puesto puesto){
        return futbolistas.stream().filter(futbolista -> futbolista.getPuesto().equals(puesto)).toList();
    }
    public OptionalDouble edadMediaJugador(){
        return futbolistas.stream()
                .mapToInt(Futbolista::calcularEdad)
                .average();
    }
    public Futbolista obtenerFutbolistaMasJoven () {
        return futbolistas.stream()
                .max(Comparator.comparing(Futbolista::getFechaNacimiento))
                .get();
    }
    public Futbolista obtenerFutbolistaMasViejo () {
        return futbolistas.stream()
                .min(Comparator.comparing(Futbolista::getFechaNacimiento))
                .get();
    }
}
