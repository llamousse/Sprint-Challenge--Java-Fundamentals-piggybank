package piggybank;

public class Quarter extends PiggyBank
{
	public Quarter(int quantity)
	{
		super(quantity);
		this.worth = 0.25;
	}

	public Quarter()
	{
		this.quantity = 1;
		this.worth = 0.25;
	}

	public String toStringOne()
	{
		return quantity + " Quarter";
	}

	@Override
	public String toString()
	{
		if (this.quantity > 1)
		{
			return quantity + " Quarters";
		} else
		{
			return toStringOne();
		}
	}
}
