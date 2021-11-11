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

public class Ch07_Pc11_Laidlaw_Number {

   private ArrayList<Integer> arr; // field to hold array

   public Ch07_Pc11_Laidlaw_Number() {
      arr = new ArrayList<Integer>(); // constructor to initialize empty array
   }

   public void add(int num) {
      arr.add(num); // add number to end of array
   }

   public long getTotal() {
      int sum = 0; // value to return

      for (int i : arr) // loop over all values in array
      {
         sum += i; // add value to sum
      }

      return sum; // return total value of array
   }

   public float getAverage() {
      return getTotal() / arr.size(); // gets the total value of array and divides by number of items in array
   }

   public int getHighest() {
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

   public int getLowest() {
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