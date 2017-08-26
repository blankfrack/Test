package com.blankfrack.test;

/**
 * @author Blankfrack
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Doing nothing
		System.out.println("From IntelliJ Clean");
		displayMessage();
		displayAnotherMessage("Test message GITHUB");
		displayEclipseMessage();
	}

	/**
	 * 
	 */
	public static void displayMessage(){
		System.out.println("DisplayMessage");		
	}
	
	public static void displayAnotherMessage(String pMsg) {
		System.out.println(pMsg);
	}

	public static void displayEclipseMessage() {
		System.out.println("Eclipse");
	}
	
}
