package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Zadacha_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (x < 2 && y < x && x * x + y * y > 4) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
