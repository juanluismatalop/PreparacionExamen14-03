package Polimorfismo.Ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        double[] numbers = new Random().doubles(0,350).limit(10).toArray();
        //System.out.println(Arrays.stream(numbers).);
        System.out.println(Arrays.stream(numbers).max());
        System.out.println(Arrays.stream(numbers).min());
        System.out.println(Arrays.stream(numbers).sum());
        System.out.println(Arrays.stream(numbers).average());

    }
}
