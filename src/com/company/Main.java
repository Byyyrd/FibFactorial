package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(factRec(3));
    }

    public static int fibIter(int n) {
        if (n <= 2)
            return 1;

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

    public static int fibRec(int n) {
        if(n <= 2)
            return 1;

        return fibRec(n-1) + fibRec(n-2);

    }

    public static int factRec(int n) {
        if(n == 0)
            return 1;
        return n * factRec(n-1);
    }

    public static int factIter(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
