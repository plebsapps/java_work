package ch.plebsapps.ausnahmen;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWitResources {
    public static void main(String[] args) {
        //tryMethode();

        TryWitResources tryIt = new TryWitResources();
        tryIt.eigeneAutoCloseable();

    }

    public void eigeneAutoCloseable() {
        try (Output output = new Output();
             Input input = new Input()) {
            System.out.println("Try Block");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void tryMethode() {

        try (Scanner scanner = new Scanner(Paths.get("eingabe.txt"));
             PrintWriter writer = new PrintWriter("ausgabe.txt")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Output implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Close Output");
        }
    }

    class Input implements AutoCloseable {
        Input(){
          //  System.out.println(1/0); //Exception
        }
        @Override
        public void close() throws Exception {
            System.out.println("Close Input");
        }
    }
}