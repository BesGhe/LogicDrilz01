package com.codedifferently.logicDrillz.part01;

import org.junit.Assert;
import org.junit.Test;
import java.lang.Math;

public class Problem02Test {

    @Test
    public void diff21Test01(){
        // Given
        Problem02 problem02 = new Problem02();
        int input = 19;
        int expected = 2;

        // When
        int actual = problem02.diff21(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void diff21Test02(){
        // Given
        Problem02 problem02 = new Problem02();
        int input = 10;
        int expected = 11;

        // When
        int actual = problem02.diff21(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void diff21Test03(){
        // Given
        Problem02 problem02 = new Problem02();
        int input = 21;
        int expected = 0;

        // When
        int actual = problem02.diff21(input);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
