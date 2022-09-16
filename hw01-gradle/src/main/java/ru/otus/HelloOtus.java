package ru.otus;

import java.util.Objects;

import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Ordering;

public class HelloOtus {
    public static void main(String[] args) {

        ImmutableSortedMap<String, Integer> salary = new ImmutableSortedMap
                .Builder<String, Integer>(Ordering.natural())
                .put("John", 1000)
                .put("Jane", 1500)
                .put("Loros", 2000)
                .put("Tom", 2000)
                .build();

        assert ("Loros".equals(salary.firstKey()));
        assert (2000 == Objects.requireNonNull(salary.lastEntry()).getValue());
        System.out.println("This compiles and works!");
    }
}