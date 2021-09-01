package com.codedifferently.logicDrillz.part01;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void nearHundredTest01(){
        // Given
        Problem03 problem03 = new Problem03();
        int input = 93;

        // when
        boolean actual = problem03.nearHundred(input);

        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void nearHundredTest02(){
        // Given
        Problem03 problem03 = new Problem03();
        int input = 90;

        // when
        boolean actual = problem03.nearHundred(input);

        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void nearHundredTest03(){
        // Given
        Problem03 problem03 = new Problem03();
        int input = 89;

        // when
        boolean actual = problem03.nearHundred(input);

        // then
        Assert.assertFalse(actual);
    }

    @Test
    public void nearHundredTest04(){
        // Given
        Problem03 problem03 = new Problem03();
        int input = 210;

        // when
        boolean actual = problem03.nearHundred(input);

        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void nearHundredTest05(){
        // Given
        Problem03 problem03 = new Problem03();
        int input = 112;

        // when
        boolean actual = problem03.nearHundred(input);

        // then
        Assert.assertFalse(actual);
    }
}
