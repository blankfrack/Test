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
		System.out.println("Hello World !!!");
		
		Client wFreeClient = new FreeClient();
		wFreeClient.setName("Bobby inc.");
		
		Client wPayingClient = new PayingClient();
		wPayingClient.setName("George");		
		
		System.out.println(wFreeClient.getName() + " / " + wPayingClient.getName());
		
		System.out.println("Program is shutting down");
	}

}
