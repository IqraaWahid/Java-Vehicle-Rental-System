/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs.lab7;

/**
 *
 * @author i2wahid
 */

public class Truck  extends Vehicle {
    private double loadCapacityInTons;

    public Truck(String plateNumber, String model, int year, double loadCapacityInTons) {
      //TO DO
      super(plateNumber, model, year);
      this.loadCapacityInTons = loadCapacityInTons;
    }

    public double getLoadCapacityInTons() {
        return loadCapacityInTons;
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString() +
               " [Capacity: " + loadCapacityInTons + " tons]";
    }

    @Override
    public double calculateRentalPrice(int days) {
        // TO DO  when a daily rate  starts at 90 dollars and increases by 10 dollars for each ton of load capacity.
        return (90 + (10*loadCapacityInTons))*days;
    }

    @Override
    public double calculateInsurancePremium(int days) {
       // TO Do: the daily rate is the base insurance rate increased by 50 percent
       return super.calculateInsurancePremium(days)*1.50;
    }

    public static void printVehicleType() {
        System.out.println("Truck");
    }
    
}
