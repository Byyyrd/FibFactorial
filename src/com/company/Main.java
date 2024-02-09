package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibInterativ(8));
    }

    public static int fibInterativ(int n) {
        if (n == 2)
            return 2;
        if (n <= 1)
            return 0;

        int first = 1;
        int second = 1;
        int third = 2;
        for (int i = 3; i < n; i++) {
            first = second;
            second = third;
            third = first + second;
        }

        return third;

    }
}
