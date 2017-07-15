package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    public void test_when_n_is_0() throws Exception {
        assertEquals(0, fibonacci.f(0));
    }

    @Test
    public void test_when_n_is_1() throws Exception {
        assertEquals(1, fibonacci.f(1));
    }

    @Test
    public void test_when_n_is_2() throws Exception {
        assertEquals(1, fibonacci.f(2));
    }

    @Test
    public void test_when_n_is_3() throws Exception {
        assertEquals(2, fibonacci.f(3));
    }

    private int f(int n) {

        return fibonacci.f(n);
    }


}
