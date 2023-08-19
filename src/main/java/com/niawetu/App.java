package com.niawetu;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter message: ");
        String message = scanner.nextLine();

        System.out.print ("Enter Shift value: ");
        int shift = scanner.nextInt();

         String encodedMessage = Cipher.encode(message, shift);
         System.out.println("Encoded message: " + encodedMessage);

        String decodedMessage = Cipher.decode(encodedMessage, shift);

        System.out.println("Decoded message: " + decodedMessage);
        scanner.close();

    }
}
