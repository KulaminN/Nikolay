package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int N = x.nextInt();
        int A[] = new int[N];
        System.out.println("Введите элементы");
        for (int i = 0; i < N; i++) {
            A[i] = x.nextInt();
        }
        System.out.println("Элементы в обратном порядке");
        for (int i = A.length - 1; i >= 0; i--) {
            System.out.println(A[i]);
        }

    }
}