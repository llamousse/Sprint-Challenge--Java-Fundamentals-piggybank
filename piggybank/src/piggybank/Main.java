package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		// testing - instantiate
//		System.out.println("*** Testing ***");
//		Quarter quarter = new Quarter(1);
//		Dollar dollar = new Dollar(5);
//		Nickel nickel = new Nickel(3);
//		Dime dime = new Dime(7);
//		Penny penny = new Penny();
//		System.out.println(penny.getQuantity());
//		System.out.println(quarter.getQuantity() + " Quarter");
//		System.out.println("$" + dollar.getQuantity());
//		System.out.println(nickel.getQuantity() + " Nickels");
//		System.out.println(dime.getQuantity() + " Dimes");
//		System.out.println(penny.getQuantity() + " Pennies");

		// create ArrayList to hold coins
		ArrayList<PiggyBank> piggyBank = new ArrayList<PiggyBank>();

		// add all coins to piggy bank
//		piggyBank.add(new Quarter(1));
//		piggyBank.add(new Dime(1));
//		piggyBank.add(new Dollar(5));
//		piggyBank.add(new Nickel(3));
//		piggyBank.add(new Dime(7));
//		piggyBank.add(new Dollar(1));
//		piggyBank.add(new Penny(10));

		piggyBank.add(new Penny());

		System.out.println("*** Print the contents of the Piggy Bank ***");
		piggyBank.forEach((v) -> System.out.println(v));


		System.out.println("*** Print the value of the Piggy Bank ***");
		double myValue = 0.0;
		// for each value v in array piggyBank, run getWorth() method to add
		for (PiggyBank v : piggyBank)
		{
			myValue = myValue + v.getWorth();
		}

		// initialize format
		DecimalFormat fp = new DecimalFormat("$###,###.00");

		// print out piggy bank value
		System.out.println("The piggy bank holds " + fp.format(myValue));
	}
}