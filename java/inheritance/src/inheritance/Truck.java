/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
class Truck extends Vehicle
{
   private double tonnage;
   private String color;
   Truck(String make, String model, int year, double tonnage,String color)
   {
      super(make, model, year);
      this.tonnage = tonnage;
      this.color=color;
   }

   double getTonnage()
   {
      return tonnage;
   }

   void print()
   {
      super.print();
      System.out.println("Tonnage: " + tonnage+ ", Color: "+color);
   }
}
