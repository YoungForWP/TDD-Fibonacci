package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void test_when_n_is_0() throws Exception {
        assertEquals(0, fibonacci(0));
    }

    @Test
    public void test_when_n_is_1() throws Exception {
        assertEquals(1, fibonacci(1));
    }

    @Test
    public void test_when_n_bigger_than_2() throws Exception {
        assertEquals(1, fibonacci(2));
        assertEquals(2, fibonacci(3));
        assertEquals(3, fibonacci(4));
        assertEquals(5, fibonacci(5));
        assertEquals(8, fibonacci(6));
        assertEquals(13, fibonacci(7));
    }

    private int fibonacci(int n) {
        if( n >= 2){
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return n;
    }
}
