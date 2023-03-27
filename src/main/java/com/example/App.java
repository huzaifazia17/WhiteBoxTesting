package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of the character array: ");
        int arrayLength = scanner.nextInt();
        scanner.nextLine();

        char[] characterArray = new char[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter character " + (i + 1) + ": ");
            characterArray[i] = scanner.nextLine().charAt(0);
        }

        System.out.print("Please enter the target character: ");
        char target = scanner.nextLine().charAt(0);

        int occurrences = countNumOfCharOccurrences(characterArray, target);
        System.out.println(
                "The target character '" + target + "' appears " + occurrences
                        + " time(s) in the given character array.");

        scanner.close();
    }

    public static int countNumOfCharOccurrences(char[] characterArray, char target) {
        int counter = 0;
        for (char c : characterArray) {
            if (c == target) {
                counter++;
            }
        }
        return counter;
    }
}