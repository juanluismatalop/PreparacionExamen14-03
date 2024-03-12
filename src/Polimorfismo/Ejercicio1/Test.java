package Polimorfismo.Ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        double[] datosDouble = new Random().doubles(0,350).limit(10).toArray();
        //System.out.println(Arrays.stream(datosDouble).);
        System.out.printf("Maximo valor %s%n",Arrays.stream(datosDouble).max());
        System.out.println(Arrays.stream(datosDouble).min());
        System.out.println(Arrays.stream(datosDouble).sum());
        System.out.println(Arrays.stream(datosDouble).average());

    }
}
