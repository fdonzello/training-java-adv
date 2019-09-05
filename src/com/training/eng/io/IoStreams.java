package com.training.eng.io;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IoStreams {
    public static void main(String[] args) {
        readFileWithStreams();
    }

    private static void readFileWithStreams() {
        try {
            Stream<String> stream = Files.lines(
                    Paths.get("./assets/input.txt")
            );
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void readFileWithStreamsPlus() {
        try  {
            BufferedReader br = Files.newBufferedReader(Paths.get("./assets/input.txt"));
            List<String> list = br
                    .lines()
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
