import java.util.Scanner;

//*****************************************************************************
//*
//*     @author     Ian Laidlaw
//*     Date        10/24/2021
//*     Purpose     Create a Car object and call the accelerate method 5 times. After each call, display the current speed.
//*                 Then call the brake method five times, displaying the speed after each call
//*
//*****************************************************************************

public class Ch06_Pc02_Laidlaw
{
   public static void main(String[] args)
   {
      final String MAKE_PROMPT = "Please enter the make of a car: ";                   //Prompt for entering make of car
      final String YEAR_PROMPT = "Please enter the year the car was made: ";           //Prompt for entering year of car
      final String OUTPUT = "The %d %s's current speed is: %d mph\n";                  //Prompt for outputing car's speed

      int yearModel;                                                                   //year of car
      String make;                                                                     //make of car

      Ch06_Pc02_Laidlaw_Car car;                                                       //declares a new car
      Scanner keyboard = new Scanner(System.in);                                       //Creates a new scanner for input

      System.out.printf(MAKE_PROMPT);                                                  //Prints prompt for make of car
      make = keyboard.nextLine();                                                      //Reads input for make

      System.out.printf(YEAR_PROMPT);                                                  //Prints prompt for year of car
      yearModel = keyboard.nextInt();                                                  //Reads input for the year

      keyboard.close();                                                                //close keyboard as it's no longer needed

      car = new Ch06_Pc02_Laidlaw_Car(yearModel, make);                                //create new car with data inputted

      for (int i = 0; i < 5; i++)
      {
         car.accelerate();                                                             //accelerate the car by 5 mph
         System.out.printf(OUTPUT, yearModel, make, car.getSpeed());                   //Prints the current speed of car
      }//for(int i =0; i < 5; i++)

      for (int i = 0; i < 5; i++)
      {
         car.brake();                                                                  //slows car by 5 mph
         System.out.printf(OUTPUT, yearModel, make, car.getSpeed());                   //Prints the current speed of car
      }//Prints the current speed of car
   }//main()
}//Ch06_Pc02_Laidlaw
