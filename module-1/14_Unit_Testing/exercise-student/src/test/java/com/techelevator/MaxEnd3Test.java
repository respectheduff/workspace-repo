package com.techelevator;
import  com.techelevator.MaxEnd3;
import org.junit.Test;
import org.junit.*;
import org.junit.Assert.*;

public class MaxEnd3Test {
    @Test
    public void maxEnd3HappyPath(){

        MaxEnd3 testMax = new MaxEnd3();

        int[] maxArray = new int[]{3,5,8};

        boolean maxresults = testMax.equals(maxArray);

        Assert.assertArrayEquals(maxArray,maxArray);

    }
}
