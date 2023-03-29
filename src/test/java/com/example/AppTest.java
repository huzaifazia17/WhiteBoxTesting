package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testTC1() {
        char[] inputArray = { 'a', 'x', 'x', 'x' };
        char targetCharacter = 'x';
        assertEquals(3, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC2() {
        char[] inputArray = { 'a', 'x', 'c', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC3() {
        char[] inputArray = { 'x' };
        char targetCharacter = 'x';
        assertEquals(1, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC4() {
        char[] inputArray = { 'a', 'b', 'x' };
        char targetCharacter = 'x';
        assertEquals(1, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC5() {
        char[] inputArray = { 'a', 'x' };
        char targetCharacter = 'x';
        assertEquals(1, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC6() {
        char[] inputArray = {};
        char targetCharacter = 'x';
        assertEquals(0, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC7() {
        char[] inputArray = { 'a', 'x' };
        char targetCharacter = 'x';
        assertEquals(1, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC8() {
        char[] inputArray = { 'x' };
        char targetCharacter = 'x';
        assertEquals(1, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC9() {
        char[] inputArray = { 'x', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC10() {
        char[] inputArray = { 'x', 'f', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }

    @Test
    public void testTC11() {
        char[] inputArray = { 'x', 'x' };
        char targetCharacter = 'x';
        assertEquals(2, App.countNumOfCharOccurrences(inputArray, targetCharacter));
    }
}
