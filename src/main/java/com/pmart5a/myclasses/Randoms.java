package com.pmart5a.myclasses;

import java.util.*;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected IntStream intStreamRandom;

    public Randoms(int min, int max) {
        random = new Random();
        intStreamRandom = random.ints(min, max + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return intStreamRandom.iterator();
    }
}