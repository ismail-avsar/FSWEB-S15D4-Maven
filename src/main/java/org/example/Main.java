package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("Test"));
        System.out.println(checkForPalindrome("Welcome"));
    }

    public static boolean checkForPalindrome(String text) {
        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        LinkedList<Character> charList = new LinkedList<>();
        for (char c : cleanedStr.toCharArray()) {
            charList.add(c);
        }

        while (charList.size() > 1) {
            char first = charList.pollFirst();
            char last = charList.pollLast();
            if (first != last) {  // .equals() yerine != kullanın
                return false;
            }
        }

        return true;
    }

    public static String convertDecimalToBinary(int decimal) {
        LinkedList<Integer> binaryList = new LinkedList<>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal /= 2;
        }
        StringBuilder binaryString = new StringBuilder();
        for(int digit : binaryList){
            binaryString.append(digit);
        }
        return binaryString.toString();
    }

}