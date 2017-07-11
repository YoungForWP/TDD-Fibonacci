package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void test_when_n_is_0() throws Exception {
        assertEquals(0, fibonacci(0));
    }

    private int fibonacci(int n) {
        return n;
    }
}
