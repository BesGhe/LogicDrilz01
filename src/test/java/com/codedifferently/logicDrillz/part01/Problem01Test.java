package com.codedifferently.logicDrillz.part01;

import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {

    @Test
    public void sleepInTest01(){
        // Given
        Problem01 problem01 = new Problem01();
        boolean weekday = false;
        boolean vacation = false;

        // When
        boolean actual = problem01.sleepIn(weekday, vacation);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void sleepInTest02(){
        // Given
        Problem01 problem01 = new Problem01();
        boolean weekday = true;
        boolean vacation = false;

        // When
        boolean actual = problem01.sleepIn(weekday, vacation);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void sleepInTest03(){
        // Given
        Problem01 problem01 = new Problem01();
        boolean weekday = false;
        boolean vacation = true;

        // When
        boolean actual = problem01.sleepIn(weekday, vacation);

        // Then
        Assert.assertTrue(actual);
    }
}
