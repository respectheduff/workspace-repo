package com.techelevator;
import com.techelevator.CigarParty;
import org.junit.Test;
import org.junit.*;
import org.junit.Assert.*;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CigarPartyTests {
    @Test
    public void cigarPartyHappyPath() {

        CigarParty testParty = new CigarParty();

        boolean testResults = testParty.haveParty(45, false);

        Assert.assertEquals(true, testResults);
    }
}