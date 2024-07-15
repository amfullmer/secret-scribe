package com.secretscribe.Codes;

public class ReverseMessage {
    /*

     */

    public String reverseMessage(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be null or empty");
        }

        StringBuilder reversedMessage = new StringBuilder();

        int i = text.length();

        while (i > 0) {
            reversedMessage.append(text.charAt(i-1));
            i++;
        }

        return reversedMessage.toString();
    }

}