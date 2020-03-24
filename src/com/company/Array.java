package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1;
        int n = 5;
//        arr1 = new int [n];
//        for (int i=0; i < n; i++) {
//            System.out.println("Введите массив аrr1[" + i + "]");
//            arr1[i] = scan.nextInt ();
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("____________");
        Random rnd = new Random();
        int arr2[] = new int[n];
        for (int i=0; i < arr2.length; i++) {
            arr2[i] = rnd.nextInt();
            System.out.println("Значение массива аrr2[" + arr2[i] + "]");
        }
        Arrays.sort(arr2);
        System.out.println("________________________");
        System.out.println(Arrays.toString(arr2));
        int arr3[] = new int[n];
        for (int i=0; i<n; i++){
            arr3[i]=arr2[i];// скопировали данные с массива arr2 в arr3
        }
        for (int x : arr2)
            System.out.println(x);
        System.out.println("______________");
        for (int x : arr3)
            System.out.println(x);
        arr2[1]=1111; // изменение значения во 2 ячейки массива arr2
        System.out.println(Arrays.toString(arr2));
        System.out.println("______________");
        System.out.println(Arrays.toString(arr3));
    }
}
