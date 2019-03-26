package finalproject;
/*Tenant Class
 * Authors: Isaac Adams, Ian Bradshaw, Michael Griego
 * CSCI-2251    Spring 2019
 * 3-21-19
 */

public class Tenant {
	private String[] names;
	
	public Tenant(Person[] person) {
		int counter = 0;
		for(Person p:person) {
			names[counter] = p.getName();
			counter++;
		}
	}
}
