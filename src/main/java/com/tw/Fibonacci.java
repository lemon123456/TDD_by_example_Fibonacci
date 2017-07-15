package com.tw;

public class Fibonacci {
    public Fibonacci() {
    }

    int f(int n) {
        if (n >= 2) {
            return f(n - 2) + f(n - 1);
        }

        return n;
    }
}