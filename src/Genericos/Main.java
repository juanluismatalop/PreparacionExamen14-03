package Genericos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayGenericos<Float> arrayFloat = new ArrayGenericos<>(List.of(2.2f, 3.3f, 1.1f, 5.5f, 4.4f));
        ArrayGenericos<Float> arrayLong = new ArrayGenericos<>(List.of(12f, 21f, 11f, 4f, 5_000f, 4f));
        mostrarDatos(arrayFloat);
        System.out.println("----------------------------------------");
        mostrarDatos(arrayLong);
        System.out.println("----------------------------------------");
        List<Double> arrayDouble = List.of(2.2, 3.3, 5.5, 1.1, 6.6);
        double minimo = ArrayGenericos.calcularValorMinimo(arrayDouble);
        System.out.printf("Valor mínimo: %.2f%n", minimo);
    }

    private static void mostrarDatos(ArrayGenericos<Float> arrayFloat) {
        System.out.printf("Nº datos: %d%n", arrayFloat.obtenerNumeroValores());
        System.out.printf("Valor máximo: %.2f%n", arrayFloat.obtenerValorMaximo());
        System.out.printf("Valor medio: %.2f%n", arrayFloat.calcularValorMedio());
    }
}
