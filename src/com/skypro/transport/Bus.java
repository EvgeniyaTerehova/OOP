package com.skypro.transport;


public class Bus extends Transport implements Competing  {
   private final  Integer pitStopTime;
   private final Integer maxSpeed;
   private final Integer bestLapTime;

   public Bus(String brand, String model, float engineVolume, Integer pitStopTime, Integer maxSpeed, Integer bestLapTime) {
      super(brand, model, engineVolume);
      this.pitStopTime = pitStopTime;
      this.maxSpeed = maxSpeed;
      this.bestLapTime = bestLapTime;
   }

   @Override
   void start() {
      System.out.println("Bus started");;
   }

   @Override
   void finish() {
      System.out.println("Bus finished");;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      return super.equals(obj);
   }

   @Override
   public void getPitStop() {
      System.out.println("Pit-stop" + pitStopTime);
   }
   @Override
   public void getBestLapTime() {
      System.out.println("Best lap time" + bestLapTime);
   }
   @Override
   public void getMaxSpeed() {
      System.out.println("Max speed" + maxSpeed);
   }
   @Override
   public String toString() {
      return   "brand: " + getBrand() +
              ", model: " + getModel() +
              ", engineVolume: " + getEngineVolume() +
              ", pitStopTime: " + pitStopTime +
              ", maxSpeed: " + maxSpeed +
              ", bestLapTime: " + bestLapTime;
   }
}
