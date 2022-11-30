package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        if (password.length() < 6) {
            return false;
        }

        boolean hasLowerCaseLetter = false;
        boolean hasUpperCaseLetter = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length() || !hasLowerCaseLetter && !hasUpperCaseLetter && !hasNumber; i++) {
            char current = password.charAt(i);
            if (Character.isDigit(current)) {
                hasNumber = true;
            } else if (Character.isUpperCase(current)) {
                hasUpperCaseLetter = true;
            } else if (Character.isLowerCase(current)) {
                hasLowerCaseLetter = true;
            }

        }

        return hasNumber && hasLowerCaseLetter && hasUpperCaseLetter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
