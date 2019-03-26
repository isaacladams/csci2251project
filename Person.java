package finalproject;
/*Person Class
 * Authors: Isaac Adams, Ian Bradshaw, Michael Griego
 * CSCI-2251    Spring 2019
 * 3-21-19
 */

public class Person {
	private String name;
	private String birthDate;
	private String ssn;
	
	public Person (String name, String birthDate, String ssn) {
		this.name = name;
		this.birthDate = birthDate;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
}
