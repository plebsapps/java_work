package ch.plebsapps.javaselib;

import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) {
        // Codierung
        String originalInput = "Hello, World!";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());

        System.out.println("Original String: " + originalInput);
        System.out.println("Base64 Encoded String: " + encodedString);

        // Decodierung
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);

        System.out.println("Decoded String: " + decodedString);
    }
}
