package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testTC1() {
        char[] inputArray = { 'a', 'b', 'c' };
        char targetCharacter = 'x';
        assertEquals(0, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC2() {
        char[] inputArray = { 'a', 'x', 'c', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC3() {
        char[] inputArray = { 'a', 'b', 'c', 'x', 'y', 'z', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC4() {
        char[] inputArray = { 'a', 'b', 'c' };
        char targetCharacter = 'x';
        assertEquals(0, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC5() {
        char[] inputArray = { 'a', 'x', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC6() {
        char[] inputArray = { 'a', 'b', 'x', 'c', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC7() {
        char[] inputArray = { 'a', 'b', 'c' };
        char targetCharacter = 'x';
        assertEquals(0, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC8() {
        char[] inputArray = { 'a', 'x', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC9() {
        char[] inputArray = { 'a', 'b', 'x', 'c', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }
}
