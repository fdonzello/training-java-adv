package com.training.eng.io;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IoStream {
    public static void main(String[] args) {
//        readFile();
        writeFile();
//        copy();
    }


    private static void readFile() {
        File assetsDirectory = new File("./assets");

        File fileToRead = new File(assetsDirectory, "input.txt");
        try {
            FileReader fileReader = new FileReader(fileToRead);
            BufferedReader b = new BufferedReader(fileReader);
            String line;
            while ((line = b.readLine()) != null) {
                System.out.println(
                        String.format(
                                "read: %s",
                                line
                        ));
            }
            b.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile() {
        File assetsDirectory = new File("./assets");

        File fileToWrite = new File(assetsDirectory, "test.txt");
        try {
            FileWriter fileWriter = new FileWriter(fileToWrite);
            BufferedWriter w = new BufferedWriter(fileWriter);
            for (int i = 0; i < 10; i++) {
                w.write(String.format("index: %d", i));
            }
            w.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy() {
        File assetsDirectory = new File("./assets");
        System.out.println(assetsDirectory.getAbsolutePath());

        File inputFile = new File(assetsDirectory, "input.txt");
        File outputFile = new File(assetsDirectory, "output.txt");

        try {
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);
            BufferedReader inb = new BufferedReader(in);
            BufferedWriter outb = new BufferedWriter(out);
            int c;
            while ((c = inb.read()) != -1) {
                outb.write(c);
            }
            inb.close();
            outb.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
