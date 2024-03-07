package Stream;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Futbolista[] futbolistas = new Futbolista[11];
        futbolistas[0] = new Futbolista("evans, marck", LocalDate.of(2000, 10, 10),
                Puesto.PORTERO, "12345678a");
        futbolistas[1] = new Futbolista("swift, nathan", LocalDate.of(2010, 10, 10),
                Puesto.DEFENSA, "12345678b");
        futbolistas[2] = new Futbolista("wallside, jack", LocalDate.of(2001, 10, 10),
                Puesto.DEFENSA, "12345678c");
        futbolistas[3] = new Futbolista("wrait, jim", LocalDate.of(2008, 10, 10),
                Puesto.DEFENSA, "12345678d");
        futbolistas[4] = new Futbolista("iroside, tod", LocalDate.of(2011, 10, 10),
                Puesto.DEFENSA, "12345678e");
        futbolistas[5] = new Futbolista("grim, steve", LocalDate.of(2015, 10, 10),
                Puesto.CENTROCAMPISTA, "12345678f");
        futbolistas[6] = new Futbolista("saunder, timmy", LocalDate.of(2015, 11, 10),
                Puesto.CENTROCAMPISTA, "12345678g");
        futbolistas[7] = new Futbolista("carson, maxwell", LocalDate.of(2015, 12, 10),
                Puesto.CENTROCAMPISTA, "12345678f");
        futbolistas[8] = new Futbolista("sharp, jude", LocalDate.of(2010, 1, 10),
                Puesto.CENTROCAMPISTA, "12345678g");
        futbolistas[9] = new Futbolista("blace, axel", LocalDate.of(2015, 10, 10),
                Puesto.DELANTERO, "12345678h");
        futbolistas[10] = new Futbolista("dragonfly, kevin", LocalDate.of(2015, 2, 10),
                Puesto.DELANTERO, "12345678i");
        EquipoFutbol equipoFutbol = new EquipoFutbol("Raimon");
        for (Futbolista futbolista : futbolistas){
            System.out.printf("Añadido jugador? %B%n",equipoFutbol.ficharJugador(futbolista));
        }
        System.out.println("====MAS JOVEN======");
        System.out.println(equipoFutbol.obtenerFutbolistaMasJoven());
    }
}
