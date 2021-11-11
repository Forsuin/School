//*****************************************************************************
//*
//*     @author     Ian Laidlaw
//*     Date        11/07/2021
//*     Purpose     Demonstrate each of the methods in the Number class. Contents read values from numbers.txt, 
//*                 initializes ArrayList with those files
//*                 Input calls appropriate setter pasisn in the correct array information
//*                 Output sections displays a report of lowest, highest, total, and average of numbers, 
//*                 has report header information
//*                 I'm assuming that this class is supposed to exist, but the book doesn't mention it and 
//*                 your specifications aren't super clear on what you want
//*****************************************************************************

import java.io.File;
import java.io.FileNotFoundException; //imports exception for try/catch block
import java.io.PrintWriter; //imports writer
import java.util.Random; //imports random
import java.util.Scanner; //imports scanner

public class Ch07_Pc11_Laidlaw_NumberTest {
   public static void main(String[] args) throws FileNotFoundException {

      final int TEST_SIZE = 53;

      File file = new File("numbers.txt");

      PrintWriter writer = new PrintWriter(file); // creates a new writer, either opens or creates
      // numbers.txt

      Scanner reader = new Scanner(file); // opens a new scanner reading numbers.txt

      Ch07_Pc11_Laidlaw_Number arr = new Ch07_Pc11_Laidlaw_Number(); // creates new rebranded ArrayList object

      Random rand = new Random(); // creates new random object

      for (int i = 0; i < TEST_SIZE; i++) {
         writer.printf("%d%s", rand.nextInt(1000001), (i < TEST_SIZE - 1) ? "\n" : ""); // writes 50 random numbers to
                                                                                        // file for test data
      }

      writer.close(); // closes writer as it's no longer needed

      while (reader.hasNextInt()) {
         arr.add(reader.nextInt());
      }

      reader.close(); // close scanner, no longer needed

      System.out.printf("Lowest number: %d\n", arr.getLowest()); // prints lowest number in array
      System.out.printf("Highest number: %d\n", arr.getHighest()); // prints highest number in array
      System.out.printf("Total value: %d\n", arr.getTotal()); // prints the total value of array
      System.out.printf("Average: %.2f", arr.getAverage()); // prints average of array

   }
}