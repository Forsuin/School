import java.util.Scanner;

//*****************************************************************************
//*
//*     @author     Ian Laidlaw
//*     Date        10/31/2021
//*     Purpose     Ask the user for the radius of a circle, create a circle with that radius, then output the circle's
//*                 area, diameter, and circumference
//*
//*****************************************************************************

public class Ch06_Pc07_Laidlaw
{
   public static void main(String[] args)
   {
      final String RADIUS_PROMPT = "Please enter a value for the radius of a circle: \n";                               //Prompt for user to enter radius of first circle 
      final String ZERO_PROMPT = "Another circle is being made with a radius of 0\n";                                   //Output to let user know about second circle
      final String NEW_RAD_PROMPT = "Please enter a value for the new radius of the circle"                             //Prompt for user to enter radius of second circle
            + "with a current radius of 0: \n";
      final String FIRST_OUT = "Your first circle has: \n\ta radius of %.2f\n\tan area of %.2f\n"                       //Output for dimensions of first circle
            + "\ta diameter of %.2f\n\tand a circumference of %.2f\n";
      final String SEC_OUT = "Your second circle has: \n\ta radius of %.2f\n\tan area of %.2f\n"                        //Output for dimensions of second circle
            + "\ta diameter of %.2f\n\tand a circumference of %.2f\n";

      Scanner keyboard;                                                                                                 //input
      Ch06_Pc07_Laidlaw_Circle circle1;                                                                                 //circle made with constructor(radius)
      Ch06_Pc07_Laidlaw_Circle circle2;                                                                                 //circle made with initial radius == 0

      keyboard = new Scanner(System.in);                                                                                //actually create new scanner

      System.out.printf(RADIUS_PROMPT);                                                                                 //Print prompt for user
      circle1 = new Ch06_Pc07_Laidlaw_Circle(keyboard.nextDouble());                                                    //construct new circle with user input

      System.out.printf(ZERO_PROMPT);                                                                                   //inform user of second circle
      circle2 = new Ch06_Pc07_Laidlaw_Circle();                                                                         //construct default circle

      System.out.print(NEW_RAD_PROMPT);                                                                                 //Ask for new radius
      circle2.setRadius(keyboard.nextDouble());                                                                         //Change second circle's radius

      keyboard.close();                                                                                                 //Close input, no longer needed

      System.out.printf(FIRST_OUT, circle1.getRadius(), circle1.area(), circle1.diameter(), circle1.circumference());   //Print information about first circle

      System.out.printf(SEC_OUT, circle2.getRadius(), circle2.area(), circle2.diameter(), circle2.circumference());     //Print information about second circle
   }// main()
}// Ch06_Pc07_Laidlaw
