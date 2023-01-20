package com.sxn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(gcd(a, b));

    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b % a, a);
    }
}
