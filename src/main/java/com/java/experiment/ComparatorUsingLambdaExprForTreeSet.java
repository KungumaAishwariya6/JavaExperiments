package com.java.experiment;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorUsingLambdaExprForTreeSet {

    public static void main(String[] args) {

        Set<Integer> integerSet = new TreeSet<Integer>((v1, v2) -> (v1 > v2)?1:(v1<v2)?-1:0);
        integerSet.add(21);
        integerSet.add(5);
        integerSet.add(47);
        integerSet.add(1);

        System.out.println(integerSet);

        char x = 'X';
        int i = 0;
        System.out.print(true ? x : 0);
        System.out.print(false ? i : x);

    }
}
