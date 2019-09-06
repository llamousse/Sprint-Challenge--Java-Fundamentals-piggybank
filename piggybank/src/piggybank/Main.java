package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		// create ArrayList to hold coins
		ArrayList<PiggyBank> piggyBank = new ArrayList<PiggyBank>();

		// add all coins to piggy bank
		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(5));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Dime(7));
		piggyBank.add(new Dollar());
		piggyBank.add(new Penny(10));

		System.out.println();
		System.out.println("*** Print the contents of the Piggy Bank ***");
		piggyBank.forEach((v) -> System.out.println(v.toString()));

		System.out.println();

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