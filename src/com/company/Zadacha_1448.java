package com.company;

import java.util.Scanner;

public class Zadacha_1448 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите кол-во бочек");
        int n =scan.nextInt();
        if (0<=n && n<=1000) {
            if (n>=11 && n<=14)
                System.out.println(n + " bochek");
            else {
            int i = n % 10;
            if (i == 1)
                System.out.println(n + " bochka");
            if (i>1 && i < 5)
                System.out.println(n + " bochki");
            if (i >=5 || i ==0)
                System.out.println(n + " bochek");
            }
        }
        else System.out.println("Введено неверное кол-во бочек");
    }
}
