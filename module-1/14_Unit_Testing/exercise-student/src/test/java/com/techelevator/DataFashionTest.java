package com.techelevator;
import com.techelevator.DateFashion;
import org.junit.Test;
import org.junit.*;
import org.junit.Assert.*;

public class DataFashionTest {
  @Test
    public void dateFashionHappyPath(){

      DateFashion testDate = new DateFashion();

      boolean dateResults = testDate.equals(8);

      Assert.assertEquals(false, dateResults);
  }
}
