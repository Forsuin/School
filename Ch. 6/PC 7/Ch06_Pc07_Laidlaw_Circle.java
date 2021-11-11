
//*****************************************************************************
//*
//*     @author     Ian Laidlaw
//*     Date        10/31/2021
//*     Purpose     Create a circle class that has two fields:
//*                     double radius
//*                     final double PI = 3.14159
//*                 The class should also have the following methods:
//*                     2 constructors- one accepts the radius of a circle as an argument, the other sets radius field to 0.0
//*                     get/setRadius
//*                     area- returns area = PI * r^2
//*                     diameter- returns 2 * radius
//*                     circumference- returns 2 * PI * radius
//*
//*****************************************************************************

public class Ch06_Pc07_Laidlaw_Circle
{
   private double radius;                          //radius of this circle
   private final double PI = 3.14159;              //constant value of pi

   Ch06_Pc07_Laidlaw_Circle()
   {
      radius = 0.0;                                //default constructer, set radius to 0
   }//Ch06_Pc07_Laidlaw_Circle()

   Ch06_Pc07_Laidlaw_Circle(double radius)
   {
      this.radius = radius;                        //construct circle with inputted radius
   }//Ch06_Pc07_Laidlaw_Circle(double radius)

   void setRadius(double radius)
   {
      this.radius = radius;                        //change radius to inputted one
   }//setRadius(double radius)

   double getRadius()
   {
      return radius;                               //return this circles radius
   }//getRadius()

   double area()
   {
      return PI * radius * radius;                 //calculate area of circle
   }//area()

   double diameter()
   {
      return radius * 2;                           //calculate diameter
   }//diameter()

   double circumference()
   {
      return 2 * PI * radius;                      //calculate circumference of circle
   }//circumference()
}//Ch06_Pc07_Laidlaw_Circle
