package com.techelevator;
import com.techelevator.AnimalGroupName;
import static org.junit.Assert.*;
import org.junit.Test;


public class AnimalGroupNameTests {
    @Test
    public void testAnimalName () {
        AnimalGroupName agn = new AnimalGroupName();
        assertEquals( agn.getHerd("giraffe") , "Tower");
        assertEquals( agn.getHerd("")  ,  "unknown");
        assertEquals( agn.getHerd("walrus" ) ,  "unknown");
        assertEquals( agn.getHerd("Rhino") ,  "Crash");
        assertEquals( agn.getHerd("rhino")  ,  "Crash");
        assertEquals( agn.getHerd("elephants")  ,  "unknown");

    }


}
