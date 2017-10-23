//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nick = JOptionPane.showInputDialog("How many nickels do you have?");
		int nickles= Integer.parseInt(nick);
		System.out.println(nickles*.05);
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt(dime);
		System.out.println(dimes*.10);
		// Ask the user how many quarters they have, and convert their answer
		String quart = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters = Integer.parseInt(quart);
		System.out.println(quarters*.25);
		// Calculate how much money the user has and save it in a double variable 
		double total = (nickles*.05) + (dimes*.10) + (quarters*.25);
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $" + total);
	}
}

