package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList("Java", "Frontend", "Backend", "Fullstack");

        for (String course:
             courseList) {
            String courseName = course.toLowerCase().replace("!", "!!");
            System.out.println("Platzi: " + courseName);
        }

        Stream<String> coursesStream = Stream.of("Java", "Frontend", "Backend", "Fullstack");
        //Stream<Integer> courseLenghtStream = coursesStream.map(course -> course.length());
        //Optional<Integer> longest = courseLenghtStream.max((x, y) -> y-x);
        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("Java"));
        justJavaCourses.forEach(System.out::println);

        Stream<String> coursesStream2 = courseList.stream();

        addOperator(
                coursesStream2
                .map(course -> course + "!!")
                .filter(course -> course.contains("Java"))

        ).forEach(System.out::println);
    }

    static <T> Stream<T> addOperator(Stream<T> stream) {
        // toma un consumer pero no modifica sus datos
        return stream.peek(dato -> System.out.println("Dato: " + dato));
    }
}
