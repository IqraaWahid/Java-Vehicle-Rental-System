/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs.lab7;

/**
 *
 * @author i2wahid
 */

public class RentalContract {
    private Rentable rentable;        
    private int days;
    private boolean insuranceAdded;

    public RentalContract(Rentable rentable, int days, boolean insuranceAdded) {
        this.rentable = rentable;
        this.days = days;
        this.insuranceAdded = insuranceAdded;
    }

    public double calculateTotalPrice() {
        //To DO. Complete this line of the code, such that the baseprice is found.
        double basePrice = rentable.calculateRentalPrice(days); /////
        double insurance = 0.0;

   
        if (insuranceAdded) {
            
            insurance = ((Insurable) rentable).calculateInsurancePremium(days);
        }

        return basePrice + insurance;
    }

    public void printSummary() {
        System.out.println("=== Rental Contract Summary ===");
        System.out.println("Vehicle type: " + rentable.getClass().getSimpleName());
        System.out.println("Days: " + days);
        System.out.println("Insurance added: " + insuranceAdded);
        System.out.println("Total price: " + calculateTotalPrice());
        System.out.println("===============================");
    }
}

