package com.techelevator;
import com.techelevator.Lucky13;
import org.junit.Test;
import org.junit.*;
import org.junit.Assert.*;

public class Lucky13Test {
 @Test
    public void lucky13HappyPath(){

     Lucky13 testLucky = new Lucky13();

     int[] testArray = new int[]{0,2,4};

     boolean luckyResults = testLucky.getLucky(testArray);

     Assert.assertEquals(true, luckyResults);

 }
}
