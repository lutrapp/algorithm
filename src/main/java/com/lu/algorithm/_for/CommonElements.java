package com.lu.algorithm._for;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {
    //TODO TESTAR COM LISTAS MAIORES
    int[] arrayA = {1, 2, 5, 7, 8};
    static List<Integer> list1 = List.of(1, 2, 5, 5, 7, 8);
    static List<Integer> list2 = List.of(5, 6, 8, 8);

    List<Integer> commonElements = new ArrayList<>();

//    public List<Integer> commonItens(List<Integer> listA, List<Integer> listB) {
//        int sizeListA = listA.size();
//        int sizeListB = listB.size();
//
//        for (int i = 0; i < sizeListA; i++) {
//            for (int j = 0; j < sizeListB; j++) {
//                if (listA.get(i).equals(listB.get(j))) {
//                    commonElements.add(listA.get(i));
//                    break;
//                }
//            }
//        }
//        return commonElements;
//    }

//using set > do not repeat elements
    public List<Integer> commonItens(List<Integer> listA, List<Integer> listB) {
        Set<Integer> set = new HashSet<>();

        int sizeListA = listA.size();
        int sizeListB = listB.size();

        for (int i = 0; i < sizeListA; i++) {
            for (int j = 0; j < sizeListB; j++) {
                if (listB.contains(listA.get(i)) && !set.contains(listA.get(i))) {
                    commonElements.add(listA.get(i));
                    set.add(listA.get(i));
//                    break;
                }
            }
        }
        return commonElements;
    }

    //uso de dois set - PIOR PERFORMANCE
//    public List<Integer> commonItens(List<Integer> listA, List<Integer> listB) {
//        // Usar Set para evitar duplicatas e permitir interseção rápida
//        Set<Integer> setA = new HashSet<>(listA);
//        Set<Integer> setB = new HashSet<>(listB);
//
//        // Interseção entre os dois conjuntos
//        setA.retainAll(setB);
//
//        // Converter o resultado em uma lista
//        return new ArrayList<>(setA);
//    }

    public static void main(String[] args) {
        CommonElements common = new CommonElements();

        //medição de performance
        int iterations = 1000;
        long totalDuration = 0;

        //warm-up(opcional)
        for(int i = 0; i <100; i++){
            common.commonItens(list1, list2);
        }

        //medição de performance
        for(int i = 0; i < iterations; i++){
            long startTime = System.nanoTime();
            common.commonItens(list1, list2);
            long endTime = System.nanoTime();
            totalDuration +=(endTime - startTime);

            //limpar commonElements para a proxima execução
            common.commonElements.clear();
        }

        double averageDuration = totalDuration/ (double) iterations;

        System.out.println("Duração média (ns): " + averageDuration);
        System.out.println("Duração média (ms): " + (averageDuration / 1_000_000.0));

        //executa uma vez para verrificar a lista de itens comuns
        List<Integer> result = common.commonItens(list1, list2);
        System.out.println("Itens comuns: " + result);
    }
}