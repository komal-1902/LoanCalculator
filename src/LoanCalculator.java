
public abstract class LoanCalculator
{
	private Person person;
	
	public LoanCalculator(Person person) {
		super();
		this.person = person;
	}

	public EMI calculateEMI()
	{
		return new EMI(12, 22.5, true);
		
	}
	
	abstract double rateCalculator(String gender, double slab);
}
