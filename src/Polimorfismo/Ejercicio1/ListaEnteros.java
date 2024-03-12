package Polimorfismo.Ejercicio1;

import java.util.Collections;
import java.util.List;

public class ListaEnteros implements Estadistica{
    private List<Integer> datos;

    public ListaEnteros(List<Integer> datos){
        this.datos = datos;
        Collections.sort(this.datos);
    }

    public List<Integer> getDatos() {
        return datos;
    }

    @Override
    public int obtenerNumeroValores() {
        return datos.size();
    }

    @Override
    public double obtenerValorMinimo() {
        return datos.get(0);
    }

    @Override
    public double obtenerValorMaximo() {
        return datos.get(datos.size() - 1);
    }

    @Override
    public double calcularSuma() {
        return datos.stream().reduce(0, (x, y) -> x + y).longValue();
    }

    /*@Override
    public double calcularValorMedio() {
        return 0;
    }*/

    @Override
    public double calcularDesviacionTipica() {
        double calcularValorMedio = calcularValorMedio();
        double suma = 0.0;
        for(double dato : datos)
            suma += Math.pow(dato - calcularValorMedio , 2);
        return Math.sqrt(suma / obtenerNumeroValores());
    }
}
