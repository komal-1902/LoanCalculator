
public class HomeLoanCalculator extends LoanCalculator {

	public HomeLoanCalculator(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	double rateCalculator(String gender, double slab) {
		// TODO Auto-generated method stub
		double rate = 0;
		if(slab >= 1 && slab < 50){
			rate = 9.25;
		}
		else if(slab >= 50 && slab < 100){
			rate = 9.5;
		}
		else if(slab > 100){
			rate = 9.75;
		}
		if(gender.equalsIgnoreCase("female")){
			rate = rate - 0.5;
		}
		return rate;
	}

}
