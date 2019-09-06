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

	@Override
	public String toString()
	{
		return quantity + " Pennies";
	}
}
