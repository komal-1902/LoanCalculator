
public class PersonalLoanCalculator extends LoanCalculator
{
	public PersonalLoanCalculator(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	double rateCalculator(String gender, double slab) {
		// TODO Auto-generated method stub
		double rate = 0;
		if(slab >= 1 && slab < 5){
			rate = 14;
		}
		else if(slab >= 5){
			rate = 18;
		}
		if(gender.equalsIgnoreCase("female")){
			rate = rate - 0.5;
		}
		return rate;
	}

}
