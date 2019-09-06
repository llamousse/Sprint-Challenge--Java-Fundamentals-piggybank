package piggybank;

public class Dollar extends PiggyBank
{
	public Dollar(int quantity)
	{
		super(quantity);
		this.worth = 1;
	}

	@Override
	public String toString()
	{
		return "$" + quantity;
	}
}
