//**************************************************
//*
//*     @author     Ian Laidlaw
//*     Date        10/17/2021
//*     Purpose     Program asks users for # of rooms to be painted and the price of paint/gallon. Also ask for
//*                 square feet of wall space in each room. Program should have methods that return:
//*                     The number of gallons of paint required
//*                     The hours of labor required
//*                     The cost of the paint
//*                     The labor charges
//*                     The total cost of the paint
//*                 Then it should display the data to the screen
//*                 The company takes 8 hours to paint 115 ft^2 of wall space with 1 gallon of paint.
//*                 They charge $18.00 an hour for labor
//*
//***************************************************       

//I'm using VSCode for this and the Java extension comes with a formatter, sorry if any of the comments are a bit wonky.

import java.util.Scanner;

public class Ch05_Pc04_Laidlaw
{
    public static void main(String[] args)
    {
        int numRooms;                                                                           // number of rooms to be painted
        float sqFeet = 0.0f;                                                                    // square footage of rooms
        float numGallons;                                                                       // amount of paint needed
        float paintPricePerGallon;                                                              // price of 1 gallon of paint
        float laborTime;                                                                        // how long to paint rooms
        float totalPaintCost;                                                                   // toal price of all paint
        float laborCost;                                                                        // cost of labor

        Scanner keyboard = new Scanner(System.in);                                              // input

        final String GAL_PRICE = "Please enter the price of paint per gallon (Ex: 13.50): \n";  // Prompt for paint/gal price
        final String NUM_ROOMS = "Please enter the number of rooms you want painted: \n";       // Prompt for number of rooms
        final String SQFT_PROMPT = "For room %d, please enter the square footage: \n";          // Prompt for each rooms wall square footage
        final String GAL_REQ_OUT = "The number of gallons of paint required is %.2f gallons\n"; // # of gallons required output
        final String LAB_TIME_OUT = "The time to paint everything will be %.2f hours\n";        // Amount of time to paint everything
        final String PAINT_COST_OUT = "The cost of the paint is $%.2f\n";                       // Cost to paint rooms output
        final String LAB_COST_OUT = "The cost of labor is $%.2f\n";                             // Labor cost output
        final String TOTAL_COST_OUT = "The total cost of the job is $%.2f";                     // Total cost of job

        final int ZERO = 0;                                                                     // Zero
        final int ONE = 1;                                                                      // One

        System.out.printf(GAL_PRICE);                                                           // Prints price/gallon prompt
        paintPricePerGallon = checkInput(keyboard.nextFloat(), keyboard);                       // Reads and validates input

        System.out.printf(NUM_ROOMS);                                                           // Prints number of rooms prompt
        numRooms = checkInput(keyboard.nextInt(), keyboard);                                    // Reads and validates input

        for (int i = ZERO; i < numRooms; i++)                                                   // Loops through each room
        {
            System.out.printf(SQFT_PROMPT, i + ONE);                                            // Asks for that rooms wall square footage
            sqFeet += checkInput(keyboard.nextFloat(), keyboard);                               // Reads and validates input
        }

        // Kind of cool, didn't know assignments were allowed inside a function call
        System.out.printf(GAL_REQ_OUT, numGallons = checkInput(gallonsOfPaintReq(sqFeet), keyboard));   // Prints out # of gallons required
                                                                                                        // and assigned that to numGallons
        System.out.printf(LAB_TIME_OUT, laborTime = laborTime(sqFeet));                                 // prints out time needed to paint
                                                                                                        // everything and assigns it to
                                                                                                        // laborTime
        System.out.printf(PAINT_COST_OUT, totalPaintCost = paintCost(numGallons, paintPricePerGallon)); // Prints the cost of paint needed
                                                                                                        // and assigns it
        System.out.printf(LAB_COST_OUT, laborCost = laborCost(laborTime));                      // Prints out the cost of labor and assigns
                                                                                                // it
        System.out.printf(TOTAL_COST_OUT, totalCost(totalPaintCost, laborCost));                // Prints out total cost of job

        keyboard.close();                                                                       // Closes keyboard
    }// main()

    private static float checkInput(float nextFloat, Scanner keyboard)
    {
        final String VALIDATE_PROMPT = "Please enter a number greater than zero: \n";           // Prompt for entering correct input
        final float ZEROF = 0.0f;                                                               // Zero, as a float

        while (nextFloat <= ZEROF)                                                              // checks if input is <= 0
        {
            System.out.printf(VALIDATE_PROMPT);                                                 // Prints prompt
            nextFloat = keyboard.nextFloat();                                                   // Reads input and assigns it to original
                                                                                                // input variable
        }

        return nextFloat;                                                                       // returns validated input value so it can
                                                                                                // be assigned
    } // checkInput(float nextFloat, Scanner keyboard)

    private static int checkInput(int nextInt, Scanner keyboard)
    {
        final String VALIDATE_PROMPT = "Please enter a number greater than zero: \n";           // Prompt for entering correct input;
        final int ZERO = 0;                                                                     // Zero

        while (nextInt <= ZERO)                                                                 // checks if input is <= 0
        {
            System.out.printf(VALIDATE_PROMPT);                                                 // Prints prompt
            nextInt = keyboard.nextInt();                                                       // Reads and assigns new input to original
                                                                                                // input variable
        }

        return nextInt;                                                                         // returns validated input value
    } // checkInput(int nextInt, Scanner keyboard)

    private static float gallonsOfPaintReq(float sqFeet)
    {
        final float ONE_FIFTHTEENF = 115.0f;                                                    // 115 as a float
        final float FOURF = 4.0f;                                                               // 4 as a float
        // Rounder answer to nearest quart (4 quarts = 1 gallon)

        // x.00 < paintNeeded <= x.25
        // x.25 < paintNeeded <= x.50
        // x.50 < paintNeeded <= x.75
        // x.75 < paintNeeded <= x.00 + 1

        // 300 ft^2 / 115 ft^2/gal ~= 2.6086 gal
        // 2.6086 gal * 4 quarts = 10.4347 quarts
        // Math.ceil(10.4347 quarts) = 11 quarts round to next nearest quart
        // 11 quarts / 4.0f quarts = 2.75 gallons of paint

        float rawGal = sqFeet / ONE_FIFTHTEENF;                                                 // divides square footage by 115 ft^2 per
                                                                                                // gallon
        return (float) (Math.ceil(rawGal * FOURF) / FOURF);                                     // converts to quarts, rounds to next
                                                                                                // highest, then back to gallons, then
                                                                                                // returns
    } // gallonsOfPaintReq(float sqFeet)

    private static float laborTime(float sqFeet)
    {
        final float EIGHTF = 8.0f;                                                              // 8 as a float
        final float ONE_FIFTHTEENF = 115.0f;                                                    // 115 as a float

        return sqFeet * (EIGHTF / ONE_FIFTHTEENF);                                              // Ex: 300 ft^2 * 8 hrs / 115 ft^2 ft^2
                                                                                                // cancel out, left with hours to paint
                                                                                                // Divides input by the square feet that can
                                                                                                // be painted per hour
    } // laborTime(float sqFeet)

    private static float paintCost(float numGallons, float paintPrice)
    {
        return numGallons * paintPrice;                                                         // returns the total cost of buying paint
    } // paintCost(float numGallons, float paintPrice)

    private static float laborCost(float laborTime)
    {
        final float EIGHTTEENF = 18.00f;                                                        // 18 as a float

        return laborTime * EIGHTTEENF;                                                          // returns the cost of laborers time to
                                                                                                // paint rooms
    } // laborCost(float laborTime)

    private static float totalCost(float paintCost, float laborCost)
    {
        return paintCost + laborCost;                                                           // returns to combined cost of paint and
                                                                                                // labor
    } // totalCost(float paintCost, float laborCost)

}// Ch05_Pc04_Laidlaw
