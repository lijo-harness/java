package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testGetGreeting() {
        App app = new App();
        assertEquals("Hello, World!", app.getGreeting(), "The greeting should be 'Hello, World!'");
    }

    @Test
    void testAddMethod() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "2 + 3 should be 5");
        assertEquals(0, app.add(-1, 1), "-1 + 1 should be 0");
        assertEquals(10, app.add(10, 0), "10 + 0 should be 10");
    }

    @Test
    void testAddMethodWithNegativeNumbers() {
        App app = new App();
        assertEquals(-5, app.add(-2, -3), "-2 + -3 should be -5");
    }
}
