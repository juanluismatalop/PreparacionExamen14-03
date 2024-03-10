package Genericos;

import java.util.List;

public class ArrayGenericos <T extends Number>{
    private final List<T> data;

    public ArrayGenericos(List<T> data) {
        this.data = data;
    }
    public int obtenerNumeroValores(){
        return  data.size();
    }
    public double obtenerValorMaximo(){
        double mayor = data.get(0).doubleValue();
        for (int i = 1 ; i<data.size();i++){
            if (data.get(i).doubleValue() > mayor)
                mayor = data.get(i).doubleValue();
        }
        return mayor;
    }
    public double calcularValorMedio(){
        double suma = 0;
        for(Number number : data){
            suma += number.doubleValue();
        }
        return suma/ data.size();
    }
    public static double calcularValorMinimo(List<? extends Number> list){
        double minimo = (double) list.get(0);
        for (int i = 1; i < list.size(); i++){
            double valor = list.get(i).doubleValue();
            if (valor < minimo)
                minimo = valor;
        }
        return minimo;
    }
}
