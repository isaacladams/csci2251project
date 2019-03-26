package finalproject;
/*RentalProperty Class
 * Authors: Isaac Adams, Ian Bradshaw, Michael Griego
 * CSCI-2251    Spring 2019
 * 3-21-19
 */

public abstract class RentalProperty {
	//instance variables
	private String rentalType;
	private String address;
	private String rentalId;
	private double rentalCharges;
	private String rentDue;
	private int status;
	private Tenant tenant;
	
	//constructor
	public RentalProperty(String rentalType, String rentalId) {
		this.rentalType = rentalType;
		this.rentalId = rentalId;
	}
	
	//retrieval methods
	public String getRentalType() {
		return rentalType;
	}
	
	public String getRentalId() {
		return rentalId;
	}

}
