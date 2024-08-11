package com.lu.algorithm._for;

import java.util.List;

public class SimpleFor {

    int[] arrayA = {1,2,5,7,8};
    List<Integer> listA = List.of(1,2,5,7,8);
    List<Integer> listB = List.of(5, 6, 8);
    int n = listA.size();
    public int forSimples(List<Integer> a, int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + a.get(i);
        }
        return s;
    }

    public static void main(String[] args) {
        List<Integer> listA = List.of(1, 2, 5, 7, 8);
        SimpleFor example = new SimpleFor();
        int sum = example.forSimples(listA, listA.size());
        System.out.println("Sum: " + sum);
    }
}
