package com.skypro.transport;


public class Bus extends Transport  {

   public Bus(String brand, String model, int yearOfRelease, String countryOfProduction, String bodyColor, int maxMovementSpeed) {
      super(brand, model, yearOfRelease, countryOfProduction, bodyColor, maxMovementSpeed);
   }

   @Override
   public String toString() {
      return    "brand: " + brand +
              ", model: " + model +
              ", yearOfRelease: " + yearOfRelease +
              ", countryOfProduction: " + countryOfProduction +
              ", bodyColor: " + bodyColor +
              ", maxMovementSpeed: " + maxMovementSpeed;

   }
}
