package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int b = 2;
        Scanner x = new Scanner(System.in);
        System.out.println("Введите кол-во чисел Фибаначи");
        int N = x.nextInt();
        N=N+2;
        int[] A = new int[N];
        if (N<=4)
            System.out.println("ERROR");
        else {

            A[1] = 1;
            A[2] = 2;
            while (b != A.length) {

                A[b] = A[b - 1] + A[b - 2];
                System.out.print(A[b] + " ");
                b++;
            }
        }
    }
}