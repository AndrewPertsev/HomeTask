package by.epam.jwd36.andrewpertsev.hometask2;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumArrayElementsK {
    public static void main(String[] args) {
        int massiveSize = 7;
        int divisorK = 3;
        int[] massive;
        int sum = 0;

        SumArrayElementsK sumElements = new SumArrayElementsK();

        massive = sumElements.generateRandomMassive(massiveSize);
        sum = sumElements.calculateSumArrayElementsK(massive, divisorK);

        printIntMassive("Random int massive : ", massive);
        printParameters(divisorK, sum);

    }

    public int calculateSumArrayElementsK(int massive[], int divisor) {
        if (massive.length <= 0) {
            throw new IllegalArgumentException("Massive length should be greater than 0");
        }
        if (divisor < 1) {
            throw new IllegalArgumentException("Divisor should be greater than 0");
        }

        int sum = 0;
        sum = Arrays.stream(massive).filter(x -> x % divisor == 0).sum();

        return sum;
    }


    public int[] generateRandomMassive(int massiveSize) {
        if (massiveSize <= 0) {
            throw new IllegalArgumentException("Wrong massive size! Massive length should be greater than 0") {
            };
        }

        int[] massive;
        massive = IntStream.range(0, massiveSize).map(x -> ((int) (Math.random() * 10))).toArray();

        return massive;
    }

    public static void printIntMassive(String messageForConsole, int[] massive) {
        if (massive.length <= 0) {
            throw new IllegalArgumentException("Massive length should be greater than 0");
        }

        System.out.print(messageForConsole);
        Arrays.stream(massive).forEach(x -> System.out.print(" " + x));
    }

    public static void printParameters(int divisorK, int sum) {
        System.out.println("\nYour divisor K = " + divisorK);
        System.out.println("Sum of divisorK-multiple elements = " + sum);
    }

}
