package com.lu.algorithm.arrays_strings;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeString {

    ArrayList<String> merge(String[] words, String[] more){
        ArrayList<String> sentence = new ArrayList<>();
        for(String w: words) sentence.add(w);
        for(String w: more) sentence.add(w);
        return sentence;
    }

    public static void main(String[] args) {
        MergeString mergeString = new MergeString();
        List<String> y = List.of("maçã", "alface", "tomate");
        List<String> z = List.of("amarelo", "vermelho", "verde");

        // Converter List<String> para String[]
        String[] arrayY = y.toArray(new String[0]);
        String[] arrayZ = z.toArray(new String[0]);


        ArrayList<String> lista = mergeString.merge(arrayY, arrayZ);
        System.out.println("mergeList: " + lista);
    }
}
