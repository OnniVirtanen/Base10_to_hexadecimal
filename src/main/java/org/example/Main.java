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
        String convertedNumbers = "";

        // Convert base10 number to hex.
        while (true) {
            remainder = quotient % divisor;
            quotient /= divisor;

            // Concatenating a hex value to convertedNumbers variable.
            switch (remainder) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    convertedNumbers += remainder;
                    break;
                case 10:
                    convertedNumbers += 'a';
                    break;
                case 11:
                    convertedNumbers += 'b';
                    break;
                case 12:
                    convertedNumbers += 'c';
                    break;
                case 13:
                    convertedNumbers += 'd';
                    break;
                case 14:
                    convertedNumbers += 'e';
                    break;
                case 15:
                    convertedNumbers += 'f';
                    break;
            }

            // Break out of the loop, when all numbers are converted to hex values.
            if (quotient == 0.0) {
                break;
            }
        }

        // Reverse the string to get the MSB(Most Significant Bit) first.
        String str = convertedNumbers, nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }

        // Print the hexadecimal value to user.
        System.out.println("Hexadecimal: " + nstr);
    }
}