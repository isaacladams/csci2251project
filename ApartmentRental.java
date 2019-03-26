package finalproject;
/*ApartmentRental subclass - A subclass of RentalProperty
 * Authors: Isaac Adams, Ian Bradshaw, Michael Griego
 * CSCI-2251    Spring 2019
 * 3-21-19
 */

public class ApartmentRental extends RentalProperty {
	//instance variables
	private double baseRent;
	private double baseRentVal[] = {600.00, 800.00};  //array of base values by bedrooms
	
	//constructor
	public ApartmentRental(String rentalType, String rentalId) {
		super(rentalType, rentalId);
	}
	
	//retrieval method
	public double getBaseRent() {
		return baseRent;
	}
	
}
