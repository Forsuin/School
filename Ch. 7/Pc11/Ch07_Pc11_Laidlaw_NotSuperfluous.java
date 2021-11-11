//*****************************************************************************
//*
//*     @author     Ian Laidlaw
//*     Date        11/07/2021
//*     Purpose     Create an ArrayList that is initialized with test data. Use any primitive data type. 
//*                 The program should have the following methods:
//*                     getTotal(): Accepts a 1D array as its argument and return the total of the values in the array
//*                     getAverage(): Accepts a 1D array and returns the average of its values
//*                     getHighest(): Accepts a 1D array and returns its highest value
//*                     getLowest(): Accepts a 1D array and returns its lowest value 
//*****************************************************************************

import java.util.ArrayList; //imports ArrayList
import java.util.Random; //Imports Random

public class Ch07_Pc11_Laidlaw_NotSuperfluous {
   public static void main(String[] args) {
      ArrayList<Integer> testData = new ArrayList<Integer>(); // creates a new ArrayList of integers

      Random rand = new Random(); // creates a new random object

      for (int i = 0; i < 50; i++) // loops through the desired size of array
      {
         testData.add(rand.nextInt(1000001)); // adds new random number [0, 1,000,000] to end of array
      }

      System.out.printf("Total = %d\n", getTotal(testData)); // prints the total value of array
      System.out.printf("Average = %.2f\n", getAverage(testData)); // prints the average value of array
      System.out.printf("Highest = %d\n", getHighest(testData)); // prints highest value in array
      System.out.printf("Lowest = %d", getLowest(testData)); // prints lowest number in array
   }

   private static long getTotal(ArrayList<Integer> arr) {
      int sum = 0; // value to return

      for (int i : arr) // loop over all values in array
      {
         sum += i; // add value to sum
      }

      return sum; // return total value of array
   }

   private static float getAverage(ArrayList<Integer> arr) {
      return getTotal(arr) / arr.size(); // gets the total value of array and divides by number of items in array
   }

   private static int getHighest(ArrayList<Integer> arr) {
      int temp = 0; // value to return

      for (int i : arr) // loop over all elements in array
      {
         if (i > temp) // check if its greater than current highest number
         {
            temp = i; // if it is higher, set as new highest number
         }
      }

      return temp; // return highest number
   }

   private static int getLowest(ArrayList<Integer> arr) {
      int temp = Integer.MAX_VALUE; // sets to be highest possible number for an integer

      for (int i : arr) // loops over all elements of array
      {
         if (i < temp) // check if element is lower than current lowest number
         {
            temp = i; // if it is lower, set as new lowest number
         }
      }

      return temp; // return lowest number
   }
}