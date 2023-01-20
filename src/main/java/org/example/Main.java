package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask user for a base10 number.
        System.out.print("Type in a Base 10 number with a maximum value of 2 billion: ");
        int numberInput = scanner.nextInt();

        // Convert base10 number to hex.
        int quotient = numberInput, remainder;
        byte divisor = 16;
        String convertedNumbers = "";

        while (true) {
            remainder = quotient % divisor;
            quotient /= divisor;
            /**
             System.out.println("quotient" + quotient);
             System.out.println("remainder" + remainder);
             */
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

            if (quotient == 0.0) {
                break;
            }
        }

        String str = convertedNumbers, nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }

        System.out.println("Hex: " + nstr);
    }
}