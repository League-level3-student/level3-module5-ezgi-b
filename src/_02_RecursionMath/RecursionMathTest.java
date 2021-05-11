package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        
        // Add more JUnit tests like the one above to test your method
        assertEquals(16, RecursionMath.recursiveMultiplication(4, 4));
        assertEquals(21, RecursionMath.recursiveMultiplication(7, 3));
        assertEquals(99, RecursionMath.recursiveMultiplication(9, 11));
        assertEquals(1, RecursionMath.recursiveMultiplication(1, 1));
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
        assertEquals(5, RecursionMath.recursiveDivision(10, 2));
        assertEquals(3, RecursionMath.recursiveDivision(38, 12));
        assertEquals(18, RecursionMath.recursiveDivision(91, 5));
        assertEquals(0, RecursionMath.recursiveDivision(3, 4));
        assertEquals(1, RecursionMath.recursiveDivision(1, 1));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(1, RecursionMath.recursivePower(1, 1));
    	assertEquals(2048, RecursionMath.recursivePower(2, 11));
    	assertEquals(729, RecursionMath.recursivePower(3, 6));
    	assertEquals(36, RecursionMath.recursivePower(6, 2));
    }
}
