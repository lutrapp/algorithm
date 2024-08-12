package com.lu.algorithm.arrays_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListsExamples {
    public static void main(String[] args) {
//        lista vazia mutável
        List<String> mutableListEmpty = new ArrayList<>();

//        lista com elementos(mutável)
        List<String> mutableListWithElements = new ArrayList<>(List.of("laranja", "alface", "morango"));
        System.out.println("mutableListWithElements-before-changes: " + mutableListWithElements);

        mutableListWithElements.set(2, "caju");
        System.out.println("mutableListWithElements-after-set: " + mutableListWithElements);

        mutableListWithElements.add(0, "coco");

        System.out.println("mutableListWithElements-after-add: " + mutableListWithElements);

//        lista com elementos (imutável)
        List<String> immutableList = List.of("maçã", "alface", "tomate");
//        immutableList.add(0, "laranja"); //lança UnsupportedOperationException
//        immutableList.set(2, "caju"); //lança UnsupportedOperationException

//        lista a partir de um Array
        String[] array = {"maça", "cebola", "berinjela"};
        List<String> imutableListFromArray = Arrays.asList(array); //imutável mas permite substituir um elemento
        imutableListFromArray.set(1, "couve");
        System.out.println("imutableListFromArray-after-changes: " + imutableListFromArray);


//        unmodificableList > se alterar a original, altera a unmodificable ....
        List<String> modificableList = new ArrayList<>(List.of("laranja", "alface", "morango"));
        modificableList.add(1, "abacaxi");

        List<String> unmodificableList = Collections.unmodifiableList(modificableList);
//        unmodificableList.add(0, "any"); //lança UnsupportedOperationException
        System.out.println("unmodificableList: " + unmodificableList);
        modificableList.add(0, "ovo");
        System.out.println("modificableList-after-change: " + modificableList);
        System.out.println("unmodificableList: " + unmodificableList);

//        Como Modificar o Tamanho da Lista:
//        Se precisar de uma lista onde o tamanho possa ser alterado (adicionar ou remover elementos),
//         pode criar uma nova lista a partir da lista fixa, como um ArrayList:
        List<String> modifiableList = new ArrayList<>(Arrays.asList(array));

        modifiableList.add("pepino");
        modifiableList.remove("maçã");


    }
}

