package piggybank;

public class Dime extends PiggyBank
{
	public Dime(int quantity)
	{
		super(quantity);
		this.worth = 0.10;
	}

	public Dime()
	{
		this.quantity = 1;
		this.worth = 0.10;
	}

	public String toStringOne()
	{
		return quantity + " Dime";
	}

	@Override
	public String toString()
	{
		if (this.quantity > 1)
		{
			return quantity + " Dimes";
		} else
		{
			return toStringOne();
		}
	}
}
