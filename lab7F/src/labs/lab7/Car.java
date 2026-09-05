/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs.lab7;

/**
 *
 * @author i2wahid
 */

public class Car extends Vehicle {
    private boolean automatic;

    public Car(String plateNumber, String model, int year, boolean automatic) {
        // TO DO
           super(plateNumber, model, year);
           this.automatic=automatic;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    // Overriding toString
    @Override
    public String toString() {
        return "Car: " + super.toString() +
               (automatic ? " [Automatic]" : " [Manual]");
    }

    
    @Override
    public double calculateRentalPrice(int days) {
        //TO DO. complete the code such that Dayli Rate for automatic cars are 65.0 an for non automatic cars are 55.0. 
        if(automatic){ //: if(automatic==true){
            return days*65.0; //if car is automatic
        }
        else{
            return days *55.0; //car is manual
        }
    }

  
    @Override
    public double calculateInsurancePremium(int days) {
        // TO DO. complete the code, such taht daily insurence date to be the vehicles base, increased by 10% 
        double base = super.calculateInsurancePremium(days);
        return base*1.10;
    }


    // Overloaded version with GPS option
    public double calculateRentalPrice(int days, boolean gpsIncluded) {
        double base = calculateRentalPrice(days);
        if (gpsIncluded) {
            base += 10.0 * days; // GPS daily fee
        }
        return base;
    }

    // Static method HIDING superclass static method
    public static void printVehicleType() {
        System.out.println("Car");
    }
    
}
