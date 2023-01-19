package org.example;

public class StringHelper {

    public static String reverseWord(String word) {
        if (word==null || word.isEmpty()){
            throw new IllegalArgumentException();
        }
        String reverseWord="";
        for (int i = word.length(); i > 0; i--) {
            reverseWord += word.charAt(i - 1);
        }
        return reverseWord;
    }
    }