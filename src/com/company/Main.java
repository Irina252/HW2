package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 347693485;
        while (a != 0) {
            int x = a % 10;
            a = a / 10;
            if (x % 3 == 0 && x % 2 == 0) {
                System.out.println("fizzbuzz");
            } else if (x % 3 == 0) {
                System.out.println("buzz");
            } else if (x % 2 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(x);
            }
        }
        a = 347693485;
        for (int c = 1000_000_000; c > 0; c /= 10) {
            if (a < c) {
                continue;
            }
            int f = (a / c);
            a = a - f * c;
            System.out.println(f);
            if (f % 3 == 0 && f % 2 == 0) {
                System.out.println("fizzbuzz");
            } else if (f % 3 == 0) {
                System.out.println("buzz");
            } else if (f % 2 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(f);
            }

        }

    }
}
