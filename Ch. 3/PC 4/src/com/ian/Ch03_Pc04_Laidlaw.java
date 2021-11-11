//**************************************************
//*
//*     @author     Ian Laidlaw
//*     Date        9/26/2021
//*     Purpose     Average 3 test scores and display the average and the letter grade that corresponds to it
//*
//***************************************************

//required by intellij, not required to compile. Can be deleted
package com.ian;

import java.util.Scanner;

public class Ch03_Pc04_Laidlaw {

    public static void main(String[] args) {
        final String FIRST_IN = "Input first score: ";                      //Input prompt
        final String SEC_IN = "Input second score: ";                       //Input prompt
        final String THIRD_IN = "Input third score: ";                      //Input prompt
        final String OUTPUT = "The average test score is: %.2f\n" +         //Output prompt, %.2f is the average
                              "The letter grade is: %s";                    //and %s is the letter grade
        final char A = 'A';                                                 //Letter grade
        final char B = 'B';                                                 //Letter grade
        final char C = 'C';                                                 //Letter grade
        final char D = 'D';                                                 //Letter grade
        final char F = 'F';                                                 //Letter grade
        final float THREE_DIVISOR = 3.0f;                                   //Use for division
        final int TEN = 10;                                                 //Switch case and divisor
        final int NINE = 9;                                                 //Switch case
        final int EIGHT = 8;                                                //Switch case
        final int SEVEN = 7;                                                //Switch case
        final int SIX = 6;                                                  //Switch case

        float score1, score2, score3, average;                              //holds test scores and average grade
        char letterGrade;                                                   //holds letter grade

        Scanner keyboard;                                                   //Scanner for input
        keyboard = new Scanner(System.in);                                  //Initializes scanner

        System.out.println(FIRST_IN);                                       //Prints first prompt
        score1 = keyboard.nextFloat();                                      //Reads input as float

        System.out.println(SEC_IN);                                         //Prints prompt
        score2 = keyboard.nextFloat();                                      //Reads input as float

        System.out.println(THIRD_IN);                                       //Prints prompt
        score3 = keyboard.nextFloat();                                      //Reads input as float


        average = (score1 + score2 + score3) / THREE_DIVISOR;               //Averages test scores

        switch ((int)average / TEN){                                        //Gets the tens position from average
            case TEN:                                                       //Case falls through to NINE
            case NINE:                                                      //if(case == 9)
                letterGrade = A;                                            //sets letterGrade to be 'A'
                break;                                                      //breaks out of switch statement
            case EIGHT:                                                     //if(case == 8)
                letterGrade = B;                                            //sets letterGrade to be 'B'
                break;                                                      //breaks out of switch statement
            case SEVEN:                                                     //if(case == 7)
                letterGrade = C;                                            //sets letterGrade to be 'C'
                break;                                                      //breaks out of switch statement
            case SIX:                                                       //if(case == 6)
                letterGrade = D;                                            //sets letterGrade to be 'D'
                break;                                                      //breaks out of switch statement
            default:                                                        //if case doesn't match anything else
                letterGrade = F;                                            //set letterGrade to be 'F'
                break;                                                      //breaks out of switch statement
        }//switch((int)average / 10)

        System.out.printf(OUTPUT, average, letterGrade);                    //Inserts average score and letter grade in
                                                                            //output string and prints it
    }//main()
}//Ch03_Pc04_Laidlaw
