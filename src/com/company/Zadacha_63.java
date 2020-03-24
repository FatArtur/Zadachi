package com.company;

import java.util.Scanner;

public class Zadacha_63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите размер массива");
        int n =scan.nextInt();
        if (1<=n && n<=100) {
//            String a = scan.next();
//            String arr[] = a.split("\\s+", n);
            int[] arr = new int[n];
            for(int i = 0; i<arr.length; i++ ) {
                System.out.println("введите " + i + " элемент массива  = ");
                arr[i] = scan.nextInt();
            }
            for (int j = 0; j < arr.length; j++) {
                if (j % 2 == 0)
                    System.out.print(arr[j] + " ");
            }
        }
        else
            System.out.print("Error");
    }
}
