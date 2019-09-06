package piggybank;

public class Dime extends PiggyBank
{
	public Dime(int quantity)
	{
		super(quantity);
		this.worth = 0.10;
	}

	@Override
	public String toString()
	{
		return quantity + " Dimes";
	}
}
