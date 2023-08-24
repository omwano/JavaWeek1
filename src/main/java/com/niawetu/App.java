package com.niawetu;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter your message here: ");
        String message = scanner.nextLine();

        System.out.print ("Enter the  shift key value: ");
        int key = scanner.nextInt();

         String encodedMessage = Cipher.encode(message);
         System.out.println("Encoded message: " + encodedMessage);

        String decodedMessage = Cipher.decode(encodedMessage,key);

        System.out.println("Decoded message: " + decodedMessage);
        scanner.close();

    }
}
