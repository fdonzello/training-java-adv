package com.training.eng.streams;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        stream();
        parallelStream();
    }

    private static void stream() {
        List<String> movies = new ArrayList<>();
        movies.add("Armageddon");
        movies.add("La vita è bella");
        movies.add("La grande bellezza");
        movies.add("Forrest Gump");
        movies.add("Rocky");
        movies.add("Titanic");
        movies.add("Il miglio verde");
        movies.add("Tre uomini e una gamba");

        movies
                .stream()
                .filter(v -> v.startsWith("L"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void parallelStream() {
        List<String> movies = new ArrayList<>();
        movies.add("Armageddon");
        movies.add("La vita è bella");
        movies.add("La grande bellezza");
        movies.add("Forrest Gump");
        movies.add("Rocky");
        movies.add("Titanic");
        movies.add("Il miglio verde");
        movies.add("Tre uomini e una gamba");

        movies
                .parallelStream()
                .filter(v -> v.startsWith("L"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
