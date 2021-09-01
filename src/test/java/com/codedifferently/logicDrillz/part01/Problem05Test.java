package com.codedifferently.logicDrillz.part01;

import org.junit.Assert;
import org.junit.Test;

public class Problem05Test {

    @Test
    public void stringMatchTest01(){
        // Given
        Problem05 problem05 = new Problem05();
        String stringA = "xxcaazz";
        String stringB = "xxbaaz";
        int expected = 3;

        // When
        int actual = problem05.stringMatch(stringA, stringB);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringMatchTest02(){
        // Given
        Problem05 problem05 = new Problem05();
        String stringA = "abc";
        String stringB = "abc";
        int expected = 2;

        // When
        int actual = problem05.stringMatch(stringA, stringB);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringMatchTest03(){
        // Given
        Problem05 problem05 = new Problem05();
        String stringA = "abc";
        String stringB = "axc";
        int expected = 0;

        // When
        int actual = problem05.stringMatch(stringA, stringB);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
