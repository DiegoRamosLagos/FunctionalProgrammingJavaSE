package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));

        // Definición rápida
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        // Un predicate es una especie de función que retorna un boolean
        Predicate<Integer> isEven = x -> x % 2 == 0;
        isEven.test(4); // true

        Predicate<Student> isApproved = student -> student.getMark() >= 6.0;
        Student sinhue = new Student(5.9);
        System.out.println(isApproved.test(sinhue));
    }

    static class Student {
        private double mark;

        public Student(double mark) {
            this.mark = mark;
        }

        public double getMark() {
            return mark;
        }
    }
}
