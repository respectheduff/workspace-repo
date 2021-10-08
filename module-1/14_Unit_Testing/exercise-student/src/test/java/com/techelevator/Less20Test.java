package com.techelevator;
import com.techelevator.Less20;
import org.junit.Test;
import org.junit.*;
import org.junit.Assert.*;

public class Less20Test {
    @Test
        public void less20HappyPath(){

        Less20 testLess = new Less20();

        boolean lessResults = testLess.isLessThanMultipleOf20(19);

        Assert.assertEquals(true, lessResults);
    }
}
