package main.src;

/**
*
* @author Nicholas1
*
* This is the Test Logic
*/
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

public class MemberPointsTest {

  // Each parameter should be placed as an argument here
  // Every time runner triggers, it will pass the arguments
  // from parameters we defined in primeNumbers() method

  

  // This test will run 4 times since we have 5 parameters defined
  @Test
  public void testcalculator() {
     System.out.println("test cost is : " + 120);
     assertEquals(90,
     calculator.calc(120));
  }
}
