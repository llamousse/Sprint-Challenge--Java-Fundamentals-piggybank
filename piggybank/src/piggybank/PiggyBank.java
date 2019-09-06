package piggybank;

public abstract class PiggyBank
{
	// fields
	int quantity;
	double worth;

	public PiggyBank(int quantity)
	{
		this.quantity = quantity;
	}

	public PiggyBank()
	{
		this.quantity = quantity;
		this.worth = worth;
	}

	// methods
	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public double getWorth()
	{
		return worth * quantity;
	}

	public void setWorth(double worth)
	{
		this.worth = worth;
	}
}
