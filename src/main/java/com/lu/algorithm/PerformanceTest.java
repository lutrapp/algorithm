package com.lu.algorithm;

public class PerformanceTest {

    public static void main(String[] args) {
        int iterations = 100;
        long totalDuration = 0;

        // Warm-up
        for (int i = 0; i < iterations; i++) {
            executeMethod();
        }

        // Medição de performance
        for (int i = 0; i < iterations; i++) {
            long startTime = System.nanoTime();
            executeMethod();
            long endTime = System.nanoTime();
            totalDuration += (endTime - startTime);
        }

        double averageDuration = totalDuration / (double) iterations;
        System.out.println("Duração média (ns): " + averageDuration);
    }

    public static void executeMethod() {
        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
    }
}
//    Este exemplo inclui um período de "aquecimento" para garantir que a JVM esteja otimizada antes de medir a performance, e a média das execuções é calculada para obter uma medida mais precisa.










