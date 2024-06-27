package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {
 
    @Test
    public void testAddition() {
        int sum = 2 + 2;
        assertEquals(4, sum, "2 + 2 should equal 5");
    }

}
