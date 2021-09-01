package com.codedifferently.logicDrillz.part01;

import org.junit.Assert;
import org.junit.Test;

public class Problem04Test {

    @Test
    public void hasTeenTest01(){
        // given
        Problem04 problem04 = new Problem04();
        int[] input = {13,20,10};

        // when
        boolean actual = problem04.hasTeen(input);

        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void hasTeenTest02(){
        // given
        Problem04 problem04 = new Problem04();
        int[] input = {1,10,20};

        // when
        boolean actual = problem04.hasTeen(input);

        // then
        Assert.assertFalse(actual);
    }

    @Test
    public void hasTeenTest03(){
        // given
        Problem04 problem04 = new Problem04();
        int[] input = {20,19,10};

        // when
        boolean actual = problem04.hasTeen(input);

        // then
        Assert.assertTrue(actual);
    }
}
