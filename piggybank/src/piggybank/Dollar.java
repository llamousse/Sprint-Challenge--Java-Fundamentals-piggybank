package piggybank;

public class Dollar extends PiggyBank
{
	public Dollar(int quantity)
	{
		super(quantity);
		this.worth = 1;
	}

	public Dollar()
	{
		this.quantity = 1;
		this.worth = 1.00;
	}

	@Override
	public String toString()
	{
		return "$" + quantity;
	}
}
