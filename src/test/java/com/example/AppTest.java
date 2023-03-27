package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCountOccurrences() {
        char[] emptyArray = new char[] {};
        char[] testArray1 = new char[] { 'a', 'b', 'a' };
        char[] testArray2 = new char[] { 'a', 'b', 'a', 'b' };
        char[] testArray3 = new char[] { 'b', 'a', 'a', 'b' };
        char[] testArray4 = new char[] { 'a', 'b', 'a', 'b' };

        assertEquals(0, App.countNumOfCharOccurrences(emptyArray, 'a'));
        assertEquals(2, App.countNumOfCharOccurrences(testArray1, 'a'));
        assertEquals(2, App.countNumOfCharOccurrences(testArray2, 'b'));
        assertEquals(2, App.countNumOfCharOccurrences(testArray3, 'a'));
        assertEquals(2, App.countNumOfCharOccurrences(testArray4, 'b'));

    }
}
