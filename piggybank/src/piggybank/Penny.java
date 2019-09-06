package piggybank;

public class Penny extends PiggyBank
{
	public Penny(int quantity)
	{
		super(quantity);
		this.worth = 0.01;
	}

	public Penny()
	{
		this.quantity = 1;
		this.worth = 0.01;
	}

	public String toStringOne()
	{
		return quantity + " Penny";
	}

	@Override
	public String toString()
	{
		if (this.quantity > 1)
		{
			return quantity + " Pennies";
		} else
		{
			return toStringOne();
		}
	}
}
