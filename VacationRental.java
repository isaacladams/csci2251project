package finalproject;
/*VacationRental subclass - A subclass of RentalProperty
 * Authors: Isaac Adams, Ian Bradshaw, Michael Griego
 * CSCI-2251    Spring 2019
 * 3-21-19
 */

public class VacationRental extends RentalProperty {
	//instance variables
	private double baseRent;
	private double baseRentVal[] = {600.00, 800.00};  //array of base values by bedrooms
	
	//constructor
	public VacationRental(String rentalType, String rentalId) {
		super(rentalType, rentalId);
	}
	
	//retrieval method
	public double getBaseRent() {
		return baseRent;
	}
	
}
