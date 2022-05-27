package main.src;


/**
 *
 * @author Nicholas1
 *
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(MemberPointsTest.class);

      for (Failure failure : result.getFailures()) {
         System.out.println("Printing testing failures: "+failure.toString());
      }

      System.out.println("Printing testing class successful: "+result.wasSuccessful());//did all tests run true?
      System.out.println("Printing testing class Run Count: "+result.getRunCount());//returns the number of test cases
   }
}