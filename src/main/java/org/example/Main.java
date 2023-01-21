package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask user for a base10 number.
        System.out.print("Type in a Base 10 number lower than 2.1 billion: ");
        int numberInput = scanner.nextInt();

        // Initializing variables used inside while loop.
        int quotient = numberInput, remainder;
        byte divisor = 16;
        StringBuilder convertedNumbers = new StringBuilder();

        // Convert base10 number to hex.
        while (quotient > 0) {
            remainder = quotient % divisor;
            quotient /= divisor;

            // Concatenating a hex value to convertedNumbers variable.
            char[] hexValues = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            convertedNumbers.append(hexValues[remainder]);
        }

        // Reverse the string to get the MSB(Most Significant Bit) first.
        convertedNumbers.reverse().toString();

        // Print the hexadecimal value to user.
        System.out.println("Hexadecimal: " + convertedNumbers);
    }
}