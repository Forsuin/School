//**************************************************
//*
//*     @author     Ian Laidlaw
//*     Date        10/10/2021
//*     Purpose     Generate random number and ask user to guess what it is. If guess is higher, display "Too high, try again"
//*                 If lower, display "Too low, try again". The program loops until the correct answer is guessed.
//*                 Also keep track of the number of guesses the user has made
//*
//***************************************************

//not required to compile, an IntelliJ thing
package com.ian;

import java.util.Random;                                             //imports the Random class
import java.util.Scanner;                                            //imports the Scanner class

public class Ch04_Pc17_Laidlaw {                                     //Creates class

    public static void main(String[] args) {                         //main entry point of program

        final String INPUT_PROMPT = "Enter a guess to find a number in the range of 1-1000\n";   //Prompt to ask user to enter their guess
        final String GUESS_OOR = "Input out of range. " +
                "Please enter a number in the range 1-1000:\n";                                  //Output if guess is out of range
        final String GUESS_HIGH = "Too high, try again\n";                                      //Output if guess is too high
        final String GUESS_LOW = "Too low, try again\n";                                        //Output if guess is too low
        final String GUESS_CORRECT = "You guessed the correct number of %d!\n";                 //Output if guess is correct
        final int THOUSAND = 1000;                                                              //The number 100
        final int ONE = 1;                                                                      //The number 1

        boolean isNumberFound = false;                               //flag for if correct number has been guessed
        int guessNum;                                                //holds the user's input guess
        int randNum;                                                 //the random number user has to find
        int numGuesses = 0;

        Random random = new Random();                                //creates new random class object
        Scanner keyboard = new Scanner(System.in);                   //creates new scanner to read from the keyboard

        randNum = random.nextInt(THOUSAND) + ONE;                    //generates a random number from 0-999, 1 is added for 1-1000


        do{
            if(numGuesses == 0){
                System.out.printf(INPUT_PROMPT);
            }

            guessNum = keyboard.nextInt();
        }while(!isNumberFound);


        System.out.printf(INPUT_PROMPT);                             //prints out initial input prompt
        while (!isNumberFound){                                      //loop until correct number has been guessed
            guessNum = keyboard.nextInt();                           //read input number from keyboard

            if(guessNum < ONE || guessNum > THOUSAND){               //check if guess is outside range
                System.out.printf(GUESS_OOR);                        //print out of range prompt
                continue;                                            //skip to next loop
            }//if (guessNum < ONE || guessNum > HUNDRED)

            if (guessNum > randNum){                                 //check if guess is too high
                System.out.printf(GUESS_HIGH);                       //print Too high prompt
            }//if (guessNum > randNum)
            else if(guessNum < randNum){                             //check if guess is too low
                System.out.printf(GUESS_LOW);                        //print Too low prompt
            }//else if (guessNum < randNum)
            else{                                                    //if not high and not low, number is correct
                System.out.printf(GUESS_CORRECT, randNum);           //print correct number prompt and the correct number
                isNumberFound = true;                                //set flag to stop loop
            }//else
        }//while (!isNumberFound)
    }//main()
}//Ch04_Pc17_Laidlaw
