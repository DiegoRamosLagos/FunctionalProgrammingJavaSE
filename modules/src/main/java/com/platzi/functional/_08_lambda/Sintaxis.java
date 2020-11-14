package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "Functional");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(() -> 2);
        usarPredicado(text -> text.isEmpty());
        usarBiFunction((x, y) -> x * y);
        // cuando quiero hacer mas cosas en el lambda
        usarBiFunction((x, y) -> {
            System.out.println("X: " + x + "Y: " + y);
            return x - y;
        });
        usarNada(() -> {
            System.out.println("Hola alumno, aqui no hay nada");
        });
    }

    static void usarZero(ZeroArgumentos zeroArgumentos) {

    }

    static void usarPredicado(Predicate<String> predicate) {

    }

    static void usarBiFunction( BiFunction<Integer, Integer, Integer> operacion) {

    }

    static void usarNada(OperarNada operarNada) {

    }

    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }
}
