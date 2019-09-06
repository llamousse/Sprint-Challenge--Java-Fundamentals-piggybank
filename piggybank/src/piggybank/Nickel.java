package piggybank;

public class Nickel extends PiggyBank
{
	public Nickel(int quantity)
{
	super(quantity);
	this.worth = 0.05;
}

	@Override
	public String toString()
	{
		return quantity + " Nickels";
	}
}
