package ch.plebsapps.ausnahmen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    public static void main(String[] args) {

        //eineException();
        //mehrereException1();
        //mehrereException2();
        //exceptionFinaly();
        exceptionReadLines();
    }

    private static void exceptionReadLines() {
        try {
            Path path  = Paths.get("numbers.dat");
            List<String> list = Files.readAllLines(path);
            for (String line: list){
                //Make something
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void exceptionFinaly() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Erste Zeile");
        list.add("Zweite Zeile");
        try {
            Path path = Paths.get("dateiname.txt");

            Files.write(path, list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally");
        }
    }

    private static void mehrereException2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Erste Zeile");
        list.add("Zweite Zeile");
        try {
            Integer.parseInt("hh");
            Path path = Paths.get("dateiname.txt");

            Files.write(path, list);
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    private static void mehrereException1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Erste Zeile");
        list.add("Zweite Zeile");
        try {
            Integer.parseInt("hh");
            Path path = Paths.get("dateiname.txt");

            Files.write(path, list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
    }

    private static void eineException() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Erste Zeile");
        list.add("Zweite Zeile");
        try {
            Path path = Paths.get("dateiname.txt");

            Files.write(path, list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
