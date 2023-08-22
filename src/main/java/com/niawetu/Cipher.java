package com.niawetu;

//Caesar Cipher Application
public class Cipher {
    public static String encode(String message, int key) {
        StringBuilder encodedMessage = new StringBuilder();

        for(char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char encodedChar = (char) (((c - 'a' + key) % 26) + 'a');
                encodedMessage.append(encodedChar);
            } else {
                encodedMessage.append(c);
            }
        }
            return
                    encodedMessage.toString();
        }
        public static String decode(String message, int key) {
        return encode(message, 26 - key);
        }


    public static String encode(String message) {
        return message;
    }
}