package finalproject;
/*SingleFamilyRental subclass - A subclass of RentalProperty
 * Authors: Isaac Adams, Ian Bradshaw, Michael Griego
 * CSCI-2251    Spring 2019
 * 3-21-19
 */

public class SingleFamilyRental extends RentalProperty {
	private double baseRent;
	private double baseRentVal[] = {900.00, 1100.00, 1300.00};  //array of base values by bedrooms
	
	//constructor
	public SingleFamilyRental(String rentalType, String rentalId, int bedrooms) {
		super(rentalType, rentalId);
	}
	
	//retrieval method
	public double getBaseRent() {
		return baseRent;
	}
	
}
