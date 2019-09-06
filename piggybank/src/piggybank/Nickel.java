package piggybank;

public class Nickel extends PiggyBank
{
	public Nickel(int quantity)
	{
		super(quantity);
		this.worth = 0.05;
	}

	public Nickel()
	{
		this.quantity = 1;
		this.worth = 0.05;
	}

	public String toStringOne()
	{
		return quantity + " Nickel";
	}

	@Override
	public String toString()
	{
		if (this.quantity > 1)
		{
			return quantity + " Nickels";
		} else
		{
			return toStringOne();
		}
	}
}
