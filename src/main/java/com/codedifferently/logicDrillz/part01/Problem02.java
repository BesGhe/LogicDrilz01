

package com.codedifferently.logicDrillz.part01;

public class Problem02 {

    /**
     * Problem 02: diff21
     * Given an int n, return the absolute difference between n and 21,
     * except return double the absolute difference if n is over 21.
     * @param n
     * @return
     */
    public int diff21(int n) {
    int diff = Math.abs(n-21);
    if (n>21){
        diff = 2*diff;
    }
        return diff;
    }

}
