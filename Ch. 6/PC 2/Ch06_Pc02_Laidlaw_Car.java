//**************************************************
//*
//*     @author     Ian Laidlaw
//*     Date        10/24/2021
//*     Purpose     Create a class called Car that has 3 fields:
//*                 int yearModel
//*                 String make
//*                 int speed
//*                 It should also have a constructor that takes in a car's year model and make and assign them to 
//*                 their respective fields, accessors to get the value from each field, and an accelerate method
//*                 and brake methods, which add 5 to the speed and subtract 5 respectively.
//*
//***************************************************

public class Ch06_Pc02_Laidlaw_Car
{
   private int yearModel;                                               //year car was made
   private String make;                                                 //brand and model of car
   private int speed;                                                   //current speed of car

   Ch06_Pc02_Laidlaw_Car(int yearModel, String make)
   {
      this.yearModel = yearModel;                                       //assigns provide yearModel to member variable. this.yearModel used for clarity
      this.make = make;                                                 //assigns make to member variable
      this.speed = 0;                                                   //sets the car to be standing still
   }//Ch06_Pc02_Laidlaw()

   public int getYearModel()
   {
      return yearModel;                                                 //returns this car object's yearModel variable
   }//getYearModel()

   public String getMake()
   {
      return make;                                                      //returns this car object's make variable
   }//getMake()

   public int getSpeed()
   {
      return speed;                                                     //returns this car object's speed variable
   }//getSpeed()

   public void accelerate()
   {
      speed += 5;                                                       //increments this car's speed by 5
   }//accelerate()

   public void brake()
   {
      speed -= 5;                                                       //decrements this car's speed by
   }//brake()
}
